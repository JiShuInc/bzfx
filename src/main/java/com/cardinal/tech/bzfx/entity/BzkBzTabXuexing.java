package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 血型(BzkBzTabXuexing)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
public class BzkBzTabXuexing implements Serializable {
    private static final long serialVersionUID = 845887502652580471L;
    /**
    * ID
    */
    private String id;
    /**
    * 血型代码
    */
    private String xuexingdm;
    /**
    * 血型
    */
    private String xuexing;
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