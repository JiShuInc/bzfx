package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 一类特供人员类别(BzkBzTabYileitgrylb)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
public class BzkBzTabYileitgrylb implements Serializable {
    private static final long serialVersionUID = 400045598640145778L;
    /**
    * ID
    */
    private String id;
    /**
    * 特供人员类别代码
    */
    private String tegongrylbdm;
    /**
    * 特供人员类别
    */
    private String tegongrylb;
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
    * 卫生特种人员
    */
    private String wstzry;
    /**
    * 卫生附加信息1
    */
    private String wsfjxx;

}