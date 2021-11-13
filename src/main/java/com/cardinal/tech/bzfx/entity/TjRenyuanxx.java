package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 人员表(TjRenyuanxx)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-13 19:28:47
 */
public class TjRenyuanxx implements Serializable {
    private static final long serialVersionUID = 592538861529559635L;
    /**
    * id
    */
    private Long id;
    /**
    * 原始数据id
    */
    private String did;
    /**
    * 所属单位
    */
    private Long dwid;
    /**
    * 保障卡号
    */
    private String baozhangkh;
    /**
    * 证件id
    */
    private String shenfenzheng;
    /**
    * 性别
    */
    private Integer xingbie;
    /**
    * 状态
    */
    private Integer zhuangtai;
    /**
    * 类别
    */
    private Integer leibie;
    /**
    * 民族
    */
    private Integer minzu;
    /**
    * 出生地
    */
    private String chushengdi;
    /**
    * 姓名
    */
    private String xingming;
    /**
    * 出生日期
    */
    private Date chushengriqi;
    /**
    * 文化程度
    */
    private Integer wenhua;
    /**
    * 学位
    */
    private Integer xuewei;
    /**
    * 政治面貌
    */
    private Integer zhengzhimm;
    /**
    * 婚姻情况（已婚/未婚）
    */
    private Integer hunyin;
    /**
    * 干部军衔级别（少尉到上将）
    */
    private Integer ganbujxjb;
    /**
    * 士兵军衔级别
    */
    private Integer shibingjxjb;
    /**
    * 文职人员级别
    */
    private Integer wenzhijb;
    /**
    * 家属信息（家属数量）
    */
    private Integer jiashusl;
    /**
    * 训练演习情况（有无）
    */
    private Integer yanxiyw;
    /**
    * 滞留部队人员（按一级单位）
    */
    private Integer zhiliury;
    /**
    * 在职情况（字典）
    */
    private Integer zaizhiqk;
    /**
    * 家属类别（字典表）
    */
    private Integer jiashulb;
    /**
    * 入伍时间
    */
    private Date ruwushijian;
    /**
    * 离开时间
    */
    private Date likaishijian;
    /**
    * 调入时间
    */
    private Date diaorushijian;
    /**
    * 调出时间
    */
    private Date diaochushijian;
    /**
    * 家属随军情况
    */
    private Integer jiashusj;
    /**
    * 籍贯
    */
    private Integer jiguan;
    /**
    * 调动情况
    */
    private Integer diaodongqk;
    /**
    * 专业技能等级
    */
    private Integer zhuanyejndj;
    /**
    * 职工身份类别
    */
    private Integer zhigongsflb;
    /**
    * 职工岗位等级
    */
    private Integer zhigonggwdj;
    /**
    * 职工年限
    */
    private Integer zhigongnx;
    /**
    * 是否是特殊人员
    */
    private Integer teshury;
    /**
    * 是否待移交转业干部
    */
    private Integer zhuanyegb;
    /**
    * 是否待移交复员干部
    */
    private Integer fuyuangb;
    /**
    * 是否待移交退休干部
    */
    private Integer tuixiugb;
    /**
    * 是否待移交转业士官
    */
    private Integer zhuanyesg;
    /**
    * 是否不享受军队优惠医疗的人员
    */
    private Integer buxiangshouyl;
    /**
    * 是否劳改服刑人员
    */
    private Integer laogaifuxing;
    /**
    * 是否滞留部队人员
    */
    private Integer zhiliubudui;
    /**
    * 数据创建时间
    */
    private Date creatAt;

}