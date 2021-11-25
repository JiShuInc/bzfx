package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 卡状态(BzkBzTabKazhuangtai)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
public class BzkBzTabKazhuangtai implements Serializable {
    private static final long serialVersionUID = 193591798408137084L;
    /**
    * ID
    */
    private String id;
    /**
    * 卡状态代码
    */
    private String kazhuangtdm;
    /**
    * 卡状态
    */
    private String kazhuangtai;
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