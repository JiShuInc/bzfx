package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 国籍(BzkBzTabGuoji)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
public class BzkBzTabGuoji implements Serializable {
    private static final long serialVersionUID = 443068081108276187L;
    /**
    * ID
    */
    private String id;
    /**
    * 国籍数字代码
    */
    private String guojidm;
    /**
    * 国籍简称
    */
    private String guoji;
    /**
    * 国籍两位字母代码
    */
    private String guojilwzmdm;
    /**
    * 国籍三位字母代码
    */
    private String guojiswzmdm;
    /**
    * 国籍全称
    */
    private String guojiqc;
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