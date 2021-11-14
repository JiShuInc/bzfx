package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 接口(JkApi)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-14 14:09:12
 */
public class JkApi implements Serializable {
    private static final long serialVersionUID = 649897253797437423L;
    /**
    * id
    */
    private Long id;
    /**
    * 名称
    */
    private String name;
    /**
    * 描述
    */
    private String description;
    /**
    * 详情
    */
    private String doc;
    /**
    * 状态[0-关停，1-发布]
    */
    private Integer state;
    /**
    * 数据创建时间
    */
    private Date creatAt;

}