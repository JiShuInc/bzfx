package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 补卡状态(BzkBzTabBukazt)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:53
 */
public class BzkBzTabBukazt implements Serializable {
    private static final long serialVersionUID = -31287880198476310L;
    /**
    * ID
    */
    private String id;
    /**
    * 补卡状态代码
    */
    private String bukaztdm;
    /**
    * 补卡状态
    */
    private String bukazt;
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