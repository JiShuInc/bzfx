package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 军官和文职干部互改记录表(TjZhuangaiwz)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-13 19:28:47
 */
public class TjZhuangaiwz implements Serializable {
    private static final long serialVersionUID = 830914791080480181L;
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
    * 转改时间
    */
    private Date zhuangaisj;
    /**
    * 数据创建时间
    */
    private Date creatAt;

}