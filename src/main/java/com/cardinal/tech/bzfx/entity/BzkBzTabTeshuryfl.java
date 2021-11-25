package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 特殊人员分类(BzkBzTabTeshuryfl)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
public class BzkBzTabTeshuryfl implements Serializable {
    private static final long serialVersionUID = 737204511994861625L;
    /**
    * ID
    */
    private String id;
    /**
    * 特殊人员分类代码
    */
    private String teshuryfldm;
    /**
    * 特殊人员分类
    */
    private String teshuryfl;
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