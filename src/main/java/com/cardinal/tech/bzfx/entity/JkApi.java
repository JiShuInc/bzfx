package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 接口(JkApi)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-13 19:28:46
 */
public class JkApi implements Serializable {
    private static final long serialVersionUID = 352012866417489936L;
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
    * 数据创建时间
    */
    private Date creatAt;

}