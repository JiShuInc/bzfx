package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 文化程度(BzkBzTabWenhuacd)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
public class BzkBzTabWenhuacd implements Serializable {
    private static final long serialVersionUID = 494784408892664539L;
    /**
    * ID
    */
    private String id;
    /**
    * 文化程度代码
    */
    private String wenhuacddm;
    /**
    * 文化程度
    */
    private String wenhuacd;
    /**
    * 人劳代码
    */
    private String renlaodm;
    /**
    * 人劳名称
    */
    private String renlaomc;
    /**
    * 工薪代码
    */
    private String gongxindm;
    /**
    * 工薪名称
    */
    private String gongxinmc;
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