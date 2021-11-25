package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 人员类别(BzkBzTabRenyuanlb)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:57
 */
public class BzkBzTabRenyuanlb implements Serializable {
    private static final long serialVersionUID = -22785845964071720L;
    /**
    * ID
    */
    private String id;
    /**
    * 人员类别代码
    */
    private String renyuanlbdm;
    /**
    * 人员类别
    */
    private String renyuanlb;
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
    * 对应人员类别,表示对应的是“干部”、“士兵”、“职工”还是“家属”
    */
    private String duiyingrylb;
    /**
    * 卫勤代码
    */
    private String weiqindm;
    /**
    * 卫勤名称
    */
    private String weiqinmc;
    /**
    * 状态：正常，删除
    */
    private String zhuangtai;
    /**
    * 对应卡类型
    */
    private String kaleixing;
    /**
    * 是否导出制卡：    导出为1
    */
    private String sfdczk;
    /**
    * 是否导出卫生：    导出为1
    */
    private String sfdcws;
    /**
    * 卫生人员类型
    */
    private String wsrylx;
    /**
    * 卫生身份类别代码
    */
    private String wssflb;
    /**
    * 卫生身份类别名称
    */
    private String wssflbmc;

}