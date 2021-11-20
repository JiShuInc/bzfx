package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.enums.biz.RoleEnum;
import com.cardinal.tech.bzfx.enums.err.UserErrEnum;
import com.cardinal.tech.bzfx.service.UserService;
import com.cardinal.tech.bzfx.util.DateUtil;
import com.cardinal.tech.bzfx.util.JwtTokenUtil;
import com.cardinal.tech.bzfx.util.ReflectUtil;
import com.cardinal.tech.bzfx.util.UserPasswordEncoder;
import com.cardinal.tech.bzfx.entity.User;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.dao.UserMapper;
import com.cardinal.tech.bzfx.exceptions.BaseErrException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.stream.Collectors;

import static com.cardinal.tech.bzfx.util.DateUtil.now;

@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;
    private final JwtTokenUtil jwtTokenUtil;
    private final UserPasswordEncoder userPasswordEncoder;

    public UserServiceImpl(UserMapper userMapper, JwtTokenUtil jwtTokenUtil, UserPasswordEncoder userPasswordEncoder) {
        this.userMapper = userMapper;
        this.jwtTokenUtil = jwtTokenUtil;
        this.userPasswordEncoder = userPasswordEncoder;
    }

    @Override
    public Response<TokenBO> signIn(SignInForm signIn) {
        var username = signIn.getUsername();
        var user = userMapper.findByUsername(username);
        if (user == null || !user.getPassword().equals(new UserPasswordEncoder().encode(signIn.getPassword()))) {
            throw new BaseErrException(UserErrEnum.USERNAME_OR_PASSWORD_ERROR, username);
        }

        return new Response<>(jwtTokenUtil.getToken(user));
    }

    @Transactional
    @Override
    public Response<Void> resetPassword(ResetPasswordForm resetForm, Integer userId) {
        User user = userMapper.selectByPrimaryKey(userId);
        UserPasswordEncoder userPasswordEncoder = new UserPasswordEncoder();
        if (!user.getPassword().equals(userPasswordEncoder.encode(resetForm.getOld_password()))) {
            throw new BaseErrException(UserErrEnum.USER_OLDPASS_ERR, user.getUsername());
        }
        user.setPassword(userPasswordEncoder.encode(resetForm.getNew_password()));
        user.setM_time(DateUtil.now());
        userMapper.updateByPrimaryKey(user);
        return new Response<>();
    }

    @Transactional
    @Override
    public Response<Void> addUser(UserAddForm addForm) {
        var user = userMapper.findByUsername(addForm.getUsername());
        if (user != null) {
            throw new BaseErrException(UserErrEnum.USER_EXIST_ERR, addForm.getUsername());
        }
        user = ReflectUtil.toBO(addForm, User.class);
        user.setPassword(userPasswordEncoder.encode(addForm.getPassword()));
        user.setRole_id(RoleEnum.ACCESS_API.id());
        user.setC_time(DateUtil.now());
        userMapper.insertSelective(user);
        return new Response<>();
    }

    @Override
    public Response<Page<UserBO>> listUser(PageForm<UserQueryForm> userQueryForm) {
        var pq = new PageQuery<>(userQueryForm);
        List<User> userList = userMapper.queryPageUserList(pq);
        Page<UserBO> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(userList.parallelStream().map(u -> ReflectUtil.toBO(u, UserBO.class).setCreat_time(u.getC_time()).setEdit_time(u.getM_time())).collect(Collectors.toList()));
        return new Response<>(p);
    }

    @Override
    public Response<Void> resetUserPassword(ResetUserPasswordForm resetForm) {
        final var userId = resetForm.getId();
        final var user = userMapper.selectByPrimaryKey(userId);
        if (user == null) {
            throw new BaseErrException(UserErrEnum.USER_NOT_EXIST, "用户" + userId + "不存在");
        }
        user.setPassword(userPasswordEncoder.encode(resetForm.getNew_password()));
        user.setM_time(DateUtil.now());
        userMapper.updateByPrimaryKey(user);
        return new Response<>();
    }

    @Override
    public Response<Void> deleteUser(Integer id) {
        if (id == 1) {
            throw new BaseErrException(UserErrEnum.ADMIN_NOT_DELETE, "不能删除超级管理员");
        }
        userMapper.deleteByPrimaryKey(id);
        return new Response<>();
    }

    @Transactional
    @Override
    public Response<Void> addRole(RoleAddForm addForm) {
        final var id = addForm.getUserId();
        if (id == 1) {
            throw new BaseErrException(UserErrEnum.ADMIN_NOT_UPDATE, "不能修改超级管理员权限");
        }
        final var user = userMapper.selectByPrimaryKey(id);
        user.setRole_id(addForm.getRoleId());
        user.setM_time(now());
        userMapper.updateByPrimaryKeySelective(user);
        return new Response<>();
    }
}
