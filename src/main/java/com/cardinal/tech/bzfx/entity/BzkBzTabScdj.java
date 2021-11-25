package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 伤残等级(BzkBzTabScdj)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
public class BzkBzTabScdj implements Serializable {
    private static final long serialVersionUID = -19687355479675317L;
    /**
    * ID
    */
    private String id;
    /**
    * 伤残等级代码
    */
    private String scdjdm;
    /**
    * 伤残等级
    */
    private String scdj;
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