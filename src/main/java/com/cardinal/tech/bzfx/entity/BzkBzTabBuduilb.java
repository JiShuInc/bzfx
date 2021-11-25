package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 部队类别(BzkBzTabBuduilb)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:53
 */
public class BzkBzTabBuduilb implements Serializable {
    private static final long serialVersionUID = -13744260798414805L;
    /**
    * ID
    */
    private String id;
    /**
    * 部队类别代码
    */
    private String buduilbdm;
    /**
    * 部队类别
    */
    private String buduilb;
    /**
    * 是否显示；是、否
    */
    private String shifouxs;
    /**
    * 数据所在单位
    */
    private String shujuszdw;
    /**
    * 状态：正常，删除
    */
    private String zhuangtai;

}