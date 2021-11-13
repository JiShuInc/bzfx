package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 任务数据-文件(RhTaskFile)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-13 19:28:46
 */
public class RhTaskFile implements Serializable {
    private static final long serialVersionUID = -18158577268714523L;
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