package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 统计分析表(TjTongjifenxi)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:38
 */
public class TjTongjifenxi implements Serializable {
    private static final long serialVersionUID = 247737248644610154L;
    /**
    * id
    */
    private Long id;
    /**
    * 类型
    */
    private Integer type;
    /**
    * 参数1
    */
    private String parameter1;
    /**
    * 参数2
    */
    private String parameter2;
    /**
    * 参数3
    */
    private String parameter3;
    /**
    * 参数4
    */
    private String parameter4;
    /**
    * 参数5
    */
    private String parameter5;
    /**
    * 数量
    */
    private String num;
    /**
    * 创建时间
    */
    private Date creatAt;

}