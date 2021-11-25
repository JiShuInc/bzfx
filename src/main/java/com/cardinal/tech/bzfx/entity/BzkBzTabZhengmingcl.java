package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 证明材料(BzkBzTabZhengmingcl)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
public class BzkBzTabZhengmingcl implements Serializable {
    private static final long serialVersionUID = 920385867958192579L;
    /**
    * ID
    */
    private String id;
    /**
    * 证明材料代码
    */
    private String zhengmingcldm;
    /**
    * 证明材料名称
    */
    private String zhengmingclmc;
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