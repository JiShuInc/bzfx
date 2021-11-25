package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 变更类型标准表(BzkBzTabBiangenglx)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:53
 */
public class BzkBzTabBiangenglx implements Serializable {
    private static final long serialVersionUID = 712925423654456937L;
    /**
    * ID
    */
    private String id;
    /**
    * 变更类型代码
    */
    private String biangenglxdm;
    /**
    * 变更类型
    */
    private String biangenglx;
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