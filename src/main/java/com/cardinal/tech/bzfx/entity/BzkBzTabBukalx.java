package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 补卡类型(BzkBzTabBukalx)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:53
 */
public class BzkBzTabBukalx implements Serializable {
    private static final long serialVersionUID = 841119667169280243L;
    /**
    * ID
    */
    private String id;
    /**
    * 补卡类型代码
    */
    private String bukalxdm;
    /**
    * 补卡类型
    */
    private String bukalx;
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