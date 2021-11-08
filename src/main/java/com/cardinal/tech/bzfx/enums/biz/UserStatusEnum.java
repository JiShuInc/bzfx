package com.cardinal.tech.bzfx.enums.biz;

public enum UserStatusEnum {
    DISABLED(0, "禁用"), ACTIVE(1, "存活");
    private int value;
    private String desc;

    UserStatusEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public int value() {
        return this.value;
    }

    public String desc() {
        return this.desc;
    }
}
