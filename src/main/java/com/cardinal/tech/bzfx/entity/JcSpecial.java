package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 专项任务(JcSpecial)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-13 19:28:46
 */
public class JcSpecial implements Serializable {
    private static final long serialVersionUID = -75748000023039450L;
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
    * 数据创建时间
    */
    private Date creatAt;

}