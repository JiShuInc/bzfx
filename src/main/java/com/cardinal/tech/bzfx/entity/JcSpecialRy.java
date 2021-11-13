package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 专项任务人员(JcSpecialRy)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:37
 */
public class JcSpecialRy implements Serializable {
    private static final long serialVersionUID = -60437097006764621L;
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
    private Long rid;
    /**
    * 数据创建时间
    */
    private Date creatAt;

}