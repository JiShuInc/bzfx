package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 政治面貌(BzkBzTabZhengzhimm)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
public class BzkBzTabZhengzhimm implements Serializable {
    private static final long serialVersionUID = -20019298345003710L;
    /**
    * ID
    */
    private String id;
    /**
    * 政治面貌代码
    */
    private String zhengzhimmdm;
    /**
    * 政治面貌
    */
    private String zhengzhimm;
    /**
    * 人劳代码
    */
    private String renlaodm;
    /**
    * 人劳名称
    */
    private String renlaomc;
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