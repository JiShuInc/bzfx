package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 任务数据-数据库(RhTaskDb)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:37
 */
public class RhTaskDb implements Serializable {
    private static final long serialVersionUID = 674040052150249967L;
    /**
    * id
    */
    private Long id;
    /**
    * 所属任务id
    */
    private Long taskId;
    /**
    * 主机
    */
    private String dbHost;
    /**
    * 用户名
    */
    private String dbName;
    /**
    * 密码
    */
    private String dbPasswd;
    /**
    * 数据创建时间
    */
    private Date creatAt;

}