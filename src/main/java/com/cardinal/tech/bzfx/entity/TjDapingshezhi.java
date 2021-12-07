package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * (TjDapingshezhi)实体类
 *
 * @author makejava
 * @since 2021-12-07 10:48:02
 */
public class TjDapingshezhi implements Serializable {
    private static final long serialVersionUID = 671659349804719788L;
    /**
    * id
    */
    private Long id;
    /**
    * 所属业务模块[1-实力分析]
    */
    private Integer module;
    /**
    * 位置1
    */
    private Integer area1;
    
    private Integer area2;
    
    private Integer area3;
    
    private Integer area4;
    
    private Integer area5;
    
    private Integer area6;
    
    private Integer area7;
    
    private Integer area8;
    
    private Integer area9;
    
    private Integer area10;

}