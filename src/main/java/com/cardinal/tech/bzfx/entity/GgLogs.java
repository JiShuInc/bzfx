package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 日志(GgLogs)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:37
 */
public class GgLogs implements Serializable {
    private static final long serialVersionUID = 133590925749246956L;
    /**
    * id
    */
    private Long id;
    /**
    * 0-实力数据对接日志监控，1-数据融合日志，2-多源异构数据质量控制，
    */
    private Integer module;
    /**
    * 类型0-普通，1-错误
    */
    private Integer type;
    /**
    * 内容
    */
    private String content;
    /**
    * 数据创建时间
    */
    private Date creatAt;

}