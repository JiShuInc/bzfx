package com.cardinal.tech.bzfx.entity;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
/**
 * 单位基本信息(BzkTabDanweijbxx)实体类
 *
 * @author makejava
 * @since 2021-11-25 17:46:23
 */
public class BzkTabDanweijbxx implements Serializable {
    private static final long serialVersionUID = -55730321886375145L;
    /**
    * 主键ID
    */
    @CsvBindByName(column = "ID")
    private String id;
    /**
    * 单位内码
    */
    @CsvBindByName(column = "DANWEINM")
    private String danweinm;
    /**
    * 单位状态；代码
    */
    @CsvBindByName(column = "DANWEIZT")
    private String danweizt;
    /**
    * 单位供应代码
    */
    @CsvBindByName(column = "DANWEIGYDM")
    private String danweigydm;
    /**
    * 单位隶属代码
    */
    @CsvBindByName(column = "DANWEILSDM")
    private String danweilsdm;
    /**
    * 单位名称
    */
    @CsvBindByName(column = "DANWEIMC")
    private String danweimc;
    /**
    * 部队代号
    */
    @CsvBindByName(column = "BUDUIDH")
    private String buduidh;
    /**
    * 部队类别；代码
    */
    @CsvBindByName(column = "BUDUILB")
    private String buduilb;
    /**
    * 建制类别；代码
    */
    @CsvBindByName(column = "JIANZHILB")
    private String jianzhilb;
    /**
    * 后勤部队类别；代码
    */
    @CsvBindByName(column = "DANWEIZT")
    private String houqinbdlb;
    /**
    * 单位级别；代码
    */
    @CsvBindByName(column = "HOUQINBDLB")
    private String danweijb;
    /**
    * 后勤机关级别；代码
    */
    @CsvBindByName(column = "HOUQINJGJB")
    private String houqinjgjb;
    /**
    * 隶属关系
    */
    @CsvBindByName(column = "LISHUGX")
    private String lishugx;
    /**
    * 指挥关系
    */
    @CsvBindByName(column = "ZHIHUIGX")
    private String zhihuigx;
    /**
    * 供应性质代码
    */
    @CsvBindByName(column = "GONGYINGXZDM")
    private String gongyingxzdm;
    /**
    * 驻地；代码
    */
    @CsvBindByName(column = "ZHUDI")
    private String zhudi;
    /**
    * 驻地乡村镇
    */
    @CsvBindByName(column = "ZHUDIXCZ")
    private String zhudixcz;
    /**
    * 邮政编码
    */
    @CsvBindByName(column = "YOUZHENGBM")
    private String youzhengbm;
    /**
    * 通信地址
    */
    @CsvBindByName(column = "TONGXINDZ")
    private String tongxindz;
    /**
    * 军线电话号码
    */
    @CsvBindByName(column = "DIANHUAHM")
    private String dianhuahm;
    /**
    * 地方号码
    */
    @CsvBindByName(column = "CHUANZHENHM")
    private String chuanzhenhm;
    /**
    * 战区；代码
    */
    @CsvBindByName(column = "ZHANQU")
    private String zhanqu;
    /**
    * 保障区；代码
    */
    @CsvBindByName(column = "BAOZHANGQU")
    private String baozhangqu;
    /**
    * 军种；代码
    */
    @CsvBindByName(column = "JUNZHONG")
    private String junzhong;
    /**
    * 兵种；代码
    */
    @CsvBindByName(column = "BINGZHONG")
    private String bingzhong;
    /**
    * 气候区
    */
    @CsvBindByName(column = "QIHOUQU")
    private String qihouqu;
    /**
    * 单位类型：卡管理中心、卡管理部门
    */
    @CsvBindByName(column = "LEIXING")
    private String leixing;
    /**
    * 数据所在单位
    */
    @CsvBindByName(column = "SHUJUSZDW")
    private String shujuszdw;
    /**
    * 上报标志；0：未上报，1：已上报
    */
    @CsvBindByName(column = "SHANGBAOBZ")
    private Double shangbaobz;
    /**
    * 更新标志；1:新增，2：修改，3：删除
    */
    @CsvBindByName(column = "GENGXINBZ")
    private Double gengxinbz;
    /**
    * 分发标志；0：未分发，1：已分发
    */
    @CsvBindByName(column = "FENFABZ")
    private Double fenfabz;
    /**
    * 审核标志；0：未审核，1：已审核
    */
    @CsvBindByName(column = "SHENHEBZ")
    private Double shenhebz;
    /**
    * 变更文号及内容
    */
    @CsvBindByName(column = "BEIZHU")
    private String beizhu;
    /**
    * 后勤供应关系
    */
    @CsvBindByName(column = "HOUQINGYGX")
    private String houqingygx;
    /**
    * 联勤保障关系
    */
    @CsvBindByName(column = "LIANQINBZGX")
    private String lianqinbzgx;
    /**
    * 财务供应
    */
    @CsvBindByName(column = "CAIWUGY")
    private String caiwugy;
    /**
    * 被装供应
    */
    @CsvBindByName(column = "BEIZHUANGGY")
    private String beizhuanggy;
    /**
    * 油料供应
    */
    @CsvBindByName(column = "YOULIAOGY")
    private String youliaogy;
    /**
    * 军交运输保障
    */
    @CsvBindByName(column = "JUNJIAOYSBZ")
    private String junjiaoysbz;
    /**
    * 基建营房保障
    */
    @CsvBindByName(column = "JIJIANYFBZ")
    private String jijianyfbz;
    /**
    * 银行所在地
    */
    @CsvBindByName(column = "YINHANGSZD")
    private String yinhangszd;
    /**
    * 代发工资银行
    */
    @CsvBindByName(column = "YINHANGDM")
    private String yinhangdm;
    /**
    * 经办人
    */
    @CsvBindByName(column = "JINGBANREN")
    private String jingbanren;
    /**
    * 联系电话
    */
    @CsvBindByName(column = "LIANXIDIANHUA")
    private String lianxidianhua;
    /**
    * 变更文号日期
    */
    @CsvBindByName(column = "BGWHRIQI")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date bgwhriqi;
    /**
    * 是否能够补卡，是，否
    */
    @CsvBindByName(column = "SHIFOUNGBK")
    private String shifoungbk;
    /**
    * 单位类型2：卡管理中心、卡管理终端、代管单位
    */
    @CsvBindByName(column = "DANWEILX")
    private String danweilx;
    /**
    * 添加_隶属层次码
    */
    @CsvBindByName(column = "LISHUCCM")
    private String lishuccm;
    /**
    * 下发标志：分别标识行政（1）、财务（2）、卫生（3）、被装（4）、营房（5）、医院1(11)、医院2(12)、医院1对应大单位(13)、医院2对应大单位(14)、医院1对应战区(15)、医院2对应战区(16)、隶属数据下发（17）
    */
    @CsvBindByName(column = "XIAFABZ")
    private String xiafabz;
    /**
    * 创建时间
    */
    @CsvBindByName(column = "CREATE_TIME")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date createTime;
    /**
    * 最后修改时间
    */
    @CsvBindByName(column = "LAST_MODIFY_TIME")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date lastModifyTime;
    /**
    * 单位性质：字典
    */
    @CsvBindByName(column = "DANWEIXZ")
    private String danweixz;
    /**
    * 是否有异地下属部门：是，否
    */
    @CsvBindByName(column = "SHIFOUYYDXSBM")
    private String shifouyydxsbm;
    /**
    * 艰苦地区分类：字典
    */
    @CsvBindByName(column = "JIANKUDQFL")
    private String jiankudqfl;
    /**
    * 取暖类区：字典
    */
    @CsvBindByName(column = "QUNUANLQ")
    private String qunuanlq;
    /**
    * 机构番号
    */
    @CsvBindByName(column = "JIGOUFH")
    private String jigoufh;
    /**
    * 机构简称
    */
    @CsvBindByName(column = "JIGOUJC")
    private String jigoujc;
    /**
    * 建制名称
    */
    @CsvBindByName(column = "JIANZHIMC")
    private String jianzhimc;
    /**
    * 任务类型：字典
    */
    @CsvBindByName(column = "RENWULX")
    private String renwulx;
    /**
    * 特殊地区：字典
    */
    @CsvBindByName(column = "TESHUDQ")
    private String teshudq;
    /**
    * 机要地址
    */
    @CsvBindByName(column = "JIYAODZ")
    private String jiyaodz;
    /**
    * 地方号码
    */
    @CsvBindByName(column = "DIFANGHM")
    private String difanghm;
    /**
    * 给养供应关系
    */
    @CsvBindByName(column = "JIYANGGYGX")
    private String jiyanggygx;
    /**
    * 统一社会信用代码
    */
    @CsvBindByName(column = "TONGYISHXYDM")
    private String tongyishxydm;
    /**
    * 基层医疗机构ID
    */
    @CsvBindByName(column = "JICENGYLJGID")
    private String jicengyljgid;
    /**
    * 基层医疗机构名称
    */
    @CsvBindByName(column = "JICENGYLJGMC")
    private String jicengyljgmc;
    /**
    * 军事设施保障
    */
    @CsvBindByName(column = "JUNSHISSBZ")
    private String junshissbz;
    /**
    * 是否艰苦边远地区：是，否
    */
    @CsvBindByName(column = "SHIFOUJKBYDQ")
    private String shifoujkbydq;
    /**
    * 是否离线终端 0：否，1：是
    */
    @CsvBindByName(column = "SHIFOULXZD")
    private String shifoulxzd;

}