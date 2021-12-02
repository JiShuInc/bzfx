package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 专项任务(JcSpecial)实体类
 *
 * @author makejava
 * @since 2021-12-02 22:15:38
 */
public class JcSpecial implements Serializable {
    private static final long serialVersionUID = -98502523896087374L;
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
    * 统计状态[0-未统计，1-统计中，2-已统计]
    */
    private Integer tjState;
    /**
    * 最后统计完成的时间
    */
    private Date tjDate;
    /**
    * 数据创建时间
    */
    private Date creatAt;

}