package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 婚姻状况(BzkBzTabHunyinzk)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
public class BzkBzTabHunyinzk implements Serializable {
    private static final long serialVersionUID = -61964884314130537L;
    /**
    * ID
    */
    private String id;
    /**
    * 婚姻状况代码
    */
    private String hunyinzkdm;
    /**
    * 婚姻状况
    */
    private String hunyinzk;
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