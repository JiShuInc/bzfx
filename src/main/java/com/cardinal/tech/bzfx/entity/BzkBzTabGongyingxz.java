package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 供应性质(BzkBzTabGongyingxz)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
public class BzkBzTabGongyingxz implements Serializable {
    private static final long serialVersionUID = -35135938443088479L;
    /**
    * ID
    */
    private String id;
    /**
    * 供应性质代码
    */
    private String gongyingxzdm;
    /**
    * 供应性质
    */
    private String gongyingxz;
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