package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 主类别(BzkBzTabZhuleibie)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:59
 */
public class BzkBzTabZhuleibie implements Serializable {
    private static final long serialVersionUID = -89461138529496921L;
    /**
    * ID
    */
    private String id;
    /**
    * 主类别代码
    */
    private String zhuleibdm;
    /**
    * 主类别
    */
    private String zhuleibie;
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