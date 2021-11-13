package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 上传文件表(TjWenjian)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-13 21:10:08
 */
public class TjWenjian implements Serializable {
    private static final long serialVersionUID = -51046582748746946L;
    /**
    * id
    */
    private Long id;
    /**
    * 文件名称
    */
    private String name;
    /**
    * 路径
    */
    private String path;
    /**
    * 数据创建时间
    */
    private Date creatAt;

}