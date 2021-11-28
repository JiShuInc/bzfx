package com.cardinal.tech.bzfx.entity;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
/**
 * 人员基本信息(BzkTabRenyuanjbxx)实体类
 *
 * @author makejava
 * @since 2021-11-25 17:46:23
 */
public class BzkTabRenyuanjbxx implements Serializable {
    private static final long serialVersionUID = 145733933610880577L;
    /**
     * 主键ID
     */
    @CsvBindByName(column = "ID")
    private String id;
    /**
     * 军人保障号
     */
    @CsvBindByName(column = "JUNRENBZH")
    private String junrenbzh;
    /**
     * 医疗卡号
     */
    @CsvBindByName(column = "YILIAOKH")
    private String yiliaokh;
    /**
     * 士官注册码
     */
    @CsvBindByName(column = "SHIBINGZCM")
    private String shibingzcm;
    /**
     * 士兵服装登记表号码
     */
    @CsvBindByName(column = "SHIBINGFZDJBHM")
    private String shibingfzdjbhm;
    /**
     * 姓名
     */
    @CsvBindByName(column = "XINGMING")
    private String xingming;
    /**
     * 性别；代码
     */
    @CsvBindByName(column = "XINGBIE")
    private String xingbie;
    /**
     * 民族；代码
     */
    @CsvBindByName(column = "MINZU")
    private String minzu;
    /**
     * 籍贯；代码
     */
    @CsvBindByName(column = "JIGUAN")
    private String jiguan;
    /**
     * 出生地；代码
     */
    @CsvBindByName(column = "CHUSHENGDI")
    private String chushengdi;
    /**
     * 出生日期
     */
    @CsvBindByName(column = "CHUSHENGRQ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date chushengrq;
    /**
     * 血型；代码
     */
    @CsvBindByName(column = "XUEXING")
    private String xuexing;
    /**
     * 入伍日期
     */
    @CsvBindByName(column = "RUWURQ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date ruwurq;
    /**
     * 工作日期
     */
    @CsvBindByName(column = "GONGZUORQ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date gongzuorq;
    /**
     * 离退休日期
     */
    @CsvBindByName(column = "LITUIXRQ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date lituixrq;
    /**
     * 工作单位代码
     */
    @CsvBindByName(column = "GONGZUODWDM")
    private String gongzuodwdm;
    /**
     * 工作单位名称
     */
    @CsvBindByName(column = "GONGZUODWMC")
    private String gongzuodwmc;
    /**
     * 部别
     */
    @CsvBindByName(column = "BUBIE")
    private String bubie;
    /**
     * 部门ID
     */
    @CsvBindByName(column = "BUMENID")
    private String bumenid;
    /**
     * 证件编号
     */
    @CsvBindByName(column = "ZHENGJIANBH")
    private String zhengjianbh;
    /**
     * 证件类型；代码
     */
    @CsvBindByName(column = "ZHENGJIANLX")
    private String zhengjianlx;
    /**
     * 人员类别；代码
     */
    @CsvBindByName(column = "RENYUANLB")
    private String renyuanlb;
    /**
     * 主类别；代码
     */
    @CsvBindByName(column = "ZHULEIBIE")
    private String zhuleibie;
    /**
     * 军种；代码
     */
    @CsvBindByName(column = "JUNZHONG")
    private String junzhong;
    /**
     * 职工身份类别；代码
     */
    @CsvBindByName(column = "ZHIGONGSFLB")
    private String zhigongsflb;
    /**
     * 家属身份类别；代码
     */
    @CsvBindByName(column = "JIASHUSFLB")
    private String jiashusflb;
    /**
     * 有否照片；是、否
     */
    @CsvBindByName(column = "YOUFOUZP")
    private String youfouzp;
    /**
     * 照片
     */
    @CsvBindByName(column = "ZHAOPIAN")
    private Object zhaopian;
    /**
     * 文化程度；代码
     */
    @CsvBindByName(column = "WENHUACD")
    private String wenhuacd;
    /**
     * 毕业院校
     */
    @CsvBindByName(column = "BIYEYX")
    private String biyeyx;
    /**
     * 入学日期
     */
    @CsvBindByName(column = "RUXUERQ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date ruxuerq;
    /**
     * 毕业日期
     */
    @CsvBindByName(column = "BIYERQ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date biyerq;
    /**
     * 毕业专业
     */
    @CsvBindByName(column = "BIYEZY")
    private String biyezy;
    /**
     * 学位；代码
     */
    @CsvBindByName(column = "XUEWEI")
    private String xuewei;
    /**
     * 政治面貌；代码
     */
    @CsvBindByName(column = "ZHENGZHIMM")
    private String zhengzhimm;
    /**
     * 采集上报时间
     */
    @CsvBindByName(column = "TIGANRQ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date tiganrq;
    /**
     * 选改士官日期
     */
    @CsvBindByName(column = "GAIXUANSGRQ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date gaixuansgrq;
    /**
     * 军衔文职级；代码
     */
    @CsvBindByName(column = "JUNXIANWZJ")
    private String junxianwzj;
    /**
     * 现军衔文职级日期
     */
    @CsvBindByName(column = "XIANJUNXWZJRQ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date xianjunxwzjrq;
    /**
     * 行政职务；代码
     */
    @CsvBindByName(column = "XINGZHENGZW")
    private String xingzhengzw;
    /**
     * 现行政职务日期
     */
    @CsvBindByName(column = "XIANXINGZZWRQ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date xianxingzzwrq;
    /**
     * 行政职务等级；代码
     */
    @CsvBindByName(column = "XINGZHENGZWDJ")
    private String xingzhengzwdj;
    /**
     * 现行政职务等级日期
     */
    @CsvBindByName(column = "XIANXINGZZWDJRQ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date xianxingzzwdjrq;
    /**
     * 专业技术职务；代码
     */
    @CsvBindByName(column = "ZHUANYEJSZW")
    private String zhuanyejszw;
    /**
     * 专业技术职务日期
     */
    @CsvBindByName(column = "ZHUANYEJSZWRQ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date zhuanyejszwrq;
    /**
     * 专业技术等级；代码
     */
    @CsvBindByName(column = "ZHUANYEJSDJ")
    private String zhuanyejsdj;
    /**
     * 专业技术等级日期
     */
    @CsvBindByName(column = "ZHUANYEJSDJRQ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date zhuanyejsdjrq;
    /**
     * 后勤干部专业类别；代码
     */
    @CsvBindByName(column = "HOUQINGBZYLB")
    private String houqingbzylb;
    /**
     * 机关分队标识，即部队后勤人员分类；代码
     */
    @CsvBindByName(column = "JIGUANFDBS")
    private String jiguanfdbs;
    /**
     * 家属工作单位
     */
    @CsvBindByName(column = "JIASHUGZDW")
    private String jiashugzdw;
    /**
     * 婚姻状况；代码
     */
    @CsvBindByName(column = "HUNYINZK")
    private String hunyinzk;
    /**
     * 配偶姓名
     */
    @CsvBindByName(column = "PEIOUXM")
    private String peiouxm;
    /**
     * 配偶工作单位
     */
    @CsvBindByName(column = "PEIOUGZDW")
    private String peiougzdw;
    /**
     * 是否遗属；是，否
     */
    @CsvBindByName(column = "SHIFOUYS")
    private String shifouys;
    /**
     * 对应军人/职工ID
     */
    @CsvBindByName(column = "DUIYINGJRZGID")
    private String duiyingjrzgid;
    /**
     * 对应军人姓名
     */
    @CsvBindByName(column = "DUIYINGJRXM")
    private String duiyingjrxm;
    /**
     * 对应军人出生日期
     */
    @CsvBindByName(column = "DUIYINGJRCSRQ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date duiyingjrcsrq;
    /**
     * 对应军人证件编号
     */
    @CsvBindByName(column = "DUIYINGJRZJBH")
    private String duiyingjrzjbh;
    /**
     * 对应军人保障号
     */
    @CsvBindByName(column = "DUIYINGJRBZH")
    private String duiyingjrbzh;
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
     * 是否符合远离军队医疗机构条件；是,否
     */
    @CsvBindByName(column = "SHIFOUFHYLJDYLJGTJ")
    private String shifoufhyljdyljgtj;
    /**
     * 经济状况；代码
     */
    @CsvBindByName(column = "JINGJIZK")
    private String jingjizk;
    /**
     * 联系电话
     */
    @CsvBindByName(column = "LIANXIDH")
    private String lianxidh;
    /**
     * 个人状态；代码
     */
    @CsvBindByName(column = "GERENZT")
    private String gerenzt;
    /**
     * 一类特供人员类别；代码
     */
    @CsvBindByName(column = "YILEITGRYLB")
    private String yileitgrylb;
    /**
     * 二类特供人员类别；代码
     */
    @CsvBindByName(column = "ERLEITGRYLB")
    private String erleitgrylb;
    /**
     * 三类特供人员类别；代码
     */
    @CsvBindByName(column = "SANLEITGRYLB")
    private String sanleitgrylb;
    /**
     * 四类特供人员类别；代码
     */
    @CsvBindByName(column = "SILEITGRYLB")
    private String sileitgrylb;
    /**
     * 五类特供人员类别；代码
     */
    @CsvBindByName(column = "WULEITGRYLB")
    private String wuleitgrylb;
    /**
     * 更新标志；1:新增，2：修改，3：删除
     */
    @CsvBindByName(column = "GENGXINBZ")
    private Double gengxinbz;
    /**
     * 上报标志；0：未上报，1：已上报
     */
    @CsvBindByName(column = "SHANGBAOBZ")
    private Double shangbaobz;
    /**
     * 分发标志；0：未分发，1：已分发，3：转供/合并未下发
     */
    @CsvBindByName(column = "FENFABZ")
    private Double fenfabz;
    /**
     * 审核标志；0：新增，数据项不完整   1：部队已审核，未导出给卫生部  2：卫生部已审核    3：导出制卡后   4：表示数据项完整，但未审核通过  5：导出给卫生部后   6：重新审核制卡   7：卫生审核不通过  8：工厂审核不通过   9：已制卡或不制卡
     */
    @CsvBindByName(column = "SHENHEBZ")
    private Double shenhebz;
    /**
     * 数据所在单位
     */
    @CsvBindByName(column = "SHUJUSZDW")
    private String shujuszdw;
    /**
     * 是否已修改,     0：未修改，1：已修改
     */
    @CsvBindByName(column = "SHIFOUXG")
    private String shifouxg;
    /**
     * 备注
     */
    @CsvBindByName(column = "BEIZHU")
    private String beizhu;
    /**
     * 顺序码
     */
    @CsvBindByName(column = "SHUNXUM")
    private String shunxum;
    /**
     * 人员基本信息采集依据
     */
    @CsvBindByName(column = "RENYUANJBXXCJYJ")
    private String renyuanjbxxcjyj;
    /**
     * 银行代码
     */
    @CsvBindByName(column = "YINHANGDM")
    private String yinhangdm;
    /**
     * 原军人ID
     */
    @CsvBindByName(column = "YUANID")
    private String yuanid;
    /**
     * 银行所在地
     */
    @CsvBindByName(column = "YINHANGSZD")
    private String yinhangszd;
    /**
     * 岗位等级
     */
    @CsvBindByName(column = "GANGWEIDJ")
    private String gangweidj;
    /**
     * 岗位情况
     */
    @CsvBindByName(column = "GANGWEIQK")
    private String gangweiqk;
    /**
     * 参加医疗保险情况
     */
    @CsvBindByName(column = "CANJIAYLBXQK")
    private String canjiaylbxqk;
    /**
     * 职工登记号码
     */
    @CsvBindByName(column = "ZHIGONGDJHM")
    private String zhigongdjhm;
    /**
     * 行政关系所在单位代码
     */
    @CsvBindByName(column = "XZGXDWDM")
    private String xzgxdwdm;
    /**
     * 行政关系所在单位名称
     */
    @CsvBindByName(column = "XZGXDWMC")
    private String xzgxdwmc;
    /**
     * 行政关系调动序号
     */
    @CsvBindByName(column = "XZGXDDXH")
    private Double xzgxddxh;
    /**
     * 财务关系所在单位代码
     */
    @CsvBindByName(column = "CWGXDWDM")
    private String cwgxdwdm;
    /**
     * 财务关系所在单位名称
     */
    @CsvBindByName(column = "CWGXDWMC")
    private String cwgxdwmc;
    /**
     * 财务关系调动序号
     */
    @CsvBindByName(column = "CWGXDDXH")
    private Double cwgxddxh;
    /**
     * 医疗关系所在单位代码
     */
    @CsvBindByName(column = "YLGXDWDM")
    private String ylgxdwdm;
    /**
     * 医疗关系所在单位名称
     */
    @CsvBindByName(column = "YLGXDWMC")
    private String ylgxdwmc;
    /**
     * 医疗关系调动序号
     */
    @CsvBindByName(column = "YLGXDDXH")
    private Double ylgxddxh;
    /**
     * 被装关系所在单位代码
     */
    @CsvBindByName(column = "BZGXDWDM")
    private String bzgxdwdm;
    /**
     * 被装关系所在单位名称
     */
    @CsvBindByName(column = "BZGXDWMC")
    private String bzgxdwmc;
    /**
     * 被装关系调动序号
     */
    @CsvBindByName(column = "BZGXDDXH")
    private Double bzgxddxh;
    /**
     * 营房关系所在单位代码
     */
    @CsvBindByName(column = "YFGXDWDM")
    private String yfgxdwdm;
    /**
     * 营房关系所在单位名称
     */
    @CsvBindByName(column = "YFGXDWMC")
    private String yfgxdwmc;
    /**
     * 营房关系调动序号
     */
    @CsvBindByName(column = "YFGXDDXH")
    private Double yfgxddxh;
    /**
     * 所在气候区
     */
    @CsvBindByName(column = "SUOZAIQHQ")
    private String suozaiqhq;
    /**
     * 审核人
     */
    @CsvBindByName(column = "SHENHEREN")
    private String shenheren;
    /**
     * 行政命令号
     */
    @CsvBindByName(column = "XINGZHENGMLH")
    private String xingzhengmlh;
    /**
     * 批准人
     */
    @CsvBindByName(column = "PIZHUNREN")
    private String pizhunren;
    /**
     * 批准日期
     */
    @CsvBindByName(column = "PIZHUNRQ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date pizhunrq;
    /**
     * 是否在校学员
     */
    @CsvBindByName(column = "SHIFOUZXXY")
    private String shifouzxxy;
    /**
     * 工勤技能等级日期
     */
    @CsvBindByName(column = "GONGQINJNDJRQ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date gongqinjndjrq;
    /**
     * 照片是否修改：是，否
     */
    @CsvBindByName(column = "ZHAOPIANSFXG")
    private String zhaopiansfxg;
    /**
     * 保障卡号
     */
    @CsvBindByName(column = "BAOZHANGKH")
    private String baozhangkh;
    /**
     * 卡类型
     */
    @CsvBindByName(column = "KALEIXING")
    private String kaleixing;
    /**
     * 是否已制卡： 是；否
     */
    @CsvBindByName(column = "SHIFOUYZK")
    private String shifouyzk;
    /**
     * 部门审核状态，0－未审核，1－通过，2－预留，3－不通过 ， 4－导出卫生/制卡
     */
    @CsvBindByName(column = "BUMENSHZT")
    private String bumenshzt;
    /**
     * 医疗账号
     */
    @CsvBindByName(column = "YILIAOZH")
    private String yiliaozh;
    /**
     * 工资列支渠道
     */
    @CsvBindByName(column = "GONGZILZQD")
    private String gongzilzqd;
    /**
     * 是否军人家属
     */
    @CsvBindByName(column = "SHIFOUJRJS")
    private String shifoujrjs;
    /**
     * 采集上报单位
     */
    @CsvBindByName(column = "CAIJISBDW")
    private String caijisbdw;
    /**
     * 下发标志：分别标识行政（1）、财务（2）、被装（3）、卫生（4）、营房（5）、医院1(11)、医院2(12)、医院1对应大单位(13)、医院2对应大单位(14)、医院1对应战区(15)、医院2对应战区(16)
     */
    @CsvBindByName(column = "XIAFABZ")
    private String xiafabz;
    /**
     * 银行卡号
     */
    @CsvBindByName(column = "YINHANGKH")
    private String yinhangkh;
    /**
     * 在职情况：0：不适用，1：正常，2：新入伍人员，3：劳改服刑，4：出国逾期未归，5：其他暂不制卡人员；
     */
    @CsvBindByName(column = "ZAIZHIQK")
    private String zaizhiqk;
    /**
     * 是否在军队就医：是，否
     */
    @CsvBindByName(column = "SHIFOUZJDJY")
    private String shifouzjdjy;
    /**
     * 是否享有随军配偶保险：是，否
     */
    @CsvBindByName(column = "SHIFOUXYSJPOBX")
    private String shifouxysjpobx;
    /**
     * 待遇级别；代码
     */
    @CsvBindByName(column = "DAIYUJB")
    private String daiyujb;
    /**
     * 待遇级别日期
     */
    @CsvBindByName(column = "DAIYUJBRQ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date daiyujbrq;
    /**
     * 级别档次；代码
     */
    @CsvBindByName(column = "JIBIEDC")
    private String jibiedc;
    /**
     * 级别档次日期
     */
    @CsvBindByName(column = "JIBIEDCRQ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date jibiedcrq;
    /**
     * 套改标识；1-套改
     */
    @CsvBindByName(column = "TAOGAIBZ")
    private Double taogaibz;
    /**
     * 审核单位代码
     */
    @CsvBindByName(column = "SHENHEDWDM")
    private String shenhedwdm;
    /**
     * 审核结果
     */
    @CsvBindByName(column = "SHENHEJG")
    private Double shenhejg;
    /**
     * 照片路径
     */
    @CsvBindByName(column = "ZHAOPIANLJ")
    private String zhaopianlj;
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
     * 文职人员级别
     */
    @CsvBindByName(column = "WENZHIRYJB")
    private String wenzhiryjb;
    /**
     * 文职人员级别日期
     */
    @CsvBindByName(column = "WENZHIRYJBRQ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date wenzhiryjbrq;
    /**
     * 社保卡号
     */
    @CsvBindByName(column = "SHEBAOKH")
    private String shebaokh;
    /**
     * 类型：军人/武警
     */
    @CsvBindByName(column = "LEIXING")
    private Double leixing;
    /**
     * 固化注册码
     */
    @CsvBindByName(column = "GUHUAZCM")
    private String guhuazcm;
    /**
     * 婚姻日期
     */
    @CsvBindByName(column = "HUNYINRQ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date hunyinrq;
    /**
     * 政治面貌日期
     */
    @CsvBindByName(column = "ZHENGZHIMMRQ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date zhengzhimmrq;
    /**
     * 银行公务卡账户
     */
    @CsvBindByName(column = "YINHANGGWKZH")
    private String yinhanggwkzh;
    /**
     * 组织关系机构名称
     */
    @CsvBindByName(column = "ZUZHIGXJGMC")
    private String zuzhigxjgmc;
    /**
     * 晋校日期
     */
    @CsvBindByName(column = "JINXIAORQ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date jinxiaorq;
    /**
     * 提将日期
     */
    @CsvBindByName(column = "TIJIANGRQ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date tijiangrq;
    /**
     * 本档日期
     */
    @CsvBindByName(column = "BENDANGRQ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date bendangrq;
    /**
     * 干部编号
     */
    @CsvBindByName(column = "GANBUBH")
    private String ganbubh;
    /**
     * 国籍；字典
     */
    @CsvBindByName(column = "GUOJI")
    private String guoji;
    /**
     * 职业；字典
     */
    @CsvBindByName(column = "ZHIYE")
    private String zhiye;
    /**
     * 现居住地址
     */
    @CsvBindByName(column = "XIANJUZDZ")
    private String xianjuzdz;
    /**
     * 是否独生子女
     */
    @CsvBindByName(column = "SHIFOUDSZN")
    private String shifoudszn;
    /**
     * 是否双无人员；是/否，是双无人员经济状况自动为“无收入”
     */
    @CsvBindByName(column = "SHIFOUSWRY")
    private String shifouswry;
    /**
     * 是否双军人；是/否
     */
    @CsvBindByName(column = "SHIFOUSJR")
    private String shifousjr;
    /**
     * 户口所在地
     */
    @CsvBindByName(column = "HUKOUSZD")
    private String hukouszd;
    /**
     * 是否城镇户口；是/否
     */
    @CsvBindByName(column = "SHIFOUCZHK")
    private String shifouczhk;
    /**
     * 是否已随军；是/否
     */
    @CsvBindByName(column = "SHIFOUYSJ")
    private String shifouysj;
    /**
     * 随军日期
     */
    @CsvBindByName(column = "SUIJUNRQ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date suijunrq;
    /**
     * 身份证件起始日期
     */
    @CsvBindByName(column = "SHENFENZJQSRQ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date shenfenzjqsrq;
    /**
     * 身份证件终止日期
     */
    @CsvBindByName(column = "SHENFENZJZZRQ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date shenfenzjzzrq;
    /**
     * 给养关系所在单位代码
     */
    @CsvBindByName(column = "JYGXDWDM")
    private String jygxdwdm;
    /**
     * 给养关系所在单位名称
     */
    @CsvBindByName(column = "JYGXDWMC")
    private String jygxdwmc;
    /**
     * 给养关系调动序号
     */
    @CsvBindByName(column = "JYGXDDXH")
    private Double jygxddxh;
    /**
     * 对应财务单位代码
     */
    @CsvBindByName(column = "DYCWDWDM")
    private String dycwdwdm;
    /**
     * 对应被装单位代码
     */
    @CsvBindByName(column = "DYBZDWDM")
    private String dybzdwdm;
    /**
     * 对应医疗单位代码
     */
    @CsvBindByName(column = "DYYLDWDM")
    private String dyyldwdm;
    /**
     * 对应营房单位代码
     */
    @CsvBindByName(column = "DYYFDWDM")
    private String dyyfdwdm;
    /**
     * 对应给养单位代码
     */
    @CsvBindByName(column = "DYJYDWDM")
    private String dyjydwdm;
    /**
     * 随军状况；是/否
     */
    @CsvBindByName(column = "SUIJUNZK")
    private String suijunzk;
    /**
     * 姓名拼音
     */
    @CsvBindByName(column = "XINGMINGPY")
    private String xingmingpy;
    /**
     * 制牌标志。0=未制牌，1=制牌成功，3=制牌失败，4=导出制牌
     */
    @CsvBindByName(column = "ZHIPAIBZ")
    private Double zhipaibz;
    /**
     * 对应财务单位名称
     */
    @CsvBindByName(column = "DYCWDWMC")
    private String dycwdwmc;
    /**
     * 对应被装单位名称
     */
    @CsvBindByName(column = "DYBZDWMC")
    private String dybzdwmc;
    /**
     * 对应医疗单位名称
     */
    @CsvBindByName(column = "DYYLDWMC")
    private String dyyldwmc;
    /**
     * 对应营房单位名称
     */
    @CsvBindByName(column = "DYYFDWMC")
    private String dyyfdwmc;
    /**
     * 对应给养单位名称
     */
    @CsvBindByName(column = "DYJYDWMC")
    private String dyjydwmc;
    /**
     * 财务部门
     */
    @CsvBindByName(column = "CAIWUBM")
    private String caiwubm;
    /**
     * 被装部门
     */
    @CsvBindByName(column = "BEIZHUANGBM")
    private String beizhuangbm;
    /**
     * 医疗部门
     */
    @CsvBindByName(column = "YILIAOBM")
    private String yiliaobm;
    /**
     * 营房部门
     */
    @CsvBindByName(column = "YINGFANGBM")
    private String yingfangbm;
    /**
     * 给养部门
     */
    @CsvBindByName(column = "JIYANGBM")
    private String jiyangbm;
    /**
     * 岗位职务层级；代码
     */
    @CsvBindByName(column = "GANGWEIZWCJ")
    private String gangweizwcj;
    /**
     * 岗位职务层级日期
     */
    @CsvBindByName(column = "GANGWEIZWCJRQ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date gangweizwcjrq;
    /**
     * 套改时间
     */
    @CsvBindByName(column = "TAOGAISJ")
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date taogaisj;
    /**
     * 岗位类别；代码
     */
    @CsvBindByName(column = "GANGWEILB")
    private String gangweilb;

}