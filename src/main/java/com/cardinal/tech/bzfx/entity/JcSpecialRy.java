package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 专项任务人员(JcSpecialRy)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-14 14:17:25
 */
public class JcSpecialRy implements Serializable {
    private static final long serialVersionUID = -79951730688746247L;
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
    * 人员名称
    */
    private String rymc;
    /**
    * 数据创建时间
    */
    private Date creatAt;

}