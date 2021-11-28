package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 保障卡基本信息(TaskBzkTabBaozhangkjbxx)实体类
 *
 * @author makejava
 * @since 2021-11-28 12:40:57
 */
public class TaskBzkTabBaozhangkjbxx implements Serializable {
    private static final long serialVersionUID = 440432997429850422L;
    /**
    * 任务ID
    */
    private Long taskid;
    /**
    * 主键ID
    */
    private String id;
    /**
    * 军人ID
    */
    private String junrenid;
    /**
    * 保障卡号
    */
    private String baozhangkh;
    /**
    * 制卡原因：新制卡、补卡
    */
    private String zhikalx;
    /**
    * 制卡时间
    */
    private Date zhikasj;
    /**
    * 启用时间
    */
    private Date qiyongsj;
    /**
    * 失效时间
    */
    private Date shixiaosj;
    /**
    * 卡状态；代码
    */
    private String kazhuangtai;
    /**
    * 更新标志；1:新增，2：修改，3：删除
    */
    private Double gengxinbz;
    /**
    * 上报标志；0：未上报，1：已上报
    */
    private Double shangbaobz;
    /**
    * 分发标志；0：未分发，1：已分发 ，3：转供/合并未下发
    */
    private Double fenfabz;
    /**
    * 审核标志；0：未审核，1：已审核
    */
    private Double shenhebz;
    /**
    * 数据所在单位
    */
    private String shujuszdw;
    /**
    * 原军人ID
    */
    private String yuanid;
    /**
    * 是否当前卡；否：0，是：1
    */
    private Double shifoudqk;
    /**
    * 黑名单日期
    */
    private Date heimdrq;
    /**
    * 黑名单原因，"补换卡"、"人员注销"
    */
    private String heimdyy;
    /**
    * 卡类型，'1','2','3'
    */
    private String kaleixing;
    /**
    * 银行代码
    */
    private String yinhangdm;
    /**
    * 银行卡号
    */
    private String yinhangkh;
    /**
    * 发卡单位代码
    */
    private String fakadwdm;

}