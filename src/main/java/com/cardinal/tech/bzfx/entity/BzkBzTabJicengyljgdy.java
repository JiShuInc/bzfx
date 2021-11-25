package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 体系医院对应表(BzkBzTabJicengyljgdy)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
public class BzkBzTabJicengyljgdy implements Serializable {
    private static final long serialVersionUID = 874523017548363292L;
    /**
    * 序号
    */
    private Double xuhao;
    /**
    * 体系医院代码历史
    */
    private String jicengyljgdmls;
    /**
    * 体系医院代码
    */
    private String jicengyljgdm;

}