package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 调动情况(BzkBzTabDiaodongqk)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
public class BzkBzTabDiaodongqk implements Serializable {
    private static final long serialVersionUID = 515022297038861821L;
    /**
    * ID
    */
    private String id;
    /**
    * 调动情况代码
    */
    private String diaodongqkdm;
    /**
    * 调动情况
    */
    private String diaodongqk;
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