package com.cardinal.tech.bzfx.entity;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
/**
 * 保障卡基本信息(BzkTabBaozhangkjbxx)实体类
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
public class BzkTabBaozhangkjbxx implements Serializable {
    private static final long serialVersionUID = -70449572255516613L;
    /**
    * 主键ID
    */
    @CsvBindByName(column = "ID")
    private String id;
    /**
    * 军人ID
    */
    @CsvBindByName(column = "JUNRENID")
    private String junrenid;
    /**
    * 保障卡号
    */
    @CsvBindByName(column = "BAOZHANGKH")
    private String baozhangkh;
    /**
    * 制卡原因：新制卡、补卡
    */
    @CsvBindByName(column = "ZHIKALX")
    private String zhikalx;
    /**
    * 制卡时间
    */
    @CsvBindByName(column = "ZHIKASJ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date zhikasj;
    /**
    * 启用时间
    */
    @CsvBindByName(column = "QIYONGSJ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date qiyongsj;
    /**
    * 失效时间
    */
    @CsvBindByName(column = "SHIXIAOSJ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date shixiaosj;
    /**
    * 卡状态；代码
    */
    @CsvBindByName(column = "KAZHUANGTAI")
    private String kazhuangtai;
    /**
    * 更新标志；1:新增，2：修改，3：删除
    */
    @CsvBindByName(column = "GENGXINBZ")
    private Double gengxinbz;
    /**
    * 上报标志；0：未上报，1：已上报
    */
    @CsvBindByName(column = "SHANGBAOBZ")
    private Double shangbaobz;
    /**
    * 分发标志；0：未分发，1：已分发 ，3：转供/合并未下发
    */
    @CsvBindByName(column = "FENFABZ")
    private Double fenfabz;
    /**
    * 审核标志；0：未审核，1：已审核
    */
    @CsvBindByName(column = "SHENHEBZ")
    private Double shenhebz;
    /**
    * 数据所在单位
    */
    @CsvBindByName(column = "SHUJUSZDW")
    private String shujuszdw;
    /**
    * 原军人ID
    */
    @CsvBindByName(column = "YUANID")
    private String yuanid;
    /**
    * 是否当前卡；否：0，是：1
    */
    @CsvBindByName(column = "SHIFOUDQK")
    private Double shifoudqk;
    /**
    * 黑名单日期
    */
    @CsvBindByName(column = "HEIMDRQ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date heimdrq;
    /**
    * 黑名单原因，"补换卡"、"人员注销"
    */
    @CsvBindByName(column = "HEIMDYY")
    private String heimdyy;
    /**
    * 卡类型，'1','2','3'
    */
    @CsvBindByName(column = "KALEIXING")
    private String kaleixing;
    /**
    * 银行代码
    */
    @CsvBindByName(column = "YINHANGDM")
    private String yinhangdm;
    /**
    * 银行卡号
    */
    @CsvBindByName(column = "YINHANGKH")
    private String yinhangkh;
    /**
    * 发卡单位代码
    */
    @CsvBindByName(column = "FAKADWDM")
    private String fakadwdm;

}