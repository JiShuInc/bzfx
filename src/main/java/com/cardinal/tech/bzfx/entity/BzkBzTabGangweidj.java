package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 岗位等级标准编码(BzkBzTabGangweidj)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
public class BzkBzTabGangweidj implements Serializable {
    private static final long serialVersionUID = 859230463021704470L;
    /**
    * 主键ID
    */
    private String id;
    /**
    * 岗位等级代码
    */
    private String gangweidjdm;
    /**
    * 岗位等级名称
    */
    private String gangweidjmc;
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
    * 转改文职对应职务等级
    */
    private String zhuangaiwzdizwdy;
    /**
    * 招录文职对应职务等级
    */
    private String zhaoluwzdyzwdj;

}