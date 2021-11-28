package com.cardinal.tech.bzfx.entity;

import com.opencsv.bean.CsvBindByName;
import lombok.Data;

import java.io.Serializable;

@Data
/**
 * 被装档案信息(BzkSlgxBzBzdaxx)实体类
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
public class BzkSlgxBzBzdaxx implements Serializable {
    private static final long serialVersionUID = -43690032755422393L;
    /**
    * id
    */
    @CsvBindByName(column = "ID")
    private String id;
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
    * 人员类别名称
    */
    @CsvBindByName(column = "RENYUANLBM")
    private String renyuanlbm;
    /**
    * 职务等级名称
    */
    @CsvBindByName(column = "ZHIWUDJM")
    private String zhiwudjm;
    /**
    * 军衔等级名称
    */
    @CsvBindByName(column = "JUNXIANDJM")
    private String junxiandjm;
    /**
    * 军兵种名称
    */
    @CsvBindByName(column = "JUNBINGZMC")
    private String junbingzmc;
    /**
    * 身高(厘米)
    */
    @CsvBindByName(column = "SHENGAO")
    private Double shengao;
    /**
    * 胸围(厘米)
    */
    @CsvBindByName(column = "XIONGWEI")
    private Double xiongwei;
    /**
    * 腰围(厘米)
    */
    @CsvBindByName(column = "YAOWEI")
    private Double yaowei;
    /**
    * 头围(厘米)
    */
    @CsvBindByName(column = "TOUWEI")
    private Double touwei;
    /**
    * 脚长(厘米)
    */
    @CsvBindByName(column = "JIAOCHANG")
    private Double jiaochang;
    /**
    * 跖围(厘米)
    */
    @CsvBindByName(column = "ZHIWEI")
    private Double zhiwei;
    /**
    * 气候区
    */
    @CsvBindByName(column = "QIHOUQ")
    private String qihouq;
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
    * 所属被装单位代码
    */
    @CsvBindByName(column = "SUOSUDWDM")
    private String suosudwdm;
    /**
    * 部门名称
    */
    @CsvBindByName(column = "BUMENMC")
    private String bumenmc;

}