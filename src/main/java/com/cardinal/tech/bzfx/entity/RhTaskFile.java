package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 任务数据-文件(RhTaskFile)实体类
 *
 * @author makejava
 * @since 2021-11-21 18:48:45
 */
public class RhTaskFile implements Serializable {
    private static final long serialVersionUID = -87808097998565553L;
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
    * 对应表
    */
    private String tableName;
    /**
    * 同步状态0-未同步，1-同步中，2-已同步
    */
    private Integer state;
    /**
    * 同步结果0-成功，1-错误
    */
    private Integer result;
    
    private Date syncAt;
    
    private Date syncEnd;
    /**
    * 数据创建时间
    */
    private Date creatAt;

}