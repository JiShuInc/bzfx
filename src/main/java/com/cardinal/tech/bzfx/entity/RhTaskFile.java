package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 任务数据-文件(RhTaskFile)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-14 14:09:12
 */
public class RhTaskFile implements Serializable {
    private static final long serialVersionUID = -80434383105650168L;
    /**
    * id
    */
    private Long id;
    /**
    * 所属任务id
    */
    private Long taskId;
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