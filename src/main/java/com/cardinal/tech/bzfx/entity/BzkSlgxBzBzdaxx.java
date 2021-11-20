package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
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
    private String id;
    /**
    * 姓名
    */
    private String xingming;
    /**
    * 公民身份号
    */
    private String junrenbzh;
    /**
    * 人员类别名称
    */
    private String renyuanlbm;
    /**
    * 职务等级名称
    */
    private String zhiwudjm;
    /**
    * 军衔等级名称
    */
    private String junxiandjm;
    /**
    * 军兵种名称
    */
    private String junbingzmc;
    /**
    * 身高(厘米)
    */
    private Double shengao;
    /**
    * 胸围(厘米)
    */
    private Double xiongwei;
    /**
    * 腰围(厘米)
    */
    private Double yaowei;
    /**
    * 头围(厘米)
    */
    private Double touwei;
    /**
    * 脚长(厘米)
    */
    private Double jiaochang;
    /**
    * 跖围(厘米)
    */
    private Double zhiwei;
    /**
    * 气候区
    */
    private String qihouq;
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
    * 所属被装单位代码
    */
    private String suosudwdm;
    /**
    * 部门名称
    */
    private String bumenmc;

}