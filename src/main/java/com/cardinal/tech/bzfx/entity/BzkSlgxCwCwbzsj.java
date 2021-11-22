package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;

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
    @CsvBindByPosition(position = 0)
    private String id;
    /**
    * 发放时间
    */
    @CsvBindByPosition(position = 1)
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date fafangsj;
    /**
    * 姓名
    */
    @CsvBindByPosition(position = 2)
    private String xingming;
    /**
    * 公民身份号
    */
    @CsvBindByPosition(position = 3)
    private String junrenbzh;
    /**
    * 职务等级工资
    */
    @CsvBindByPosition(position = 4)
    private Double zhiwugz;
    /**
    * 军衔级别工资
    */
    @CsvBindByPosition(position = 5)
    private Double junxiangz;
    /**
    * 军龄工资
    */
    @CsvBindByPosition(position = 6)
    private Double junlinggz;
    /**
    * 军人职业津贴
    */
    @CsvBindByPosition(position = 7)
    private Double zhiwubt;
    /**
    * 其他
    */
    @CsvBindByPosition(position = 8)
    private Double qitagz;
    /**
    * 应发小计
    */
    @CsvBindByPosition(position = 9)
    private Double yingfagz;
    /**
    * 实发
    */
    @CsvBindByPosition(position = 10)
    private Double shifagz;
    /**
    * 伤亡保险余额
    */
    @CsvBindByPosition(position = 11)
    private Double shangwangbxye;
    /**
    * 退役医疗保险余额
    */
    @CsvBindByPosition(position = 12)
    private Double tuiyiylbxye;
    /**
    * 住房补贴余额
    */
    @CsvBindByPosition(position = 13)
    private Double zhufangbtye;
    /**
    * 住房公积金余额
    */
    @CsvBindByPosition(position = 14)
    private Double zhufanggjjye;
    /**
    * 数据所在单位
    */
    @CsvBindByPosition(position = 15)
    private String shujuszdw;
    /**
    * 上报标志
    */
    @CsvBindByPosition(position = 16)
    private Double shangbaobz;
    /**
    * 单位代码
    */
    @CsvBindByPosition(position = 17)
    private String danweidm;
    /**
    * 导入时间
    */
    @CsvBindByPosition(position = 18)
    private String daorusj;
    /**
    * 工作性津贴
    */
    @CsvBindByPosition(position = 19)
    private Double gongzuojt;
    /**
    * 生活性补贴
    */
    @CsvBindByPosition(position = 20)
    private Double shenghuojt;
    /**
    * 扣医保
    */
    @CsvBindByPosition(position = 21)
    private Double kouyb;
    /**
    * 扣伤保
    */
    @CsvBindByPosition(position = 22)
    private Double kousb;
    /**
    * 其他扣发
    */
    @CsvBindByPosition(position = 23)
    private Double qitakf;
    /**
    * 当月计算基本住房补贴额
    */
    @CsvBindByPosition(position = 24)
    private Double dyzhufangbt;
    /**
    * 当月归集体住房公积金额
    */
    @CsvBindByPosition(position = 25)
    private Double dyzhufanggjj;
    /**
    * 扣发小计
    */
    @CsvBindByPosition(position = 26)
    private Double koufaxj;
    /**
    * 货币补差累计余额
    */
    @CsvBindByPosition(position = 27)
    private Double huobibcljye;

}