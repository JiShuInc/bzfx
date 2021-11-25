package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 艰苦地区分类(BzkBzTabJiankudqfl)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
public class BzkBzTabJiankudqfl implements Serializable {
    private static final long serialVersionUID = 517935240353693210L;
    /**
    * ID
    */
    private String id;
    /**
    * 艰苦地区分类代码
    */
    private String jiankudqfldm;
    /**
    * 艰苦地区分类
    */
    private String jiankudqfl;
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