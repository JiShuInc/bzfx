package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 被装发放记录(TjBeizhuangff)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-13 19:28:47
 */
public class TjBeizhuangff implements Serializable {
    private static final long serialVersionUID = 769410223100917147L;
    /**
    * id
    */
    private Long id;
    /**
    * 原始数据ID
    */
    private String did;
    /**
    * 人员id
    */
    private Long ryid;
    /**
    * 所属单位
    */
    private Long dwid;
    /**
    * 品名
    */
    private String pinming;
    /**
    * 型号
    */
    private String xinghao;
    /**
    * 单位
    */
    private String danwei;
    /**
    * 数量
    */
    private Integer shuliang;
    /**
    * 时间
    */
    private Date shijian;
    /**
    * 数据创建时间
    */
    private Date creatAt;

}