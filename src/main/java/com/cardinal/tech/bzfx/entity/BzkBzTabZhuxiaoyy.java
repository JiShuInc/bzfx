package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 注销原因(BzkBzTabZhuxiaoyy)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:59
 */
public class BzkBzTabZhuxiaoyy implements Serializable {
    private static final long serialVersionUID = 246523918219990279L;
    /**
    * ID
    */
    private String id;
    /**
    * 注销原因代码
    */
    private String zhuxiaoyydm;
    /**
    * 注销原因
    */
    private String zhuxiaoyy;
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