package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 单位性质(BzkBzTabDanweixz)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
public class BzkBzTabDanweixz implements Serializable {
    private static final long serialVersionUID = 465551415664493050L;
    /**
    * ID
    */
    private String id;
    /**
    * 单位性质代码
    */
    private String danweixzdm;
    /**
    * 单位性质
    */
    private String danweixz;
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