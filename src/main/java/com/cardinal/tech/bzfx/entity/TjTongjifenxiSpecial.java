package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 专项任务统计分析表(TjTongjifenxiSpecial)实体类
 *
 * @author makejava
 * @since 2021-12-04 19:29:47
 */
public class TjTongjifenxiSpecial implements Serializable {
    private static final long serialVersionUID = -90018752017675510L;
    /**
    * id
    */
    private Long id;
    /**
    * 专项任务id
    */
    private Integer sid;
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