package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 文档资料(SlNetDisk)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:37
 */
public class SlNetDisk implements Serializable {
    private static final long serialVersionUID = -90011144021864196L;
    /**
    * id
    */
    private Long id;
    /**
    * 人员id
    */
    private Long userid;
    /**
    * 文件名
    */
    private String filename;
    /**
    * 路径
    */
    private String url;
    /**
    * 数据创建时间
    */
    private Date creatAt;

}