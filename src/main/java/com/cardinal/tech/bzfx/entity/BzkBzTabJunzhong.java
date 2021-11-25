package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 军种(BzkBzTabJunzhong)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
public class BzkBzTabJunzhong implements Serializable {
    private static final long serialVersionUID = 244978548980610667L;
    /**
    * ID
    */
    private String id;
    /**
    * 军种代码
    */
    private String junzhongdm;
    /**
    * 军种
    */
    private String junzhong;
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