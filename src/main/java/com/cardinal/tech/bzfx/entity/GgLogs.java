package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 日志(GgLogs)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-13 01:33:37
 */
public class GgLogs implements Serializable {
    private static final long serialVersionUID = -86103105217492145L;
    /**
    * id
    */
    private Long id;
    /**
    * 所属业务模块0-实力分析1-
    */
    private Integer module;
    /**
    * 类型0-普通，1-错误
    */
    private Integer type;
    
    private String content;
    /**
    * 数据创建时间
    */
    private Date creatAt;

}