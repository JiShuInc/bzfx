package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 体系医院标准编码(TjTixiyy)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:38
 */
public class TjTixiyy implements Serializable {
    private static final long serialVersionUID = 177639838779540182L;
    /**
    * id
    */
    private Long id;
    /**
    * 原始数据ID
    */
    private String did;
    /**
    * 所属单位
    */
    private Long dwid;
    /**
    * 单位名称
    */
    private String dwmc;
    /**
    * 医疗单位代码
    */
    private Integer yiliaodwdm;
    /**
    * 医疗单位名称
    */
    private String yiliaodwmc;
    /**
    * 数据创建时间
    */
    private Date creatAt;

}