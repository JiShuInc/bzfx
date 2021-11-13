package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 任务(RhTask)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-13 19:28:46
 */
public class RhTask implements Serializable {
    private static final long serialVersionUID = 605923104334844562L;
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
    * 任务数据转换状态[0未转换，1转换中，2已转换]
    */
    private Integer dbState;
    /**
    * 数据创建时间
    */
    private Date creatAt;

}