package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 专项任务人员(JcSpecialRy)实体类
 *
 * @author makejava
 * @since 2021-11-20 16:56:41
 */
public class JcSpecialRy implements Serializable {
    private static final long serialVersionUID = 312858772792222441L;
    /**
    * id
    */
    private Long id;
    /**
    * 专项任务id
    */
    private Long sid;
    /**
    * 人员id
    */
    private String rid;
    /**
    * 数据创建时间
    */
    private Date creatAt;

}