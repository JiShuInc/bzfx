package com.cardinal.tech.bzfx.entity;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
/**
 * 人员住房情况(BzkSlgxYfRyzfqk)实体类
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
public class BzkSlgxYfRyzfqk implements Serializable {
    private static final long serialVersionUID = -37572220283112410L;
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
    * 公民身份号码
    */
    @CsvBindByName(column = "JUNRENBZH")
    private String junrenbzh;
    /**
    * 住房属性
    */
    @CsvBindByName(column = "ZHUFANGSX")
    private String zhufangsx;
    /**
    * 住房地址
    */
    @CsvBindByName(column = "ZHUFANGDZ")
    private String zhufangdz;
    /**
    * 住房管理（售房）单位
    */
    @CsvBindByName(column = "GUANLIDW")
    private String guanlidw;
    /**
    * 进住时间
    */
    @CsvBindByName(column = "JINZHUSJ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date jinzhusj;
    /**
    * 坐落号或土地证号
    */
    @CsvBindByName(column = "ZUOLUOH")
    private String zuoluoh;
    /**
    * 栋号
    */
    @CsvBindByName(column = "DONGHAO")
    private String donghao;
    /**
    * 房号
    */
    @CsvBindByName(column = "FANGHAO")
    private String fanghao;
    /**
    * 住房性质名称
    */
    @CsvBindByName(column = "ZHUFANGXZM")
    private String zhufangxzm;
    /**
    * 户型分类名称
    */
    @CsvBindByName(column = "HUXINGFLM")
    private String huxingflm;
    /**
    * 建筑面积
    */
    @CsvBindByName(column = "JIANZHUMJ")
    private Double jianzhumj;
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
    * 上报标志
    */
    @CsvBindByName(column = "SHANGBAOBZ")
    private Double shangbaobz;
    /**
    * 数据所在单位
    */
    @CsvBindByName(column = "SHUJUSZDW")
    private String shujuszdw;
    /**
    * 序号
    */
    @CsvBindByName(column = "XUHAO")
    private Double xuhao;

}