package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 文职人员级别(BzkBzTabWenzhiryjb)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
public class BzkBzTabWenzhiryjb implements Serializable {
    private static final long serialVersionUID = 178798036008146327L;
    /**
    * ID
    */
    private String id;
    /**
    * 文职人员级别代码
    */
    private String wenzhiryjbdm;
    /**
    * 文职人员级别
    */
    private String wenzhiryjb;
    /**
    * 文职人员大类
    */
    private String wenzhirydl;
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