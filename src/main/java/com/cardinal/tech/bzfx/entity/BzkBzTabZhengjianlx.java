package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 证件类型(BzkBzTabZhengjianlx)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
public class BzkBzTabZhengjianlx implements Serializable {
    private static final long serialVersionUID = 431012250073146460L;
    /**
    * ID
    */
    private String id;
    /**
    * 证件类型代码
    */
    private String zhengjianlxdm;
    /**
    * 证件类型
    */
    private String zhengjianlx;
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