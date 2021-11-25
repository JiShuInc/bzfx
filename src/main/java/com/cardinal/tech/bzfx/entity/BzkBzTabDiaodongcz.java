package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 调动操作(BzkBzTabDiaodongcz)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
public class BzkBzTabDiaodongcz implements Serializable {
    private static final long serialVersionUID = -73456049754632321L;
    /**
    * ID
    */
    private String id;
    /**
    * 代码
    */
    private String daima;
    /**
    * 名称
    */
    private String mingcheng;
    /**
    * 是否显示；是、否
    */
    private String shifouxs;
    /**
    * 状态：正常，删除
    */
    private String zhuangtai;

}