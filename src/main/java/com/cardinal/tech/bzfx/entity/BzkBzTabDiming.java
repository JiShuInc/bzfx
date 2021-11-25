package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 地名(BzkBzTabDiming)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
public class BzkBzTabDiming implements Serializable {
    private static final long serialVersionUID = 488615246548695838L;
    /**
    * ID
    */
    private String id;
    /**
    * 地名代码
    */
    private String dimingdm;
    /**
    * 地名
    */
    private String diming;
    /**
    * 地名全称
    */
    private String dimingqc;
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