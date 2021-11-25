package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 过敏史字典表(BzkBzTabGuominshi)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
public class BzkBzTabGuominshi implements Serializable {
    private static final long serialVersionUID = 180142572090814338L;
    /**
    * 过敏史主键id
    */
    private String id;
    /**
    * 过敏史代码
    */
    private String guominshidm;
    /**
    * 过敏史名称
    */
    private String guominshi;
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