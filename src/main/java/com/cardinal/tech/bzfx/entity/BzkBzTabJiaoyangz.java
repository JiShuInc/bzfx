package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 质量分析校验规则字典表(BzkBzTabJiaoyangz)实体类
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
public class BzkBzTabJiaoyangz implements Serializable {
    private static final long serialVersionUID = 679792120597070660L;
    /**
    * id
    */
    private String id;
    /**
    * 校验项代码
    */
    private String jyxdm;
    /**
    * 校验项
    */
    private String jyxmc;
    /**
    * 校验等级：严重、提示
    */
    private String jycd;
    /**
    * 详细说明
    */
    private String jiaoyangzsm;
    /**
    * 解决方法
    */
    private String xiugaiff;
    /**
    * 对应人员类别
    */
    private String duiyingrylb;
    /**
    * 校验人员类别
    */
    private String jiaoyanrylb;
    /**
    * 字段名称
    */
    private String ziduanmc;
    /**
    * 校验规则，为空时表示判空
    */
    private String jiaoyangz;
    /**
    * 是否使用此校验规则：是，否
    */
    private String shifousy;
    /**
    * 校验语句
    */
    private String jyxyj;

}