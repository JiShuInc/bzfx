package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 在职情况标准表(BzkBzTabZaizhiqk)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
public class BzkBzTabZaizhiqk implements Serializable {
    private static final long serialVersionUID = -57566065868297900L;
    /**
    * ID
    */
    private String id;
    /**
    * 在职情况代码：1，2，3，4，5
    */
    private String zaizhiztdm;
    /**
    * 在职情况：正常，新入伍人员，劳改服刑，出国逾期未归，其他暂不制卡人员
    */
    private String zaizhizt;
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