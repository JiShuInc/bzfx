package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;
import lombok.Data;

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
    @CsvBindByPosition(position = 0)
    private String id;
    /**
    * 姓名
    */
    @CsvBindByPosition(position = 1)
    private String xingming;
    /**
    * 公民身份号码
    */
    @CsvBindByPosition(position = 2)
    private String junrenbzh;
    /**
    * 住房属性
    */
    @CsvBindByPosition(position = 3)
    private String zhufangsx;
    /**
    * 住房地址
    */
    @CsvBindByPosition(position = 4)
    private String zhufangdz;
    /**
    * 住房管理（售房）单位
    */
    @CsvBindByPosition(position = 5)
    private String guanlidw;
    /**
    * 进住时间
    */
    @CsvBindByPosition(position = 6)
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date jinzhusj;
    /**
    * 坐落号或土地证号
    */
    @CsvBindByPosition(position = 7)
    private String zuoluoh;
    /**
    * 栋号
    */
    @CsvBindByPosition(position = 8)
    private String donghao;
    /**
    * 房号
    */
    @CsvBindByPosition(position = 9)
    private String fanghao;
    /**
    * 住房性质名称
    */
    @CsvBindByPosition(position = 10)
    private String zhufangxzm;
    /**
    * 户型分类名称
    */
    @CsvBindByPosition(position = 11)
    private String huxingflm;
    /**
    * 建筑面积
    */
    @CsvBindByPosition(position = 12)
    private Double jianzhumj;
    /**
    * 单位代码
    */
    @CsvBindByPosition(position = 13)
    private String danweidm;
    /**
    * 导入时间
    */
    @CsvBindByPosition(position = 14)
    private String daorusj;
    /**
    * 上报标志
    */
    @CsvBindByPosition(position = 15)
    private Double shangbaobz;
    /**
    * 数据所在单位
    */
    @CsvBindByPosition(position = 16)
    private String shujuszdw;
    /**
    * 序号
    */
    @CsvBindByPosition(position = 17)
    private Double xuhao;

}