package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 后勤干部专业类别(BzkBzTabHouqingbz)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
public class BzkBzTabHouqingbz implements Serializable {
    private static final long serialVersionUID = -16899316935808866L;
    /**
    * ID
    */
    private String id;
    /**
    * 后勤干部专业类别代码
    */
    private String houqingbzylbdm;
    /**
    * 后勤干部专业类别
    */
    private String houqingbzylb;
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