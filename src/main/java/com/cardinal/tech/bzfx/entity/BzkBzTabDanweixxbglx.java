package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 单位信息变更类型(BzkBzTabDanweixxbglx)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
public class BzkBzTabDanweixxbglx implements Serializable {
    private static final long serialVersionUID = 973908616866001975L;
    /**
    * 主键ID
    */
    private String id;
    /**
    * 单位信息变更类型代码
    */
    private String danweixxbglxdm;
    /**
    * 单位信息变更类型
    */
    private String danweixxbglx;
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