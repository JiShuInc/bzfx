package com.cardinal.tech.bzfx.service;

import com.cardinal.tech.bzfx.bean.bo.*;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.transaction.annotation.Transactional;

public interface UserService {
    default Response<TokenBO> signIn(SignInForm signIn) {
        throw new NotImplementedException();
    }

    @Transactional
    default Response<Void> resetPassword(ResetPasswordForm resetForm, Integer userId) {
        throw new NotImplementedException();
    }

    default Response<Void> addUser(UserAddForm addForm) {
        throw new NotImplementedException();
    }

    default Response<Page<UserBO>> listUser(PageForm<UserQueryForm> userQueryForm) {
        throw new NotImplementedException();
    }

    Response<Void> resetUserPassword(ResetUserPasswordForm resetForm);

    Response<Void> deleteUser(Integer id);

    Response<Void> addRole(RoleAddForm addForm);
}
