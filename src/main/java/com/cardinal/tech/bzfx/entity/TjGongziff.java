package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 工资发放表(TjGongziff)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:38
 */
public class TjGongziff implements Serializable {
    private static final long serialVersionUID = 245420237975746973L;
    /**
    * id
    */
    private Long id;
    /**
    * 原始id
    */
    private String did;
    /**
    * 人员id
    */
    private Long ryid;
    /**
    * 所属单位
    */
    private Long dwid;
    /**
    * 人员名称
    */
    private String rymc;
    /**
    * 单位名称
    */
    private String dwmc;
    /**
    * 工资
    */
    private Object gongzi;
    /**
    * 保险扣除
    */
    private Object baoxiankc;
    /**
    * 住房资金
    */
    private Object zhufangzj;
    /**
    * 发放银行
    */
    private String fafangyh;
    /**
    * 发放时间
    */
    private Date fafangsj;
    /**
    * 数据创建时间
    */
    private Date creatAt;

}