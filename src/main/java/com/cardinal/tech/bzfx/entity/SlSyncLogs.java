package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 数据同步日志(SlSyncLogs)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:37
 */
public class SlSyncLogs implements Serializable {
    private static final long serialVersionUID = 433278840465484753L;
    /**
    * id
    */
    private Long id;
    /**
    * 主机
    */
    private String dbHost;
    /**
    * 同步开始时间
    */
    private Date syncAt;
    /**
    * 同步结束时间
    */
    private Date syncEnd;
    /**
    * 同步状态0-未同步，1-同步中，2-已同步
    */
    private Integer state;
    /**
    * 同步结果0-成功，1-错误
    */
    private Integer result;
    /**
    * 同步日志
    */
    private String remark;
    /**
    * 同步的数据记录条数
    */
    private Long dataTotal;
    /**
    * 数据创建时间
    */
    private Date creatAt;

}