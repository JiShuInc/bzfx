package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 经济状况(BzkBzTabJingjizk)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
public class BzkBzTabJingjizk implements Serializable {
    private static final long serialVersionUID = 456208245637572438L;
    /**
    * ID
    */
    private String id;
    /**
    * 经济状况代码
    */
    private String jingjizkdm;
    /**
    * 经济状况
    */
    private String jingjizk;
    /**
    * 卫勤代码
    */
    private String weiqindm;
    /**
    * 卫勤名称
    */
    private String weiqinmc;
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