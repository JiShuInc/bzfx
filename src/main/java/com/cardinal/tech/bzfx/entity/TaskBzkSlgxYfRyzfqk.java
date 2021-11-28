package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 人员住房情况(TaskBzkSlgxYfRyzfqk)实体类
 *
 * @author makejava
 * @since 2021-11-28 12:40:57
 */
public class TaskBzkSlgxYfRyzfqk implements Serializable {
    private static final long serialVersionUID = -33580021503287970L;
    /**
    * 任务ID
    */
    private Long taskid;
    /**
    * id
    */
    private String id;
    /**
    * 姓名
    */
    private String xingming;
    /**
    * 公民身份号码
    */
    private String junrenbzh;
    /**
    * 住房属性
    */
    private String zhufangsx;
    /**
    * 住房地址
    */
    private String zhufangdz;
    /**
    * 住房管理（售房）单位
    */
    private String guanlidw;
    /**
    * 进住时间
    */
    private Date jinzhusj;
    /**
    * 坐落号或土地证号
    */
    private String zuoluoh;
    /**
    * 栋号
    */
    private String donghao;
    /**
    * 房号
    */
    private String fanghao;
    /**
    * 住房性质名称
    */
    private String zhufangxzm;
    /**
    * 户型分类名称
    */
    private String huxingflm;
    /**
    * 建筑面积
    */
    private Double jianzhumj;
    /**
    * 单位代码
    */
    private String danweidm;
    /**
    * 导入时间
    */
    private String daorusj;
    /**
    * 上报标志
    */
    private Double shangbaobz;
    /**
    * 数据所在单位
    */
    private String shujuszdw;
    /**
    * 序号
    */
    private Double xuhao;

}