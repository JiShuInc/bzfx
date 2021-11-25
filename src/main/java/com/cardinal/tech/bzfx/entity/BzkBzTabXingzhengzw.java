package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 行政职务(BzkBzTabXingzhengzw)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
public class BzkBzTabXingzhengzw implements Serializable {
    private static final long serialVersionUID = 643058767112728393L;
    /**
    * ID
    */
    private String id;
    /**
    * 行政职务代码
    */
    private String xingzhengzwdm;
    /**
    * 行政职务
    */
    private String xingzhengzw;
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