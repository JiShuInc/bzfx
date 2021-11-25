package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 岗位情况标准编码(BzkBzTabGangweiqk)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
public class BzkBzTabGangweiqk implements Serializable {
    private static final long serialVersionUID = -88595475552989700L;
    /**
    * 主键ID
    */
    private String id;
    /**
    * 岗位情况代码
    */
    private String gangweiqkdm;
    /**
    * 岗位情况名称
    */
    private String gangweiqkmc;
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