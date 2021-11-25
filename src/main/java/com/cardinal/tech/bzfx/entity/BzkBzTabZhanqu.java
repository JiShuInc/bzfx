package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 战区(BzkBzTabZhanqu)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
public class BzkBzTabZhanqu implements Serializable {
    private static final long serialVersionUID = -18024322239820044L;
    /**
    * ID
    */
    private String id;
    /**
    * 战区代码
    */
    private String zhanqudm;
    /**
    * 战区
    */
    private String zhanqu;
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