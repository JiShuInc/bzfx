package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 单位基本信息(TaskBzkTabDanweijbxx)实体类
 *
 * @author makejava
 * @since 2021-11-28 12:40:57
 */
public class TaskBzkTabDanweijbxx implements Serializable {
    private static final long serialVersionUID = -38368267535432636L;
    /**
    * 任务ID
    */
    private Long taskid;
    /**
    * 主键ID
    */
    private String id;
    /**
    * 单位内码
    */
    private String danweinm;
    /**
    * 单位状态；代码
    */
    private String danweizt;
    /**
    * 单位供应代码
    */
    private String danweigydm;
    /**
    * 单位隶属代码
    */
    private String danweilsdm;
    /**
    * 单位名称
    */
    private String danweimc;
    /**
    * 部队代号
    */
    private String buduidh;
    /**
    * 部队类别；代码
    */
    private String buduilb;
    /**
    * 建制类别；代码
    */
    private String jianzhilb;
    /**
    * 后勤部队类别；代码
    */
    private String houqinbdlb;
    /**
    * 单位级别；代码
    */
    private String danweijb;
    /**
    * 后勤机关级别；代码
    */
    private String houqinjgjb;
    /**
    * 隶属关系
    */
    private String lishugx;
    /**
    * 指挥关系
    */
    private String zhihuigx;
    /**
    * 供应性质代码
    */
    private String gongyingxzdm;
    /**
    * 驻地；代码
    */
    private String zhudi;
    /**
    * 驻地乡村镇
    */
    private String zhudixcz;
    /**
    * 邮政编码
    */
    private String youzhengbm;
    /**
    * 通信地址
    */
    private String tongxindz;
    /**
    * 军线电话号码
    */
    private String dianhuahm;
    /**
    * 地方号码
    */
    private String chuanzhenhm;
    /**
    * 战区；代码
    */
    private String zhanqu;
    /**
    * 保障区；代码
    */
    private String baozhangqu;
    /**
    * 军种；代码
    */
    private String junzhong;
    /**
    * 兵种；代码
    */
    private String bingzhong;
    /**
    * 气候区
    */
    private String qihouqu;
    /**
    * 单位类型：卡管理中心、卡管理部门
    */
    private String leixing;
    /**
    * 数据所在单位
    */
    private String shujuszdw;
    /**
    * 上报标志；0：未上报，1：已上报
    */
    private Double shangbaobz;
    /**
    * 更新标志；1:新增，2：修改，3：删除
    */
    private Double gengxinbz;
    /**
    * 分发标志；0：未分发，1：已分发
    */
    private Double fenfabz;
    /**
    * 审核标志；0：未审核，1：已审核
    */
    private Double shenhebz;
    /**
    * 变更文号及内容
    */
    private String beizhu;
    /**
    * 后勤供应关系
    */
    private String houqingygx;
    /**
    * 联勤保障关系
    */
    private String lianqinbzgx;
    /**
    * 财务供应
    */
    private String caiwugy;
    /**
    * 被装供应
    */
    private String beizhuanggy;
    /**
    * 油料供应
    */
    private String youliaogy;
    /**
    * 军交运输保障
    */
    private String junjiaoysbz;
    /**
    * 基建营房保障
    */
    private String jijianyfbz;
    /**
    * 银行所在地
    */
    private String yinhangszd;
    /**
    * 代发工资银行
    */
    private String yinhangdm;
    /**
    * 经办人
    */
    private String jingbanren;
    /**
    * 联系电话：军线号码
    */
    private String lianxidianhua;
    /**
    * 变更文号日期
    */
    private Date bgwhriqi;
    /**
    * 是否能够补卡，是，否
    */
    private String shifoungbk;
    /**
    * 单位类型2：卡管理中心、卡管理终端、代管单位
    */
    private String danweilx;
    /**
    * 添加_隶属层次码
    */
    private String lishuccm;
    /**
    * 下发标志：分别标识行政（1）、财务（2）、卫生（3）、被装（4）、营房（5）、医院1(11)、医院2(12)、医院1对应大单位(13)、医院2对应大单位(14)、医院1对应战区(15)、医院2对应战区(16)、隶属数据下发（17）
    */
    private String xiafabz;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 最后修改时间
    */
    private Date lastModifyTime;
    /**
    * 单位性质：字典
    */
    private String danweixz;
    /**
    * 是否有异地下属部门：是，否
    */
    private String shifouyydxsbm;
    /**
    * 艰苦地区分类：字典
    */
    private String jiankudqfl;
    /**
    * 取暖类区：字典
    */
    private String qunuanlq;
    /**
    * 机构番号
    */
    private String jigoufh;
    /**
    * 机构简称
    */
    private String jigoujc;
    /**
    * 建制名称
    */
    private String jianzhimc;
    /**
    * 任务类型：字典
    */
    private String renwulx;
    /**
    * 特殊地区：字典
    */
    private String teshudq;
    /**
    * 机要地址
    */
    private String jiyaodz;
    /**
    * 地方号码
    */
    private String difanghm;
    /**
    * 给养供应关系
    */
    private String jiyanggygx;
    /**
    * 统一社会信用代码
    */
    private String tongyishxydm;
    /**
    * 基层医疗机构ID
    */
    private String jicengyljgid;
    /**
    * 基层医疗机构名称
    */
    private String jicengyljgmc;
    /**
    * 军事设施保障
    */
    private String junshissbz;
    /**
    * 是否艰苦边远地区：是，否
    */
    private String shifoujkbydq;
    /**
    * 是否离线终端 0：否，1：是
    */
    private String shifoulxzd;

}