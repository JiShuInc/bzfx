package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 专业技术职务(BzkBzTabZhuanyejszw)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
public class BzkBzTabZhuanyejszw implements Serializable {
    private static final long serialVersionUID = 845487950230310957L;
    /**
    * ID
    */
    private String id;
    /**
    * 专业技术职务代码
    */
    private String zhuanyejszwdm;
    /**
    * 专业技术职务
    */
    private String zhuanyejszw;
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
    /**
    * 卫生专业技术职务名称
    */
    private String wszyjszw;

}