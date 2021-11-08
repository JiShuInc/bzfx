package com.cardinal.tech.bzfx.enums.biz;

/**
 * status enum include normal and delete
 */
public enum StatusEnum {
    NORMAL(0, "正常"), DELETE(1, "删除");

    StatusEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    private int value;
    private String desc;

    public int value() {
        return this.value;
    }

    public String desc() {
        return this.desc;
    }
}
