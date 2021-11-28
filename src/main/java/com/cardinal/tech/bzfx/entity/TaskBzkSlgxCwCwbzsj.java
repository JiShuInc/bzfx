package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 财务保障数据(TaskBzkSlgxCwCwbzsj)实体类
 *
 * @author makejava
 * @since 2021-11-28 12:40:57
 */
public class TaskBzkSlgxCwCwbzsj implements Serializable {
    private static final long serialVersionUID = -55826414565846128L;
    /**
    * 任务ID
    */
    private Long taskid;
    /**
    * id
    */
    private String id;
    /**
    * 发放时间
    */
    private Date fafangsj;
    /**
    * 姓名
    */
    private String xingming;
    /**
    * 公民身份号
    */
    private String junrenbzh;
    /**
    * 职务等级工资
    */
    private Double zhiwugz;
    /**
    * 军衔级别工资
    */
    private Double junxiangz;
    /**
    * 军龄工资
    */
    private Double junlinggz;
    /**
    * 军人职业津贴
    */
    private Double zhiwubt;
    /**
    * 其他
    */
    private Double qitagz;
    /**
    * 应发小计
    */
    private Double yingfagz;
    /**
    * 实发
    */
    private Double shifagz;
    /**
    * 伤亡保险余额
    */
    private Double shangwangbxye;
    /**
    * 退役医疗保险余额
    */
    private Double tuiyiylbxye;
    /**
    * 住房补贴余额
    */
    private Double zhufangbtye;
    /**
    * 住房公积金余额
    */
    private Double zhufanggjjye;
    /**
    * 数据所在单位
    */
    private String shujuszdw;
    /**
    * 上报标志
    */
    private Double shangbaobz;
    /**
    * 单位代码
    */
    private String danweidm;
    /**
    * 导入时间
    */
    private String daorusj;
    /**
    * 工作性津贴
    */
    private Double gongzuojt;
    /**
    * 生活性补贴
    */
    private Double shenghuojt;
    /**
    * 扣医保
    */
    private Double kouyb;
    /**
    * 扣伤保
    */
    private Double kousb;
    /**
    * 其他扣发
    */
    private Double qitakf;
    /**
    * 当月计算基本住房补贴额
    */
    private Double dyzhufangbt;
    /**
    * 当月归集体住房公积金额
    */
    private Double dyzhufanggjj;
    /**
    * 扣发小计
    */
    private Double koufaxj;
    /**
    * 货币补差累计余额
    */
    private Double huobibcljye;

}