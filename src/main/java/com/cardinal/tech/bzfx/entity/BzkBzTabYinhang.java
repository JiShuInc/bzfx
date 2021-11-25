package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 银行代码(BzkBzTabYinhang)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
public class BzkBzTabYinhang implements Serializable {
    private static final long serialVersionUID = -73594972006140472L;
    /**
    * 主键ID
    */
    private String id;
    /**
    * 银行代码
    */
    private String yinhangdm;
    /**
    * 银行名称
    */
    private String yinhangmc;
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