package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 行政区划对照(BzkBzTabXzqhdz)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
public class BzkBzTabXzqhdz implements Serializable {
    private static final long serialVersionUID = -29123076531782460L;
    /**
    * 保障卡地名代码
    */
    private String dimingdm;
    /**
    * 保障卡地名全称
    */
    private String dimingqc;
    /**
    * 卫生行政区划代码
    */
    private String wsxzqhdm;
    /**
    * 卫生行政区划名称
    */
    private String wsxzqhmc;

}