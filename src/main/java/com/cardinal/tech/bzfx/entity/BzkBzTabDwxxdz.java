package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 单位信息对照(BzkBzTabDwxxdz)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
public class BzkBzTabDwxxdz implements Serializable {
    private static final long serialVersionUID = -24596170585522811L;
    /**
    * 保障卡单位代码
    */
    private String danweiid;
    /**
    * 保障卡单位名称
    */
    private String danweimc;
    /**
    * 卫生单位代码
    */
    private String wsdwdm;
    /**
    * 卫生单位名称
    */
    private String wsdwmc;

}