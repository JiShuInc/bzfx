package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 职业(BzkBzTabZhiye)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
public class BzkBzTabZhiye implements Serializable {
    private static final long serialVersionUID = -10981656814861216L;
    /**
    * ID
    */
    private String id;
    /**
    * 职业代码
    */
    private String zhiyedm;
    /**
    * 职业名称
    */
    private String zhiyemc;
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