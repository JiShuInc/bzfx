package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 后勤部队类别(BzkBzTabHouqinbdl)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
public class BzkBzTabHouqinbdl implements Serializable {
    private static final long serialVersionUID = -30731702939938741L;
    /**
    * ID
    */
    private String id;
    /**
    * 后勤部队类别代码
    */
    private String houqinbdlbdm;
    /**
    * 后勤部队类别
    */
    private String houqinbdlb;
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