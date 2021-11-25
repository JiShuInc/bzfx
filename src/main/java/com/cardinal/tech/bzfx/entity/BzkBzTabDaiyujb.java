package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 待遇级别标准编码(BzkBzTabDaiyujb)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
public class BzkBzTabDaiyujb implements Serializable {
    private static final long serialVersionUID = 453068331241585737L;
    /**
    * ID
    */
    private String id;
    /**
    * 待遇级别代码
    */
    private String daiyujbdm;
    /**
    * 待遇级别名称
    */
    private String daiyujb;
    /**
    * 对应原职务（专业技术）等级
    */
    private String duiyingyzwdj;
    /**
    * 对应原职务（专业技术）等级代码
    */
    private String duiyingyzwdjdm;
    /**
    * 对应原财务职务（专业技术）等级
    */
    private String duiyingycwzwdj;
    /**
    * 对应原财务职务（专业技术）等级代码
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