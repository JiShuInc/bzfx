package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 家属身份类别(BzkBzTabJiashusfl)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
public class BzkBzTabJiashusfl implements Serializable {
    private static final long serialVersionUID = 676560709040298552L;
    /**
    * ID
    */
    private String id;
    /**
    * 家属身份类别代码
    */
    private String jiashusflbdm;
    /**
    * 家属身份类别
    */
    private String jiashusflb;
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
    /**
    * 卫生身份类别代码
    */
    private String wssflb;
    /**
    * 卫生身份类别名称
    */
    private String wssflbmc;

}