package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 职工身份类别(BzkBzTabZhigongsf)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
public class BzkBzTabZhigongsf implements Serializable {
    private static final long serialVersionUID = -71018824065369038L;
    /**
    * ID
    */
    private String id;
    /**
    * 职工身份类别代码
    */
    private String zhigongsflbdm;
    /**
    * 职工身份类别
    */
    private String zhigongsflb;
    /**
    * 人劳代码
    */
    private String renlaodm;
    /**
    * 人劳名称
    */
    private String renlaomc;
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