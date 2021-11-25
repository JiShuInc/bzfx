package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 岗位类别(BzkBzTabGangweilb)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
public class BzkBzTabGangweilb implements Serializable {
    private static final long serialVersionUID = 412883157242308622L;
    /**
    * ID
    */
    private String id;
    /**
    * 岗位类别代码
    */
    private String gangweilbdm;
    /**
    * 岗位类别
    */
    private String gangweilb;
    /**
    * 对应人员类别，如指挥管理军官、专业技术军官
    */
    private String duiyingrylb;
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