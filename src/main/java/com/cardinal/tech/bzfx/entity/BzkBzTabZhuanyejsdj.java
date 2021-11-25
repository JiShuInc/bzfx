package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 专业技术等级(BzkBzTabZhuanyejsdj)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
public class BzkBzTabZhuanyejsdj implements Serializable {
    private static final long serialVersionUID = 376745019698912240L;
    /**
    * ID
    */
    private String id;
    /**
    * 专业技术等级代码
    */
    private String zhuanyejsdjdm;
    /**
    * 专业技术等级
    */
    private String zhuanyejsdj;
    /**
    * 人劳代码
    */
    private String renlaodm;
    /**
    * 人劳名称
    */
    private String renlaomc;
    /**
    * 工薪代码
    */
    private String gongxindm;
    /**
    * 工薪名称
    */
    private String gongxinmc;
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
    * 卫生技术级别
    */
    private String wsjsjb;

}