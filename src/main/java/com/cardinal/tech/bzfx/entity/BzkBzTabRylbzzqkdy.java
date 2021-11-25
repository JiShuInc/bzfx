package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 人员类别在职情况对应表(BzkBzTabRylbzzqkdy)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
public class BzkBzTabRylbzzqkdy implements Serializable {
    private static final long serialVersionUID = -76650127999396619L;
    /**
    * 主键ID
    */
    private String id;
    /**
    * 人员类别代码
    */
    private String renyuanlbdm;
    /**
    * 在职情况代码
    */
    private String zaizhiqkdm;
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