package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 子女状况(BzkBzTabZnzk)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:59
 */
public class BzkBzTabZnzk implements Serializable {
    private static final long serialVersionUID = 997731449625523288L;
    /**
    * ID
    */
    private String id;
    /**
    * 子女状况代码
    */
    private String znzkdm;
    /**
    * 子女状况
    */
    private String znzk;
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