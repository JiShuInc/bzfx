package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 气候区(BzkBzTabQihouqu)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:57
 */
public class BzkBzTabQihouqu implements Serializable {
    private static final long serialVersionUID = 447986050614928158L;
    /**
    * ID
    */
    private String id;
    /**
    * 气候区代码
    */
    private String qihouqdm;
    /**
    * 气候区
    */
    private String qihouqu;
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