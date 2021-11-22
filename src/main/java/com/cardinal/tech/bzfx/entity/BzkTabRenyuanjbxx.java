package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;
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
    @CsvBindByPosition(position = 1)
    private String id;
    /**
    * 军人保障号
    */
    @CsvBindByPosition(position = 2)
    private String junrenbzh;
    /**
    * 医疗卡号
    */
    @CsvBindByPosition(position = 3)
    private String yiliaokh;
    /**
    * 士官注册码
    */
    @CsvBindByPosition(position = 4)
    private String shibingzcm;
    /**
    * 士兵服装登记表号码
    */
    @CsvBindByPosition(position = 5)
    private String shibingfzdjbhm;
    /**
    * 姓名
    */
    @CsvBindByPosition(position = 6)
    private String xingming;
    /**
    * 性别；代码
    */
    @CsvBindByPosition(position = 7)
    private String xingbie;
    /**
    * 民族；代码
    */
    @CsvBindByPosition(position = 8)
    private String minzu;
    /**
    * 籍贯；代码
    */
    @CsvBindByPosition(position = 9)
    private String jiguan;
    /**
    * 出生地；代码
    */
    @CsvBindByPosition(position = 10)
    private String chushengdi;
    /**
    * 出生日期
    */
    @CsvBindByPosition(position = 11)
    private Date chushengrq;
    /**
    * 血型；代码
    */
    @CsvBindByPosition(position = 12)
    private String xuexing;
    /**
    * 入伍日期
    */
    @CsvBindByPosition(position = 13)
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date ruwurq;
    /**
    * 工作日期
    */
    @CsvBindByPosition(position = 14)
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date gongzuorq;
    /**
    * 离退休日期
    */
    @CsvBindByPosition(position = 15)
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date lituixrq;
    /**
    * 工作单位代码
    */
    @CsvBindByPosition(position = 16)
    private String gongzuodwdm;
    /**
    * 工作单位名称
    */
    @CsvBindByPosition(position = 17)
    private String gongzuodwmc;
    /**
    * 部别
    */
    @CsvBindByPosition(position = 18)
    private String bubie;
    /**
    * 部门ID
    */
    @CsvBindByPosition(position = 19)
    private String bumenid;
    /**
    * 证件编号
    */
    @CsvBindByPosition(position = 20)
    private String zhengjianbh;
    /**
    * 证件类型；代码
    */
    @CsvBindByPosition(position = 21)
    private String zhengjianlx;
    /**
    * 人员类别；代码
    */
    @CsvBindByPosition(position = 22)
    private String renyuanlb;
    /**
    * 主类别；代码
    */
    @CsvBindByPosition(position = 23)
    private String zhuleibie;
    /**
    * 军种；代码
    */
    @CsvBindByPosition(position = 24)
    private String junzhong;
    /**
    * 职工身份类别；代码
    */
    @CsvBindByPosition(position = 25)
    private String zhigongsflb;
    /**
    * 家属身份类别；代码
    */
    @CsvBindByPosition(position = 26)
    private String jiashusflb;
    /**
    * 有否照片；是、否
    */
    @CsvBindByPosition(position = 27)
    private String youfouzp;
    /**
    * 照片
    */
    @CsvBindByPosition(position = 28)
    private Object zhaopian;
    /**
    * 文化程度；代码
    */
    @CsvBindByPosition(position = 29)
    private String wenhuacd;
    /**
    * 毕业院校
    */
    @CsvBindByPosition(position = 30)
    private String biyeyx;
    /**
    * 入学日期
    */
    @CsvBindByPosition(position = 31)
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date ruxuerq;
    /**
    * 毕业日期
    */
    @CsvBindByPosition(position = 32)
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date biyerq;
    /**
    * 毕业专业
    */
    @CsvBindByPosition(position = 33)
    private String biyezy;
    /**
    * 学位；代码
    */
    @CsvBindByPosition(position = 34)
    private String xuewei;
    /**
    * 政治面貌；代码
    */
    @CsvBindByPosition(position = 35)
    private String zhengzhimm;
    /**
    * 采集上报时间
    */
    @CsvBindByPosition(position = 36)
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date tiganrq;
    /**
    * 选改士官日期
    */
    @CsvBindByPosition(position = 37)
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date gaixuansgrq;
    /**
    * 军衔文职级；代码
    */
    @CsvBindByPosition(position = 38)
    private String junxianwzj;
    /**
    * 现军衔文职级日期
    */
    @CsvBindByPosition(position = 39)
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date xianjunxwzjrq;
    /**
    * 行政职务；代码
    */
    @CsvBindByPosition(position = 40)
    private String xingzhengzw;
    /**
    * 现行政职务日期
    */
    @CsvBindByPosition(position = 41)
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date xianxingzzwrq;
    /**
    * 行政职务等级；代码
    */
    @CsvBindByPosition(position = 42)
    private String xingzhengzwdj;
    /**
    * 现行政职务等级日期
    */
    @CsvBindByPosition(position = 43)
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date xianxingzzwdjrq;
    /**
    * 专业技术职务；代码
    */
    @CsvBindByPosition(position = 44)
    private String zhuanyejszw;
    /**
    * 专业技术职务日期
    */
    @CsvBindByPosition(position = 45)
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date zhuanyejszwrq;
    /**
    * 专业技术等级；代码
    */
    @CsvBindByPosition(position = 45)
    private String zhuanyejsdj;
    /**
    * 专业技术等级日期
    */
    @CsvBindByPosition(position = 47)
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date zhuanyejsdjrq;
    /**
    * 后勤干部专业类别；代码
    */
    @CsvBindByPosition(position = 48)
    private String houqingbzylb;
    /**
    * 机关分队标识，即部队后勤人员分类；代码
    */
    @CsvBindByPosition(position = 49)
    private String jiguanfdbs;
    /**
    * 家属工作单位
    */
    @CsvBindByPosition(position = 50)
    private String jiashugzdw;
    /**
    * 婚姻状况；代码
    */
    @CsvBindByPosition(position = 51)
    private String hunyinzk;
    /**
    * 配偶姓名
    */
    @CsvBindByPosition(position = 52)
    private String peiouxm;
    /**
    * 配偶工作单位
    */
    @CsvBindByPosition(position = 53)
    private String peiougzdw;
    /**
    * 是否遗属；是，否
    */
    @CsvBindByPosition(position = 54)
    private String shifouys;
    /**
    * 对应军人/职工ID
    */
    @CsvBindByPosition(position = 55)
    private String duiyingjrzgid;
    /**
    * 对应军人姓名
    */
    @CsvBindByPosition(position = 56)
    private String duiyingjrxm;
    /**
    * 对应军人出生日期
    */
    @CsvBindByPosition(position = 57)
    private Date duiyingjrcsrq;
    /**
    * 对应军人证件编号
    */
    @CsvBindByPosition(position = 58)
    private String duiyingjrzjbh;
    /**
    * 对应军人保障号
    */
    @CsvBindByPosition(position = 59)
    private String duiyingjrbzh;
    /**
    * 基层医疗机构ID
    */
    @CsvBindByPosition(position = 60)
    private String jicengyljgid;
    /**
    * 基层医疗机构名称
    */
    @CsvBindByPosition(position = 61)
    private String jicengyljgmc;
    /**
    * 是否符合远离军队医疗机构条件；是,否
    */
    @CsvBindByPosition(position = 62)
    private String shifoufhyljdyljgtj;
    /**
    * 经济状况；代码
    */
    @CsvBindByPosition(position = 63)
    private String jingjizk;
    /**
    * 联系电话
    */
    @CsvBindByPosition(position = 64)
    private String lianxidh;
    /**
    * 个人状态；代码
    */
    @CsvBindByPosition(position = 65)
    private String gerenzt;
    /**
    * 一类特供人员类别；代码
    */
    @CsvBindByPosition(position = 66)
    private String yileitgrylb;
    /**
    * 二类特供人员类别；代码
    */
    @CsvBindByPosition(position = 67)
    private String erleitgrylb;
    /**
    * 三类特供人员类别；代码
    */
    @CsvBindByPosition(position = 68)
    private String sanleitgrylb;
    /**
    * 四类特供人员类别；代码
    */
    @CsvBindByPosition(position = 69)
    private String sileitgrylb;
    /**
    * 五类特供人员类别；代码
    */
    @CsvBindByPosition(position = 70)
    private String wuleitgrylb;
    /**
    * 更新标志；1:新增，2：修改，3：删除
    */
    @CsvBindByPosition(position = 71)
    private Double gengxinbz;
    /**
    * 上报标志；0：未上报，1：已上报
    */
    @CsvBindByPosition(position = 72)
    private Double shangbaobz;
    /**
    * 分发标志；0：未分发，1：已分发，3：转供/合并未下发
    */
    @CsvBindByPosition(position = 73)
    private Double fenfabz;
    /**
    * 审核标志；0：新增，数据项不完整   1：部队已审核，未导出给卫生部  2：卫生部已审核    3：导出制卡后   4：表示数据项完整，但未审核通过  5：导出给卫生部后   6：重新审核制卡   7：卫生审核不通过  8：工厂审核不通过   9：已制卡或不制卡
    */
    @CsvBindByPosition(position = 74)
    private Double shenhebz;
    /**
    * 数据所在单位
    */
    @CsvBindByPosition(position = 75)
    private String shujuszdw;
    /**
    * 是否已修改,     0：未修改，1：已修改
    */
    @CsvBindByPosition(position = 76)
    private String shifouxg;
    /**
    * 备注
    */
    @CsvBindByPosition(position = 77)
    private String beizhu;
    /**
    * 顺序码
    */
    @CsvBindByPosition(position = 78)
    private String shunxum;
    /**
    * 人员基本信息采集依据
    */
    @CsvBindByPosition(position = 79)
    private String renyuanjbxxcjyj;
    /**
    * 银行代码
    */
    @CsvBindByPosition(position = 80)
    private String yinhangdm;
    /**
    * 原军人ID
    */
    @CsvBindByPosition(position = 81)
    private String yuanid;
    /**
    * 银行所在地
    */
    @CsvBindByPosition(position = 82)
    private String yinhangszd;
    /**
    * 岗位等级
    */
    @CsvBindByPosition(position = 83)
    private String gangweidj;
    /**
    * 岗位情况
    */
    @CsvBindByPosition(position = 84)
    private String gangweiqk;
    /**
    * 参加医疗保险情况
    */
    @CsvBindByPosition(position = 85)
    private String canjiaylbxqk;
    /**
    * 职工登记号码
    */
    @CsvBindByPosition(position = 86)
    private String zhigongdjhm;
    /**
    * 行政关系所在单位代码
    */
    @CsvBindByPosition(position = 87)
    private String xzgxdwdm;
    /**
    * 行政关系所在单位名称
    */
    @CsvBindByPosition(position = 88)
    private String xzgxdwmc;
    /**
    * 行政关系调动序号
    */
    @CsvBindByPosition(position = 89)
    private Double xzgxddxh;
    /**
    * 财务关系所在单位代码
    */
    @CsvBindByPosition(position = 90)
    private String cwgxdwdm;
    /**
    * 财务关系所在单位名称
    */
    @CsvBindByPosition(position = 91)
    private String cwgxdwmc;
    /**
    * 财务关系调动序号
    */
    @CsvBindByPosition(position = 92)
    private Double cwgxddxh;
    /**
    * 医疗关系所在单位代码
    */
    @CsvBindByPosition(position = 93)
    private String ylgxdwdm;
    /**
    * 医疗关系所在单位名称
    */
    @CsvBindByPosition(position = 94)
    private String ylgxdwmc;
    /**
    * 医疗关系调动序号
    */
    @CsvBindByPosition(position = 95)
    private Double ylgxddxh;
    /**
    * 被装关系所在单位代码
    */
    @CsvBindByPosition(position = 96)
    private String bzgxdwdm;
    /**
    * 被装关系所在单位名称
    */
    @CsvBindByPosition(position = 97)
    private String bzgxdwmc;
    /**
    * 被装关系调动序号
    */
    @CsvBindByPosition(position = 98)
    private Double bzgxddxh;
    /**
    * 营房关系所在单位代码
    */
    @CsvBindByPosition(position = 99)
    private String yfgxdwdm;
    /**
    * 营房关系所在单位名称
    */
    @CsvBindByPosition(position = 100)
    private String yfgxdwmc;
    /**
    * 营房关系调动序号
    */
    @CsvBindByPosition(position = 101)
    private Double yfgxddxh;
    /**
    * 所在气候区
    */
    @CsvBindByPosition(position = 102)
    private String suozaiqhq;
    /**
    * 审核人
    */
    @CsvBindByPosition(position = 103)
    private String shenheren;
    /**
    * 行政命令号
    */
    @CsvBindByPosition(position = 104)
    private String xingzhengmlh;
    /**
    * 批准人
    */
    @CsvBindByPosition(position = 105)
    private String pizhunren;
    /**
    * 批准日期
    */
    @CsvBindByPosition(position = 106)
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date pizhunrq;
    /**
    * 是否在校学员
    */
    @CsvBindByPosition(position = 107)
    private String shifouzxxy;
    /**
    * 工勤技能等级日期
    */
    @CsvBindByPosition(position = 108)
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date gongqinjndjrq;
    /**
    * 照片是否修改：是，否
    */
    @CsvBindByPosition(position = 109)
    private String zhaopiansfxg;
    /**
    * 保障卡号
    */
    @CsvBindByPosition(position = 110)
    private String baozhangkh;
    /**
    * 卡类型
    */
    @CsvBindByPosition(position = 111)
    private String kaleixing;
    /**
    * 是否已制卡： 是；否
    */
    @CsvBindByPosition(position = 112)
    private String shifouyzk;
    /**
    * 部门审核状态，0－未审核，1－通过，2－预留，3－不通过 ， 4－导出卫生/制卡
    */
    @CsvBindByPosition(position = 113)
    private String bumenshzt;
    /**
    * 医疗账号
    */
    @CsvBindByPosition(position = 114)
    private String yiliaozh;
    /**
    * 工资列支渠道
    */
    @CsvBindByPosition(position = 115)
    private String gongzilzqd;
    /**
    * 是否军人家属
    */
    @CsvBindByPosition(position = 116)
    private String shifoujrjs;
    /**
    * 采集上报单位
    */
    @CsvBindByPosition(position = 117)
    private String caijisbdw;
    /**
    * 下发标志：分别标识行政（1）、财务（2）、被装（3）、卫生（4）、营房（5）、医院1(11)、医院2(12)、医院1对应大单位(13)、医院2对应大单位(14)、医院1对应战区(15)、医院2对应战区(16)
    */
    @CsvBindByPosition(position = 118)
    private String xiafabz;
    /**
    * 银行卡号
    */
    @CsvBindByPosition(position = 119)
    private String yinhangkh;
    /**
    * 在职情况：0：不适用，1：正常，2：新入伍人员，3：劳改服刑，4：出国逾期未归，5：其他暂不制卡人员；
    */
    @CsvBindByPosition(position = 120)
    private String zaizhiqk;
    /**
    * 是否在军队就医：是，否
    */
    @CsvBindByPosition(position = 121)
    private String shifouzjdjy;
    /**
    * 是否享有随军配偶保险：是，否
    */
    @CsvBindByPosition(position = 122)
    private String shifouxysjpobx;

}