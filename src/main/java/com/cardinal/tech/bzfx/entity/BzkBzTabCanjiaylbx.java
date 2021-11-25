package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 参加医疗保险情况标准编码表(BzkBzTabCanjiaylbx)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
public class BzkBzTabCanjiaylbx implements Serializable {
    private static final long serialVersionUID = 389722414061253106L;
    /**
    * 主键ID
    */
    private String id;
    /**
    * 参加医疗保险情况代码
    */
    private String canjiaylbxdm;
    /**
    * 参加医疗保险情况名称
    */
    private String canjiaylbxmc;
    /**
    * 人劳代码
    */
    private String renlaodm;
    /**
    * 人劳名称
    */
    private String renlaomc;
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