package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 体系医院标准编码(BzkBzTabJicengyljg)实体类
 *
 * @author makejava
 * @since 2021-11-20 23:59:46
 */
public class BzkBzTabJicengyljg implements Serializable {
    private static final long serialVersionUID = -39345110693201570L;
    /**
    * 主键ID
    */
    private String id;
    /**
    * 体系医院代码
    */
    private String jicengyljgdm;
    /**
    * 体系医院名称
    */
    private String jicengyljgmc;
    /**
    * 卫勤代码
    */
    private String weiqindm;
    /**
    * 卫勤名称
    */
    private String weiqinmc;
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
    /**
    * 对应保障卡单位标识符
    */
    private String danweibsf;
    /**
    * 对应保障卡单位名称
    */
    private String duiyingbzkdwmc;
    /**
    * 所属大单位
    */
    private String suoshuddw;
    /**
    * 所属战区
    */
    private String suoshuzq;

}