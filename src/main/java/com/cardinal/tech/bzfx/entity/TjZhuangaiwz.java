package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 军官和文职干部互改记录表(TjZhuangaiwz)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:38
 */
public class TjZhuangaiwz implements Serializable {
    private static final long serialVersionUID = 845829357819670122L;
    /**
    * id
    */
    private Long id;
    /**
    * 原始数据ID
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
    * 转改时间
    */
    private Date zhuangaisj;
    /**
    * 数据创建时间
    */
    private Date creatAt;

}