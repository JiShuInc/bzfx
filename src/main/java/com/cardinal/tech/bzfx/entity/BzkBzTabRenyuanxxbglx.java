package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 人员信息变更类型(BzkBzTabRenyuanxxbglx)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:57
 */
public class BzkBzTabRenyuanxxbglx implements Serializable {
    private static final long serialVersionUID = 850399502984483656L;
    /**
    * ID
    */
    private String id;
    /**
    * 人员信息变更类型代码
    */
    private String renyuanxxbglxdm;
    /**
    * 人员信息变更类型
    */
    private String renyuanxxbglx;
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