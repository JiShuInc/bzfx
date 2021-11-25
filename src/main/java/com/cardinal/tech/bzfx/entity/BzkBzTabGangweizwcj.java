package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 岗位职务层级标准编码(BzkBzTabGangweizwcj)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
public class BzkBzTabGangweizwcj implements Serializable {
    private static final long serialVersionUID = 168195510494787066L;
    /**
    * 主键ID
    */
    private String id;
    /**
    * 岗位职务层级代码
    */
    private String gangweizwcjdm;
    /**
    * 岗位职务层级名称
    */
    private String gangweizwcj;
    /**
    * 对应人员类别，如指挥管理军官、专业技术军官
    */
    private String duiyingrylb;
    /**
    * 对应原职务（专业技术职务）等级
    */
    private String duiyingyzwdj;
    /**
    * 对应原职务（专业技术职务）等级代码
    */
    private String duiyingyzwdjdm;
    /**
    * 对应原财务职务（专业技术职务）等级
    */
    private String duiyingycwzwdj;
    /**
    * 对应原财务职务（专业技术职务）等级代码
    */
    private String duiyingycwzwdjdm;
    /**
    * 是否显示：是、否
    */
    private String shifouxs;
    /**
    * 数据所在单位
    */
    private String shujuszdw;
    /**
    * 状态：正常、删除
    */
    private String zhuangtai;

}