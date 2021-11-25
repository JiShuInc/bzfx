package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 机关分队标识(BzkBzTabJiguanfdb)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
public class BzkBzTabJiguanfdb implements Serializable {
    private static final long serialVersionUID = -29686416470714781L;
    /**
    * ID
    */
    private String id;
    /**
    * 机关分队标识代码
    */
    private String jiguanfdbsdm;
    /**
    * 机关分队
    */
    private String jiguanfd;
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