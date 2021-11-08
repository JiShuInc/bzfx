package com.cardinal.tech.bzfx.enums.err;

import com.cardinal.tech.bzfx.enums.ErrEnumInterface;

/**
 * user module error enums  in range 200-299
 */
public enum UserErrEnum implements ErrEnumInterface {
    USER_NOT_EXIST(200, "用户不存在"),
    USERNAME_OR_PASSWORD_ERROR(201, "用户名或密码错误"),
    DISABLED_ERR(202, "用户已经禁用"),
    DISABLE_ADMIN_ERR(203, "超级管理员不能被禁用"),
    USERID_NULL_ERR(204, "用户id不能为空"),
    USER_OLDPASS_ERR(205, "原密码错误"),
    USER_EXIST_ERR(206, "用户已经存在"),
    ADMIN_NOT_DELETE(207, "超级管理员不能被删除"),
    ;


    UserErrEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private int code;
    private String msg;

    @Override
    public int code() {
        return this.code;
    }

    @Override
    public String msg() {
        return this.msg;
    }

}
