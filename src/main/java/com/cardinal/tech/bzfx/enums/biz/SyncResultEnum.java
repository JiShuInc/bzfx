package com.cardinal.tech.bzfx.enums.biz;

/**
 * status enum include normal and delete
 */
public enum SyncResultEnum {
    SYNC_SUCCESS(0, "成功"), SYNC_FAIL(1, "失败");

    SyncResultEnum(int value, String desc) {
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
