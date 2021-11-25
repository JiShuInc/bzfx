package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 财务待遇人员类别(BzkBzTabCwdyrylb)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
public class BzkBzTabCwdyrylb implements Serializable {
    private static final long serialVersionUID = -59135616603525741L;
    /**
    * ID
    */
    private String id;
    /**
    * 财务待遇人员类别代码
    */
    private String cwdyrylbdm;
    /**
    * 财务待遇人员类别
    */
    private String cwdyrylb;
    /**
    * 是否显示；是、否
    */
    private String shifouxs;
    /**
    * 数据所在单位
    */
    private String shujuszdw;
    /**
    * 状态：正常，删除
    */
    private String zhuangtai;

}