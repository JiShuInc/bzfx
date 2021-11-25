package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 个人状态(BzkBzTabGerenzt)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
public class BzkBzTabGerenzt implements Serializable {
    private static final long serialVersionUID = 174310755741377150L;
    /**
    * ID
    */
    private String id;
    /**
    * 个人状态代码
    */
    private String gerenztdm;
    /**
    * 个人状态
    */
    private String gerenzt;
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