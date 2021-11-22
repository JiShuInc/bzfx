package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Data;

@Data
/**
 * 被装发放记录(BzkSlgxBzBzffjl)实体类
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
public class BzkSlgxBzBzffjl implements Serializable {
    private static final long serialVersionUID = -82285782829826797L;
    /**
    * id
    */
    @CsvBindByPosition(position = 0)
    private String id;
    /**
    * 发放时间（年度+月份，如200105）
    */
    @CsvBindByPosition(position = 1)
    private String fafangsj;
    /**
    * 姓名
    */
    @CsvBindByPosition(position = 2)
    private String xingming;
    /**
    * 公民身份号
    */
    @CsvBindByPosition(position = 3)
    private String junrenbzh;
    /**
    * 品种名称
    */
    @CsvBindByPosition(position = 4)
    private String pinzhongm;
    /**
    * 着装号型名称
    */
    @CsvBindByPosition(position = 5)
    private String zhuozhuanghxm;
    /**
    * 计量单位
    */
    @CsvBindByPosition(position = 6)
    private String jiliangdw;
    /**
    * 数量
    */
    @CsvBindByPosition(position = 7)
    private Double shuliang;
    /**
    * 起算年度，2008
    */
    @CsvBindByPosition(position = 8)
    private String qisuannd;
    /**
    * 数据所在单位
    */
    @CsvBindByPosition(position = 9)
    private String shujuszdw;
    /**
    * 上报标志
    */
    @CsvBindByPosition(position = 10)
    private Double shangbaobz;
    /**
    * 单位代码
    */
    @CsvBindByPosition(position = 11)
    private String danweidm;
    /**
    * 导入时间
    */
    @CsvBindByPosition(position = 12)
    private String daorusj;
    /**
    * 品种代码
    */
    @CsvBindByPosition(position = 13)
    private String pinzhong;

}