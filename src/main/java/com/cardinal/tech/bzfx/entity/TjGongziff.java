package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 工资发放表(TjGongziff)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-13 01:33:38
 */
public class TjGongziff implements Serializable {
    private static final long serialVersionUID = -29027121482028787L;
    /**
    * id
    */
    private Long id;
    
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
    
    private String fafangyh;
    
    private Date fafangsj;
    /**
    * 数据创建时间
    */
    private Date creatAt;

}