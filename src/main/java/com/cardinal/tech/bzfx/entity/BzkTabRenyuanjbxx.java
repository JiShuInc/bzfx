package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 人员基本信息(BzkTabRenyuanjbxx)实体类
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
public class BzkTabRenyuanjbxx implements Serializable {
    private static final long serialVersionUID = -73635027440680121L;
    /**
    * 主键ID
    */
    private String id;
    /**
    * 军人保障号
    */
    private String junrenbzh;
    /**
    * 医疗卡号
    */
    private String yiliaokh;
    /**
    * 士官注册码
    */
    private String shibingzcm;
    /**
    * 士兵服装登记表号码
    */
    private String shibingfzdjbhm;
    /**
    * 姓名
    */
    private String xingming;
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
    * 出生地；代码
    */
    private String chushengdi;
    /**
    * 出生日期
    */
    private Date chushengrq;
    /**
    * 血型；代码
    */
    private String xuexing;
    /**
    * 入伍日期
    */
    private Date ruwurq;
    /**
    * 工作日期
    */
    private Date gongzuorq;
    /**
    * 离退休日期
    */
    private Date lituixrq;
    /**
    * 工作单位代码
    */
    private String gongzuodwdm;
    /**
    * 工作单位名称
    */
    private String gongzuodwmc;
    /**
    * 部别
    */
    private String bubie;
    /**
    * 部门ID
    */
    private String bumenid;
    /**
    * 证件编号
    */
    private String zhengjianbh;
    /**
    * 证件类型；代码
    */
    private String zhengjianlx;
    /**
    * 人员类别；代码
    */
    private String renyuanlb;
    /**
    * 主类别；代码
    */
    private String zhuleibie;
    /**
    * 军种；代码
    */
    private String junzhong;
    /**
    * 职工身份类别；代码
    */
    private String zhigongsflb;
    /**
    * 家属身份类别；代码
    */
    private String jiashusflb;
    /**
    * 有否照片；是、否
    */
    private String youfouzp;
    /**
    * 照片
    */
    private Object zhaopian;
    /**
    * 文化程度；代码
    */
    private String wenhuacd;
    /**
    * 毕业院校
    */
    private String biyeyx;
    /**
    * 入学日期
    */
    private Date ruxuerq;
    /**
    * 毕业日期
    */
    private Date biyerq;
    /**
    * 毕业专业
    */
    private String biyezy;
    /**
    * 学位；代码
    */
    private String xuewei;
    /**
    * 政治面貌；代码
    */
    private String zhengzhimm;
    /**
    * 采集上报时间
    */
    private Date tiganrq;
    /**
    * 选改士官日期
    */
    private Date gaixuansgrq;
    /**
    * 军衔文职级；代码
    */
    private String junxianwzj;
    /**
    * 现军衔文职级日期
    */
    private Date xianjunxwzjrq;
    /**
    * 行政职务；代码
    */
    private String xingzhengzw;
    /**
    * 现行政职务日期
    */
    private Date xianxingzzwrq;
    /**
    * 行政职务等级；代码
    */
    private String xingzhengzwdj;
    /**
    * 现行政职务等级日期
    */
    private Date xianxingzzwdjrq;
    /**
    * 专业技术职务；代码
    */
    private String zhuanyejszw;
    /**
    * 专业技术职务日期
    */
    private Date zhuanyejszwrq;
    /**
    * 专业技术等级；代码
    */
    private String zhuanyejsdj;
    /**
    * 专业技术等级日期
    */
    private Date zhuanyejsdjrq;
    /**
    * 后勤干部专业类别；代码
    */
    private String houqingbzylb;
    /**
    * 机关分队标识，即部队后勤人员分类；代码
    */
    private String jiguanfdbs;
    /**
    * 家属工作单位
    */
    private String jiashugzdw;
    /**
    * 婚姻状况；代码
    */
    private String hunyinzk;
    /**
    * 配偶姓名
    */
    private String peiouxm;
    /**
    * 配偶工作单位
    */
    private String peiougzdw;
    /**
    * 是否遗属；是，否
    */
    private String shifouys;
    /**
    * 对应军人/职工ID
    */
    private String duiyingjrzgid;
    /**
    * 对应军人姓名
    */
    private String duiyingjrxm;
    /**
    * 对应军人出生日期
    */
    private Date duiyingjrcsrq;
    /**
    * 对应军人证件编号
    */
    private String duiyingjrzjbh;
    /**
    * 对应军人保障号
    */
    private String duiyingjrbzh;
    /**
    * 基层医疗机构ID
    */
    private String jicengyljgid;
    /**
    * 基层医疗机构名称
    */
    private String jicengyljgmc;
    /**
    * 是否符合远离军队医疗机构条件；是,否
    */
    private String shifoufhyljdyljgtj;
    /**
    * 经济状况；代码
    */
    private String jingjizk;
    /**
    * 联系电话
    */
    private String lianxidh;
    /**
    * 个人状态；代码
    */
    private String gerenzt;
    /**
    * 一类特供人员类别；代码
    */
    private String yileitgrylb;
    /**
    * 二类特供人员类别；代码
    */
    private String erleitgrylb;
    /**
    * 三类特供人员类别；代码
    */
    private String sanleitgrylb;
    /**
    * 四类特供人员类别；代码
    */
    private String sileitgrylb;
    /**
    * 五类特供人员类别；代码
    */
    private String wuleitgrylb;
    /**
    * 更新标志；1:新增，2：修改，3：删除
    */
    private Double gengxinbz;
    /**
    * 上报标志；0：未上报，1：已上报
    */
    private Double shangbaobz;
    /**
    * 分发标志；0：未分发，1：已分发，3：转供/合并未下发
    */
    private Double fenfabz;
    /**
    * 审核标志；0：新增，数据项不完整   1：部队已审核，未导出给卫生部  2：卫生部已审核    3：导出制卡后   4：表示数据项完整，但未审核通过  5：导出给卫生部后   6：重新审核制卡   7：卫生审核不通过  8：工厂审核不通过   9：已制卡或不制卡
    */
    private Double shenhebz;
    /**
    * 数据所在单位
    */
    private String shujuszdw;
    /**
    * 是否已修改,     0：未修改，1：已修改
    */
    private String shifouxg;
    /**
    * 备注
    */
    private String beizhu;
    /**
    * 顺序码
    */
    private String shunxum;
    /**
    * 人员基本信息采集依据
    */
    private String renyuanjbxxcjyj;
    /**
    * 银行代码
    */
    private String yinhangdm;
    /**
    * 原军人ID
    */
    private String yuanid;
    /**
    * 银行所在地
    */
    private String yinhangszd;
    /**
    * 岗位等级
    */
    private String gangweidj;
    /**
    * 岗位情况
    */
    private String gangweiqk;
    /**
    * 参加医疗保险情况
    */
    private String canjiaylbxqk;
    /**
    * 职工登记号码
    */
    private String zhigongdjhm;
    /**
    * 行政关系所在单位代码
    */
    private String xzgxdwdm;
    /**
    * 行政关系所在单位名称
    */
    private String xzgxdwmc;
    /**
    * 行政关系调动序号
    */
    private Double xzgxddxh;
    /**
    * 财务关系所在单位代码
    */
    private String cwgxdwdm;
    /**
    * 财务关系所在单位名称
    */
    private String cwgxdwmc;
    /**
    * 财务关系调动序号
    */
    private Double cwgxddxh;
    /**
    * 医疗关系所在单位代码
    */
    private String ylgxdwdm;
    /**
    * 医疗关系所在单位名称
    */
    private String ylgxdwmc;
    /**
    * 医疗关系调动序号
    */
    private Double ylgxddxh;
    /**
    * 被装关系所在单位代码
    */
    private String bzgxdwdm;
    /**
    * 被装关系所在单位名称
    */
    private String bzgxdwmc;
    /**
    * 被装关系调动序号
    */
    private Double bzgxddxh;
    /**
    * 营房关系所在单位代码
    */
    private String yfgxdwdm;
    /**
    * 营房关系所在单位名称
    */
    private String yfgxdwmc;
    /**
    * 营房关系调动序号
    */
    private Double yfgxddxh;
    /**
    * 所在气候区
    */
    private String suozaiqhq;
    /**
    * 审核人
    */
    private String shenheren;
    /**
    * 行政命令号
    */
    private String xingzhengmlh;
    /**
    * 批准人
    */
    private String pizhunren;
    /**
    * 批准日期
    */
    private Date pizhunrq;
    /**
    * 是否在校学员
    */
    private String shifouzxxy;
    /**
    * 工勤技能等级日期
    */
    private Date gongqinjndjrq;
    /**
    * 照片是否修改：是，否
    */
    private String zhaopiansfxg;
    /**
    * 保障卡号
    */
    private String baozhangkh;
    /**
    * 卡类型
    */
    private String kaleixing;
    /**
    * 是否已制卡： 是；否
    */
    private String shifouyzk;
    /**
    * 部门审核状态，0－未审核，1－通过，2－预留，3－不通过 ， 4－导出卫生/制卡
    */
    private String bumenshzt;
    /**
    * 医疗账号
    */
    private String yiliaozh;
    /**
    * 工资列支渠道
    */
    private String gongzilzqd;
    /**
    * 是否军人家属
    */
    private String shifoujrjs;
    /**
    * 采集上报单位
    */
    private String caijisbdw;
    /**
    * 下发标志：分别标识行政（1）、财务（2）、被装（3）、卫生（4）、营房（5）、医院1(11)、医院2(12)、医院1对应大单位(13)、医院2对应大单位(14)、医院1对应战区(15)、医院2对应战区(16)
    */
    private String xiafabz;
    /**
    * 银行卡号
    */
    private String yinhangkh;
    /**
    * 在职情况：0：不适用，1：正常，2：新入伍人员，3：劳改服刑，4：出国逾期未归，5：其他暂不制卡人员；
    */
    private String zaizhiqk;
    /**
    * 是否在军队就医：是，否
    */
    private String shifouzjdjy;
    /**
    * 是否享有随军配偶保险：是，否
    */
    private String shifouxysjpobx;

}