package com.cardinal.tech.bzfx.util;


import com.cardinal.tech.bzfx.bean.ao.JwtUserAO;
import com.cardinal.tech.bzfx.bean.bo.TokenBO;
import com.cardinal.tech.bzfx.entity.User;
import com.cardinal.tech.bzfx.dao.UserMapper;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.internal.engine.DefaultClockProvider;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.time.Clock;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import static com.cardinal.tech.bzfx.constants.Constant.*;
import static com.cardinal.tech.bzfx.util.DateUtil.now;


@Component
@Slf4j
public class JwtTokenUtil {
    private transient Clock clock = DefaultClockProvider.INSTANCE.getClock();
    private static final Key secret = Keys.hmacShaKeyFor(SECRET_KEY.getBytes());
    private final UserMapper userMapper;

    public JwtTokenUtil(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    /**
     * use user id for Claims's subject
     *
     * @param token
     * @return
     */
    public JwtUserAO getJwtUserFromToken(String token) {
        String user_id = getClaimFromToken(token, Claims::getSubject);
        User user = userMapper.selectByPrimaryKey(Integer.valueOf(user_id));
        if (user != null) {
            JwtUserAO userAO = JwtUserAO.builder().user(user).build();
            return userAO;
        }
        return null;
    }

    public Date getIssuedAtDateFromToken(String token) {
        return getClaimFromToken(token, Claims::getIssuedAt);
    }

    public Date getExpirationDateFromToken(String token) {
        return getClaimFromToken(token, Claims::getExpiration);
    }

    public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = getAllClaimsFromToken(token);
        return claimsResolver.apply(claims);
    }

    private Claims getAllClaimsFromToken(String token) {
        return Jwts.parserBuilder().setSigningKey(secret)
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    private Boolean isTokenExpired(String token) {
        final Date expirationDate = getExpirationDateFromToken(token);
        return expirationDate.before(Date.from(clock.instant().now()));
    }

    private Boolean isCreatedBeforeLastPasswordReset(Date created, Date lastPasswordReset) {
        return (lastPasswordReset != null && created.before(lastPasswordReset));
    }

    private Boolean ignoreTokenExpiration(String token) {
        // here you specify tokens, for that the expiration is ignored
        return false;
    }

    /**
     * 获取token
     *
     * @param user
     * @return
     */
    public TokenBO getToken(User user) {
        var token = generateToken(user);
        return TokenBO.builder().token(token).role(user.getRole_id()).expireTime(getExpirationDateFromToken(token)).build();
    }

    // 登陆校验成功后调用这个接口生成token下发
    public String generateToken(User user) {
        Map<String, Object> claims = new HashMap<>();
        claims.put(ROLE_ID, user.getRole_id());
        Integer id = user.getId();
        log.info("generateToken user:{}", id);
        String token = doGenerateToken(claims, String.valueOf(id));
        return token;
    }

    private String doGenerateToken(Map<String, Object> claims, String userId) {
        final Date createdDate = DateUtil.now(clock);
        final Date expirationDate = calculateExpirationDate(createdDate);
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(userId)
                .setIssuedAt(createdDate)
                .setExpiration(expirationDate)
                .signWith(secret)
                .compact();
    }

    public Boolean canTokenBeRefreshed(String token, Date lastPasswordReset) {
        final Date created = getIssuedAtDateFromToken(token);
        return !isCreatedBeforeLastPasswordReset(created, lastPasswordReset)
                && (!isTokenExpired(token) || ignoreTokenExpiration(token));
    }

    public String refreshToken(String token) {
        final Date createdDate = DateUtil.now();
        final Date expirationDate = calculateExpirationDate(createdDate);

        final Claims claims = getAllClaimsFromToken(token);
        claims.setIssuedAt(createdDate);
        claims.setExpiration(expirationDate);
        return Jwts.builder()
                .setClaims(claims)
                .signWith(secret)
                .compact();
    }

    public Boolean validateToken(String token, UserDetails userDetails) throws Exception {
        JwtUserAO user = (JwtUserAO) userDetails;
        final JwtUserAO jwtUser = getJwtUserFromToken(token);
        return (
                jwtUser.getUsername().equals(user.getUsername())
                        && !isTokenExpired(token));
    }

    private Date calculateExpirationDate(Date createdDate) {
        return DateUtil.getAfter(createdDate, DEFAULT_TOKE_TIMEOUT);
    }
}
