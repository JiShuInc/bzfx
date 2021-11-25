package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 基层医疗机构表(BzkBzTabXiashujcyljg)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
public class BzkBzTabXiashujcyljg implements Serializable {
    private static final long serialVersionUID = -25166322774845627L;
    /**
    * 体系医院代码
    */
    private String id;
    
    private String jicengyljgdm;
    
    private String jicengyljgmc;
    
    private String shifouxs;
    
    private String shujuszdw;
    
    private String zhuangtai;
    
    private String danweibsf;
    
    private String duiyingbzkdwmc;
    
    private String tixiyydm;

}