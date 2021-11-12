package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 被装发放记录(TjBeizhuangff)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-13 01:33:38
 */
public class TjBeizhuangff implements Serializable {
    private static final long serialVersionUID = 285305533918961027L;
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
    * 着装型号信息
    */
    private String xinghao;
    /**
    * 身高
    */
    private Integer shengao;
    /**
    * 胸围
    */
    private Integer xiongwei;
    /**
    * 腰围
    */
    private Integer yaowei;
    /**
    * 头围
    */
    private Integer touwei;
    /**
    * 体重
    */
    private Integer tizhong;
    /**
    * 臀围
    */
    private Integer tunwei;
    /**
    * 脚长
    */
    private Integer jiaochang;
    /**
    * 跖围
    */
    private Integer tuowei;
    /**
    * 气候区
    */
    private Integer qihouqu;
    /**
    * 数据创建时间
    */
    private Date creatAt;

}