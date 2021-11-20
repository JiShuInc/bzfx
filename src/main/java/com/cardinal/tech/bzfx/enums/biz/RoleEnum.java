package com.cardinal.tech.bzfx.enums.biz;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * user role
 */
public enum RoleEnum {
    ADMIN(1, "admin", "管理员"),
    PERSON(2, "person", "人员"),
    CLOTHES(3, "clothse", "被装"),
    FINANCE(4, "finance", "财务"),
    MEDICAL(5, "medical", "医疗"),
    HOUSE(6, "house", "营房"),
    ACCESS_API(7, "access_api", "api访问");

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

    public static List<RoleEnum> getRolesById(Integer id) {
        final var ids = String.valueOf(id);
        final var chars = ids.toCharArray();
        List<RoleEnum> roles = new ArrayList<RoleEnum>();
        for (char c : chars) {
            roles.add(getById(Integer.valueOf(c+"")));
        }
        return roles;

    }

    public static RoleEnum getById(Integer id) {
        return Arrays.asList(RoleEnum.values()).parallelStream().filter(r -> r.id == id
        ).findFirst().get();
    }
}
