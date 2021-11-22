package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Data;

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
    @CsvBindByPosition(position = 0)
    private String id;
    /**
    * 姓名
    */
    @CsvBindByPosition(position = 1)
    private String xingming;
    /**
    * 公民身份号
    */
    @CsvBindByPosition(position = 2)
    private String junrenbzh;
    /**
    * 人员类别名称
    */
    @CsvBindByPosition(position = 3)
    private String renyuanlbm;
    /**
    * 职务等级名称
    */
    @CsvBindByPosition(position = 4)
    private String zhiwudjm;
    /**
    * 军衔等级名称
    */
    @CsvBindByPosition(position = 5)
    private String junxiandjm;
    /**
    * 军兵种名称
    */
    @CsvBindByPosition(position = 6)
    private String junbingzmc;
    /**
    * 身高(厘米)
    */
    @CsvBindByPosition(position = 7)
    private Double shengao;
    /**
    * 胸围(厘米)
    */
    @CsvBindByPosition(position = 8)
    private Double xiongwei;
    /**
    * 腰围(厘米)
    */
    @CsvBindByPosition(position = 9)
    private Double yaowei;
    /**
    * 头围(厘米)
    */
    @CsvBindByPosition(position = 10)
    private Double touwei;
    /**
    * 脚长(厘米)
    */
    @CsvBindByPosition(position = 11)
    private Double jiaochang;
    /**
    * 跖围(厘米)
    */
    @CsvBindByPosition(position = 12)
    private Double zhiwei;
    /**
    * 气候区
    */
    @CsvBindByPosition(position = 13)
    private String qihouq;
    /**
    * 数据所在单位
    */
    @CsvBindByPosition(position = 14)
    private String shujuszdw;
    /**
    * 上报标志
    */
    @CsvBindByPosition(position = 15)
    private Double shangbaobz;
    /**
    * 单位代码
    */
    @CsvBindByPosition(position = 16)
    private String danweidm;
    /**
    * 导入时间
    */
    @CsvBindByPosition(position = 17)
    private String daorusj;
    /**
    * 所属被装单位代码
    */
    @CsvBindByPosition(position = 18)
    private String suosudwdm;
    /**
    * 部门名称
    */
    @CsvBindByPosition(position = 19)
    private String bumenmc;

}