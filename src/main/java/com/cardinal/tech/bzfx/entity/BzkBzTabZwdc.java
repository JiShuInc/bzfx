package com.cardinal.tech.bzfx.entity;

import lombok.Data;

import java.io.Serializable;

@Data
/**
 * 职务档次(BzkBzTabZwdc)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:59
 */
public class BzkBzTabZwdc implements Serializable {
    private static final long serialVersionUID = -97946550961340134L;
    /**
    * ID
    */
    private String id;
    /**
    * 职务档次代码
    */
    private String zwdcdm;
    /**
    * 职务档次
    */
    private String zwdc;
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