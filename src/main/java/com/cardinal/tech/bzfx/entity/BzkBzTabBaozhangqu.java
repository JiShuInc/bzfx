package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 保障区(BzkBzTabBaozhangqu)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:53
 */
public class BzkBzTabBaozhangqu implements Serializable {
    private static final long serialVersionUID = 619900992983374480L;
    /**
    * ID
    */
    private String id;
    /**
    * 保障区代码
    */
    private String baozhangqdm;
    /**
    * 保障区
    */
    private String baozhangqu;
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