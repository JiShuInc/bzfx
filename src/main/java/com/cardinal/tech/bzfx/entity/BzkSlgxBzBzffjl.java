package com.cardinal.tech.bzfx.entity;

import com.opencsv.bean.CsvBindByName;
import lombok.Data;

import java.io.Serializable;

@Data
/**
 * 被装发放记录(BzkSlgxBzBzffjl)实体类
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
public class BzkSlgxBzBzffjl implements Serializable {
    private static final long serialVersionUID = -82285782829826797L;
    /**
    * id
    */
    @CsvBindByName(column = "ID")
    private String id;
    /**
    * 发放时间（年度+月份，如200105）
    */
    @CsvBindByName(column = "FAFANGSJ")
    private String fafangsj;
    /**
    * 姓名
    */
    @CsvBindByName(column = "XINGMING")
    private String xingming;
    /**
    * 公民身份号
    */
    @CsvBindByName(column = "JUNRENBZH")
    private String junrenbzh;
    /**
    * 品种名称
    */
    @CsvBindByName(column = "PINZHONGM")
    private String pinzhongm;
    /**
    * 着装号型名称
    */
    @CsvBindByName(column = "ZHUOZHUANGHXM")
    private String zhuozhuanghxm;
    /**
    * 计量单位
    */
    @CsvBindByName(column = "JILIANGDW")
    private String jiliangdw;
    /**
    * 数量
    */
    @CsvBindByName(column = "SHULIANG")
    private Double shuliang;
    /**
    * 起算年度，2008
    */
    @CsvBindByName(column = "QISUANND")
    private String qisuannd;
    /**
    * 数据所在单位
    */
    @CsvBindByName(column = "SHUJUSZDW")
    private String shujuszdw;
    /**
    * 上报标志
    */
    @CsvBindByName(column = "SHANGBAOBZ")
    private Double shangbaobz;
    /**
    * 单位代码
    */
    @CsvBindByName(column = "DANWEIDM")
    private String danweidm;
    /**
    * 导入时间
    */
    @CsvBindByName(column = "DAORUSJ")
    private String daorusj;
    /**
    * 品种代码
    */
    @CsvBindByName(column = "PINZHONG")
    private String pinzhong;

}