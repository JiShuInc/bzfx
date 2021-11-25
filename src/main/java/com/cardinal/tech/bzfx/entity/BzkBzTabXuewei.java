package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 学位(BzkBzTabXuewei)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
public class BzkBzTabXuewei implements Serializable {
    private static final long serialVersionUID = -39052997953220746L;
    /**
    * ID
    */
    private String id;
    /**
    * 学位代码
    */
    private String xueweidm;
    /**
    * 学位
    */
    private String xuewei;
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