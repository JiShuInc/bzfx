package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 保障卡卡记录表(TjBaozhangkajl)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-13 19:28:47
 */
public class TjBaozhangkajl implements Serializable {
    private static final long serialVersionUID = -76476520857131759L;
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
    * 制卡原因，0制卡，1补卡
    */
    private Integer zhikayy;
    /**
    * 制卡时间
    */
    private Date zhikasj;
    /**
    * 保障卡号
    */
    private String baozhangkh;
    /**
    * 数据创建时间
    */
    private Date creatAt;

}