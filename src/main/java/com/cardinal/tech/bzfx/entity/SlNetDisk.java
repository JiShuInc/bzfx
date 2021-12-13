package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 文档资料(SlNetDisk)实体类
 *
 * @author makejava
 * @since 2021-12-10 17:21:12
 */
public class SlNetDisk implements Serializable {
    private static final long serialVersionUID = 769310223103829461L;
    /**
    * id
    */
    private Long id;
    /**
    * 用户id
    */
    private Long userid;
    /**
    * 用户名
    */
    private String username;
    /**
    * 文件ID
    */
    private Long fileid;
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