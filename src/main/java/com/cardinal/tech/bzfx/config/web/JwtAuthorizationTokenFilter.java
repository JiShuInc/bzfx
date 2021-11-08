package com.cardinal.tech.bzfx.config.web;


import com.cardinal.tech.bzfx.enums.err.SysErrEnum;
import com.cardinal.tech.bzfx.util.JwtTokenUtil;
import com.cardinal.tech.bzfx.bean.ao.JwtUserAO;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.OrRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.annotation.PostConstruct;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import static com.cardinal.tech.bzfx.constants.Constant.TOKEN_HEAD;
import static com.cardinal.tech.bzfx.constants.Constant.USER_ID;

@Slf4j
@Component
public class JwtAuthorizationTokenFilter extends OncePerRequestFilter {

    private final FilterIgnoreUrlConfig filterIgnoreUrlConfig;
    private final UserDetailsService userDetailsService;
    private final JwtTokenUtil jwtTokenUtil;

    private OrRequestMatcher orRequestMatcher;

    public JwtAuthorizationTokenFilter(FilterIgnoreUrlConfig filterIgnoreUrlConfig, UserDetailsService userDetailsService, JwtTokenUtil jwtTokenUtil) {
        this.filterIgnoreUrlConfig = filterIgnoreUrlConfig;
        this.userDetailsService = userDetailsService;
        this.jwtTokenUtil = jwtTokenUtil;
    }

    @PostConstruct
    public void init() {
        // 初始化ignore的url不走token过滤器
        List<RequestMatcher> matchers = filterIgnoreUrlConfig.getUrls().parallelStream().map(AntPathRequestMatcher::new).collect(Collectors.toList());
        orRequestMatcher = new OrRequestMatcher(matchers);
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        if (log.isDebugEnabled()) {
            log.debug("处理授权 '{}'", requestURI);
        }
        final String token = request.getHeader(TOKEN_HEAD);
        JwtUserAO jwtUser = null;
        String authToken = null;
        if (token != null && token.startsWith("Bearer ")) {
            authToken = token.split(" ")[1];
            try {
                jwtUser = jwtTokenUtil.getJwtUserFromToken(authToken);
                request.setAttribute(USER_ID, jwtUser.getUsername());
            } catch (ExpiredJwtException e) {
                throw new AccountExpiredException(SysErrEnum.SIGNIN_TIMEOUT.msg());
            } catch (MalformedJwtException e) {
                log.info("解析token错误,token:{}", token);
            } catch (Exception e) {
                log.info("token处理异常!{}", token, e);
            }
        }
        if (log.isDebugEnabled()) {
            log.debug("检查用户{}授权", jwtUser);
        }
        var context = SecurityContextHolder.getContext();
        if (jwtUser != null && jwtUser.getUsername() != null && context.getAuthentication() == null) {
            UserDetails user = userDetailsService.loadUserByUsername(jwtUser.getUsername());
            var authentication = new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
            authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
            if (log.isDebugEnabled()) {
                log.debug("authorized user [{}], setting security context", user.getUsername());
            }
            context.setAuthentication(authentication);
        }
        filterChain.doFilter(request, response);
    }

    /**
     * if true then pass over doFilterInternal
     *
     * @param request
     * @return
     */
    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) {
        return orRequestMatcher.matches(request);
    }
}
