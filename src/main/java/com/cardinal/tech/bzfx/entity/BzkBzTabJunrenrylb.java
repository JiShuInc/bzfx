package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 军人人员类别(BzkBzTabJunrenrylb)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
public class BzkBzTabJunrenrylb implements Serializable {
    private static final long serialVersionUID = -51541667957985662L;
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