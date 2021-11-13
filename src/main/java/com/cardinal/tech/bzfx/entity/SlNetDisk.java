package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 文档资料(SlNetDisk)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-13 19:28:47
 */
public class SlNetDisk implements Serializable {
    private static final long serialVersionUID = -99987877424146810L;
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