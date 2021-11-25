package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 军衔(BzkBzTabCwjxjb)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
public class BzkBzTabCwjxjb implements Serializable {
    private static final long serialVersionUID = -67817830445819505L;
    /**
    * ID
    */
    private String id;
    /**
    * 军衔代码
    */
    private String junxiandm;
    /**
    * 军衔
    */
    private String junxian;
    /**
    * 工薪代码
    */
    private String gongxindm;
    /**
    * 工薪名称
    */
    private String gongxinmc;
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
    /**
    * 卫生身份类别
    */
    private String wssflb;
    /**
    * 卫生军衔
    */
    private String wsjx;
    /**
    * 卫生身份类别名称
    */
    private String wssflbmc;

}