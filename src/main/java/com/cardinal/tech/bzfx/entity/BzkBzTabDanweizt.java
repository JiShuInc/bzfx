package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 单位状态(BzkBzTabDanweizt)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
public class BzkBzTabDanweizt implements Serializable {
    private static final long serialVersionUID = -68586290949951537L;
    /**
    * ID
    */
    private String id;
    /**
    * 单位状态代码
    */
    private String danweiztdm;
    /**
    * 单位状态
    */
    private String danweizt;
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