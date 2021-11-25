package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 机构等级(BzkBzTabJigoudj)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
public class BzkBzTabJigoudj implements Serializable {
    private static final long serialVersionUID = 288010371512253176L;
    /**
    * ID
    */
    private String id;
    /**
    * 机构等级代码
    */
    private String jigoudjdm;
    /**
    * 机构等级
    */
    private String jigoudj;
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