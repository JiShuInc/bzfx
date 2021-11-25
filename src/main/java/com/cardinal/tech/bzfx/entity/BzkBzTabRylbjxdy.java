package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 人员类别军衔对应表(BzkBzTabRylbjxdy)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:57
 */
public class BzkBzTabRylbjxdy implements Serializable {
    private static final long serialVersionUID = -49000935386629879L;
    /**
    * 主键ID
    */
    private String id;
    /**
    * 人员类别代码
    */
    private String renyuanlbdm;
    /**
    * 军衔代码
    */
    private String junxiandm;
    /**
    * 是否显示
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