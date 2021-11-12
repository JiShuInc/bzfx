package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 人员住房情况(TjZhufang)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-13 01:33:38
 */
public class TjZhufang implements Serializable {
    private static final long serialVersionUID = -99411916825677798L;
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
    * 住房属性
    */
    private Integer zhufangsx;
    /**
    * 进住时间
    */
    private Date jinzhusj;
    /**
    * 数据创建时间
    */
    private Date creatAt;

}