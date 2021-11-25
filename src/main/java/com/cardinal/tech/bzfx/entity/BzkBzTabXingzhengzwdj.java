package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 行政职务等级(BzkBzTabXingzhengzwdj)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
public class BzkBzTabXingzhengzwdj implements Serializable {
    private static final long serialVersionUID = -46915765131052096L;
    /**
    * ID
    */
    private String id;
    /**
    * 行政职务等级代码
    */
    private String xingzhengzwdjdm;
    /**
    * 行政职务等级
    */
    private String xingzhengzwdj;
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
    /**
    * 卫生职务等级
    */
    private String wszwdj;

}