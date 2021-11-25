package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 性别(BzkBzTabXingbie)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
public class BzkBzTabXingbie implements Serializable {
    private static final long serialVersionUID = -76775296587480130L;
    /**
    * ID
    */
    private String id;
    /**
    * 性别代码
    */
    private String xingbiedm;
    /**
    * 性别
    */
    private String xingbie;
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
    /**
    * 对应卫生系统的名称
    */
    private String wsmc;

}