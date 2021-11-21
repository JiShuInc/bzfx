package com.cardinal.tech.bzfx.enums.biz;

/**
 * status enum include normal and delete
 */
public enum SyncStateEnum {
    SYNC_WAITE(0, "未同步"), SYNC_PROGRESS(1, "同步中"), SYNC_FINISHED(2, "已同步");

    SyncStateEnum(int value, String desc) {
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
