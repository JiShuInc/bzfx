package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 联勤关系(BzkBzTabLianqingx)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
public class BzkBzTabLianqingx implements Serializable {
    private static final long serialVersionUID = -61685351290148413L;
    /**
    * ID
    */
    private String id;
    /**
    * 供应代码
    */
    private String gongyingdm;
    /**
    * 单位代码
    */
    private String danweidm;
    /**
    * 单位名称
    */
    private String danweimc;
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