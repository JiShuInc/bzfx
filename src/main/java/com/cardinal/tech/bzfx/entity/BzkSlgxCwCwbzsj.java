package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;
import lombok.Data;

@Data
/**
 * 财务保障数据(BzkSlgxCwCwbzsj)实体类
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
public class BzkSlgxCwCwbzsj implements Serializable {
    private static final long serialVersionUID = 412191281325899002L;
    /**
    * id
    */
    @CsvBindByName(column = "ID")
    private String id;
    /**
    * 发放时间
    */
    @CsvBindByName(column = "FAFANGSJ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date fafangsj;
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
    * 职务等级工资
    */
    @CsvBindByName(column = "ZHIWUGZ")
    private Double zhiwugz;
    /**
    * 军衔级别工资
    */
    @CsvBindByName(column = "JUNXIANGZ")
    private Double junxiangz;
    /**
    * 军龄工资
    */
    @CsvBindByName(column = "JUNLINGGZ")
    private Double junlinggz;
    /**
    * 军人职业津贴
    */
    @CsvBindByName(column = "ZHIWUBT")
    private Double zhiwubt;
    /**
    * 其他
    */
    @CsvBindByName(column = "QITAGZ")
    private Double qitagz;
    /**
    * 应发小计
    */
    @CsvBindByName(column = "YINGFAGZ")
    private Double yingfagz;
    /**
    * 实发
    */
    @CsvBindByName(column = "SHIFAGZ")
    private Double shifagz;
    /**
    * 伤亡保险余额
    */
    @CsvBindByName(column = "SHANGWANGBXYE")
    private Double shangwangbxye;
    /**
    * 退役医疗保险余额
    */
    @CsvBindByName(column = "TUIYIYLBXYE")
    private Double tuiyiylbxye;
    /**
    * 住房补贴余额
    */
    @CsvBindByName(column = "ZHUFANGBTYE")
    private Double zhufangbtye;
    /**
    * 住房公积金余额
    */
    @CsvBindByName(column = "ZHUFANGGJJYE")
    private Double zhufanggjjye;
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
    * 工作性津贴
    */
    @CsvBindByName(column = "GONGZUOJT")
    private Double gongzuojt;
    /**
    * 生活性补贴
    */
    @CsvBindByName(column = "SHENGHUOJT")
    private Double shenghuojt;
    /**
    * 扣医保
    */
    @CsvBindByName(column = "KOUYB")
    private Double kouyb;
    /**
    * 扣伤保
    */
    @CsvBindByName(column = "KOUSB")
    private Double kousb;
    /**
    * 其他扣发
    */
    @CsvBindByName(column = "QITAKF")
    private Double qitakf;
    /**
    * 当月计算基本住房补贴额
    */
    @CsvBindByName(column = "DYZHUFANGBT")
    private Double dyzhufangbt;
    /**
    * 当月归集体住房公积金额
    */
    @CsvBindByName(column = "DYZHUFANGGJJ")
    private Double dyzhufanggjj;
    /**
    * 扣发小计
    */
    @CsvBindByName(column = "KOUFAXJ")
    private Double koufaxj;
    /**
    * 货币补差累计余额
    */
    @CsvBindByName(column = "HUOBIBCLJYE")
    private Double huobibcljye;

}