package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 被装发放记录(TaskBzkSlgxBzBzffjl)实体类
 *
 * @author makejava
 * @since 2021-11-28 12:40:57
 */
public class TaskBzkSlgxBzBzffjl implements Serializable {
    private static final long serialVersionUID = -59272003949727770L;
    /**
    * 任务id
    */
    private Long taskid;
    /**
    * id
    */
    private String id;
    /**
    * 发放时间（年度+月份，如200105）
    */
    private String fafangsj;
    /**
    * 姓名
    */
    private String xingming;
    /**
    * 公民身份号
    */
    private String junrenbzh;
    /**
    * 品种名称
    */
    private String pinzhongm;
    /**
    * 着装号型名称
    */
    private String zhuozhuanghxm;
    /**
    * 计量单位
    */
    private String jiliangdw;
    /**
    * 数量
    */
    private Double shuliang;
    /**
    * 起算年度，2008
    */
    private String qisuannd;
    /**
    * 数据所在单位
    */
    private String shujuszdw;
    /**
    * 上报标志
    */
    private Double shangbaobz;
    /**
    * 单位代码
    */
    private String danweidm;
    /**
    * 导入时间
    */
    private String daorusj;
    /**
    * 品种代码
    */
    private String pinzhong;

}