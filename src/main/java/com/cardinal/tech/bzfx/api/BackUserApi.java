package com.cardinal.tech.bzfx.api;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.config.api.ApiConfig;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Tag(name = "user")
@RequestMapping(ApiConfig.ADMIN_API)
public interface BackUserApi extends BaseApi {

    @Operation(description = " for user sign in platform")
    @PostMapping("/login")
    default Response<TokenBO> signIn(@RequestBody @Valid SignInForm signIn) {
        return getUserService().signIn(signIn);
    }

    @PreAuthorize("hasAnyRole('admin','guest')")
    @Operation(description = " reset password")
    @PostMapping("/password-reset")
    default Response<Void> resetPassword(@RequestBody @Valid ResetPasswordForm resetForm) {
        return getUserService().resetPassword(resetForm, getUserId());
    }

    @PreAuthorize("hasAnyRole('admin','guest')")
    @Operation(description = " reset user's  password")
    @PostMapping("/user-password-reset")
    default Response<Void> resetUserPassword(@RequestBody @Valid ResetUserPasswordForm resetForm) {
        return getUserService().resetUserPassword(resetForm);
    }

    @PreAuthorize("hasRole('admin')")
    @Operation(description = " add user")
    @PostMapping("/user-add")
    default Response<Void> addUser(@RequestParam(required = false) @RequestBody @Valid UserAddForm addForm) {
        return getUserService().addUser(addForm);
    }

    @PreAuthorize("hasRole('admin')")
    @Operation(description = " list user")
    @PostMapping("/user-list")
    default Response<Page<UserBO>> listUser(@RequestBody PageForm<UserQueryForm> userQueryForm) {
        return getUserService().listUser(userQueryForm);
    }
    @PreAuthorize("hasRole('admin')")
    @Operation(description = " delete user")
    @PostMapping("/user-del")
    default Response<Void> deleteUser(@RequestParam Integer id) {
        return getUserService().deleteUser(id);
    }
}
