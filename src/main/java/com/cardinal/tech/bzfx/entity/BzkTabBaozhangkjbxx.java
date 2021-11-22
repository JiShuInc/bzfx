package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;
import lombok.Data;

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
    @CsvBindByPosition(position = 0)
    private String id;
    /**
    * 军人ID
    */
    @CsvBindByPosition(position = 1)
    private String junrenid;
    /**
    * 保障卡号
    */
    @CsvBindByPosition(position = 2)
    private String baozhangkh;
    /**
    * 制卡原因：新制卡、补卡
    */
    @CsvBindByPosition(position = 3)
    private String zhikalx;
    /**
    * 制卡时间
    */
    @CsvBindByPosition(position = 4)
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date zhikasj;
    /**
    * 启用时间
    */
    @CsvBindByPosition(position = 5)
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date qiyongsj;
    /**
    * 失效时间
    */
    @CsvBindByPosition(position = 6)
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date shixiaosj;
    /**
    * 卡状态；代码
    */
    @CsvBindByPosition(position = 7)
    private String kazhuangtai;
    /**
    * 更新标志；1:新增，2：修改，3：删除
    */
    @CsvBindByPosition(position = 8)
    private Double gengxinbz;
    /**
    * 上报标志；0：未上报，1：已上报
    */
    @CsvBindByPosition(position = 9)
    private Double shangbaobz;
    /**
    * 分发标志；0：未分发，1：已分发 ，3：转供/合并未下发
    */
    @CsvBindByPosition(position = 10)
    private Double fenfabz;
    /**
    * 审核标志；0：未审核，1：已审核
    */
    @CsvBindByPosition(position = 11)
    private Double shenhebz;
    /**
    * 数据所在单位
    */
    @CsvBindByPosition(position = 12)
    private String shujuszdw;
    /**
    * 原军人ID
    */
    @CsvBindByPosition(position = 13)
    private String yuanid;
    /**
    * 是否当前卡；否：0，是：1
    */
    @CsvBindByPosition(position = 14)
    private Double shifoudqk;
    /**
    * 黑名单日期
    */
    @CsvBindByPosition(position = 15)
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date heimdrq;
    /**
    * 黑名单原因，"补换卡"、"人员注销"
    */
    @CsvBindByPosition(position = 16)
    private String heimdyy;
    /**
    * 卡类型，'1','2','3'
    */
    @CsvBindByPosition(position = 17)
    private String kaleixing;
    /**
    * 银行代码
    */
    @CsvBindByPosition(position = 18)
    private String yinhangdm;
    /**
    * 银行卡号
    */
    @CsvBindByPosition(position = 19)
    private String yinhangkh;
    /**
    * 发卡单位代码
    */
    @CsvBindByPosition(position = 20)
    private String fakadwdm;

}