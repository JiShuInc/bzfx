package com.cardinal.tech.bzfx.enums.biz;

import java.util.Arrays;

/**
 * user role
 */
public enum RoleEnum {
    ADMIN(1, "admin", "管理员"),
    GUEST(2, "guest", "游客");

    RoleEnum(Integer id, String code, String desc) {
        this.id = id;
        this.code = code;
        this.desc = desc;
    }

    private Integer id;
    private String code;
    private String desc;

    public Integer id() {
        return this.id;
    }

    public String code() {
        return this.code;
    }

    public String desc() {
        return this.desc;
    }

    public static RoleEnum getById(Integer id) {
        return Arrays.asList(RoleEnum.values()).parallelStream().filter(r -> r.id.equals(id)).findFirst().get();
    }
}
