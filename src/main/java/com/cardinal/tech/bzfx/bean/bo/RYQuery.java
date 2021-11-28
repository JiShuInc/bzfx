package com.cardinal.tech.bzfx.bean.bo;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class RYQuery {
    /**
     * 军人保障号
     */
    private String junrenbzh;
    /**
     * 性别；代码
     */
    private String xingbie;
    /**
     * 民族；代码
     */
    private String minzu;
    /**
     * 籍贯；代码
     */
    private String jiguan;
    /**
     * 出生日期开始
     */
    private Date chushengrqStart;
    /**
     * 出生日期结束
     */
    private Date chushengrqEnd;
    /**
     * 血型；代码
     */
    
    private String xuexing;
    /**
     * 文化程度；代码
     */
    
    private String wenhuacd;
    /**
     * 政治面貌；代码
     */
    private String zhengzhimm;

    @NotNull(message = "必须输入人员数量")
    @Range(min=1,message = "人数必须大于等于1")
    private Integer num;
}
