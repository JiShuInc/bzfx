package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 考核结果标准编码(BzkBzTabKaohejg)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
public class BzkBzTabKaohejg implements Serializable {
    private static final long serialVersionUID = -77124256894824126L;
    /**
    * ID
    */
    private String id;
    /**
    * 考核结果代码
    */
    private String kaohejgdm;
    /**
    * 考核结果名称
    */
    private String kaohejg;
    /**
    * 考核人员类别
    */
    private String kaoherylb;
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