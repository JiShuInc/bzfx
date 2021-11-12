package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 人员表(TjRenyuanxx)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-13 01:33:38
 */
public class TjRenyuanxx implements Serializable {
    private static final long serialVersionUID = 476582218278658456L;
    /**
    * id
    */
    private Long id;
    
    private String did;
    /**
    * 所属单位
    */
    private Long dwid;
    
    private String baozhangkh;
    
    private String shenfenzheng;
    
    private Integer xingbie;
    
    private Integer zhuangtai;
    
    private Integer leibie;
    
    private Integer minzu;
    
    private String chushengdi;
    /**
    * 出生日期
    */
    private Date chushengriqi;
    
    private Integer wenhua;
    
    private Integer xuewei;
    
    private Integer zhengzhimm;
    
    private Integer hunyin;
    
    private Integer ganbujxjb;
    
    private Integer shibingjxjb;
    
    private Integer wenzhijb;
    
    private Integer jiashusl;
    
    private Integer yanxiyw;
    
    private Integer zhiliury;
    
    private Integer zaizhiqk;
    
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
    
    private Integer jiashusj;
    
    private Integer jiguan;
    
    private Integer diaodongqk;
    
    private Integer zhuanyejndj;
    
    private Integer zhigongsflb;
    
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