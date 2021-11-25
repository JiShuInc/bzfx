package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 待遇级别档次标准编码(BzkBzTabDaiyujbdc)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
public class BzkBzTabDaiyujbdc implements Serializable {
    private static final long serialVersionUID = -40567487326938997L;
    /**
    * ID
    */
    private String id;
    /**
    * 待遇级别档次代码
    */
    private String daiyujbdcdm;
    /**
    * 待遇级别档次名称
    */
    private String daiyujbdc;
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