package com.cardinal.tech.bzfx.service.impl;


import com.cardinal.tech.bzfx.enums.biz.RoleEnum;
import com.cardinal.tech.bzfx.bean.ao.JwtUserAO;
import com.cardinal.tech.bzfx.entity.User;
import com.cardinal.tech.bzfx.dao.UserMapper;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Primary
@Service
public class JwtUserDetailsService implements UserDetailsService {
    private final UserMapper userMapper;

    public JwtUserDetailsService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        User user = userMapper.selectByPrimaryKey(Integer.valueOf(userId));
        if (user == null) {
            throw new UsernameNotFoundException(userId);
        }
        return create(user);
    }

    private UserDetails create(User user) {
        JwtUserAO jwtUser = JwtUserAO.builder().user(user).build();
        var role = RoleEnum.getById(user.getRole_id());
        // 选取菜单permission作为权限标识
        //        roleCodeList.addAll(user.getPermissionList().stream().filter(Strings::isEmpty).collect(Collectors.toSet()));
        Collection<? extends GrantedAuthority> authorities = AuthorityUtils.createAuthorityList(role.code());
        jwtUser.setAuthorities(authorities);
        return jwtUser;

    }
}
