package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 任务数据-数据库(RhTaskDb)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-11 20:18:33
 */
public class RhTaskDb implements Serializable {
    private static final long serialVersionUID = 115668392040270847L;
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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getDbHost() {
        return dbHost;
    }

    public void setDbHost(String dbHost) {
        this.dbHost = dbHost;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getDbPasswd() {
        return dbPasswd;
    }

    public void setDbPasswd(String dbPasswd) {
        this.dbPasswd = dbPasswd;
    }

    public Date getCreatAt() {
        return creatAt;
    }

    public void setCreatAt(Date creatAt) {
        this.creatAt = creatAt;
    }

}