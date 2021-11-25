package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 民族(BzkBzTabMinzu)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
public class BzkBzTabMinzu implements Serializable {
    private static final long serialVersionUID = 359204508287312128L;
    /**
    * ID
    */
    private String id;
    /**
    * 民族代码
    */
    private String minzudm;
    /**
    * 民族
    */
    private String minzu;
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