package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 单位信息表(TjDanweixx)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:38
 */
public class TjDanweixx implements Serializable {
    private static final long serialVersionUID = -93679569344083904L;
    /**
    * id
    */
    private Long id;
    /**
    * 原始数据ID
    */
    private String did;
    /**
    * 单位级别
    */
    private Integer danweijb;
    /**
    * 单位编码（隶属关系）
    */
    private String danweibm;
    /**
    * 单位名称
    */
    private String mingcheng;
    /**
    * 单位描述
    */
    private String miaoshu;
    /**
    * 经度
    */
    private String jingdu;
    /**
    * 纬度
    */
    private String weidu;
    /**
    * 单位性质
    */
    private Integer danweixz;
    /**
    * 单位供应关系
    */
    private Integer danweigygx;
    /**
    * 单位编制员额（数字分段）
    */
    private Integer danweibzyy;
    /**
    * 单位保障力量
    */
    private String danweibzllid;
    /**
    * 驻地（按省份地图）
    */
    private Integer zhudi;
    /**
    * 干部人数
    */
    private Integer ganburs;
    /**
    * 战士人数
    */
    private Integer zhanshirs;
    /**
    * 财务保障人数
    */
    private Integer caiwubzrs;
    /**
    * 被装保障人数
    */
    private Integer beizhuangbzrs;
    /**
    * 住房数量
    */
    private Integer zhufangsl;
    /**
    * 数据创建时间
    */
    private Date creatAt;

}