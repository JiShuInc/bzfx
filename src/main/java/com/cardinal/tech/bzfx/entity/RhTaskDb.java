package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 任务数据-数据库(RhTaskDb)实体类
 *
 * @author makejava
 * @since 2021-11-17 19:31:39
 */
public class RhTaskDb implements Serializable {
    private static final long serialVersionUID = 592224870919213884L;
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
    * 同步状态0-未同步，1-同步中，2-已同步
    */
    private Integer state;
    /**
    * 同步结果0-成功，1-错误
    */
    private Integer result;
    /**
    * 同步开始时间
    */
    private String syncAt;
    /**
    * 同步结束时间
    */
    private String syncEnd;
    /**
    * 数据创建时间
    */
    private Date creatAt;

}