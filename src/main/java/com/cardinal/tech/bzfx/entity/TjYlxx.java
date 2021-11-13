package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 医疗信息(TjYlxx)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-13 19:28:47
 */
public class TjYlxx implements Serializable {
    private static final long serialVersionUID = -90459140506308715L;
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
    * 所属体系医院
    */
    private Long yyid;
    /**
    * 医疗关系所在单位代码
    */
    private Long yiliaogx;
    /**
    * 血型
    */
    private Integer xuexing;
    /**
    * 数据创建时间
    */
    private Date creatAt;

}