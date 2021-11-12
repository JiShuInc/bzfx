package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 可视化模型(GgShowModel)实体类
 *
 * @author cadinal.tech
 * @since 2021-11-13 01:33:37
 */
public class GgShowModel implements Serializable {
    private static final long serialVersionUID = -59193697354442600L;
    /**
    * id
    */
    private Long id;
    /**
    * 名称
    */
    private String name;
    /**
    * 描述
    */
    private String description;
    /**
    * 表
    */
    private String table;
    /**
    * 字段
    */
    private String field;
    /**
    * 统计方法0-按照分类汇总
    */
    private Integer method;
    /**
    * 所属业务模块0-未知，1-融合展示，2-保障现状分析
    */
    private Integer module;
    /**
    * 分类[0-未分类，1-基本，2-财务，3-被装，4-医疗，5-营房]
    */
    private Integer category;
    /**
    * 是否客户端可编辑
    */
    private Integer editable;
    /**
    * 字典，数据值和描述的对应关系（前端自己处理）
    */
    private String dictionaries;
    /**
    * 样式[0-饼图，1-柱状图，2-折线图，3-表格]
    */
    private Integer style;
    /**
    * 在视图上的排序顺序(可重复)
    */
    private Integer order;
    /**
    * 数据创建时间
    */
    private Date creatAt;

}