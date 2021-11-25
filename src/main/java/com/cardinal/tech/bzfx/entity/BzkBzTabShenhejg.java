package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 审核结果(BzkBzTabShenhejg)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
public class BzkBzTabShenhejg implements Serializable {
    private static final long serialVersionUID = 708588036421471502L;
    /**
    * ID
    */
    private String id;
    /**
    * 审核结果代码
    */
    private String shenhejgdm;
    /**
    * 审核结果
    */
    private String shenhejg;
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