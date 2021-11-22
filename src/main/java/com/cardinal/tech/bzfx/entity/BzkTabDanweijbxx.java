package com.cardinal.tech.bzfx.entity;

import java.util.Date;
import java.io.Serializable;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;
import lombok.Data;

@Data
/**
 * 单位基本信息(BzkTabDanweijbxx)实体类
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
public class BzkTabDanweijbxx implements Serializable {
    private static final long serialVersionUID = 965949159267958137L;
    /**
    * 主键ID
    */
    @CsvBindByPosition(position = 0)
    private String id;
    /**
    * 单位内码
    */
    @CsvBindByPosition(position = 1)
    private String danweinm;
    /**
    * 单位状态；代码
    */
    @CsvBindByPosition(position = 2)
    private String danweizt;
    /**
    * 单位供应代码
    */
    @CsvBindByPosition(position = 3)
    private String danweigydm;
    /**
    * 单位隶属代码
    */
    @CsvBindByPosition(position = 4)
    private String danweilsdm;
    /**
    * 单位名称
    */
    @CsvBindByPosition(position = 5)
    private String danweimc;
    /**
    * 部队代号
    */
    @CsvBindByPosition(position = 6)
    private String buduidh;
    /**
    * 部队类别；代码
    */
    @CsvBindByPosition(position = 7)
    private String buduilb;
    /**
    * 建制类别；代码
    */
    @CsvBindByPosition(position = 8)
    private String jianzhilb;
    /**
    * 后勤部队类别；代码
    */
    @CsvBindByPosition(position = 9)
    private String houqinbdlb;
    /**
    * 单位级别；代码
    */
    @CsvBindByPosition(position = 10)
    private String danweijb;
    /**
    * 后勤机关级别；代码
    */
    @CsvBindByPosition(position = 11)
    private String houqinjgjb;
    /**
    * 隶属关系
    */
    @CsvBindByPosition(position = 12)
    private String lishugx;
    /**
    * 指挥关系
    */
    @CsvBindByPosition(position = 13)
    private String zhihuigx;
    /**
    * 供应性质代码
    */
    @CsvBindByPosition(position = 14)
    private String gongyingxzdm;
    /**
    * 驻地；代码
    */
    @CsvBindByPosition(position = 15)
    private String zhudi;
    /**
    * 驻地乡村镇
    */
    @CsvBindByPosition(position = 16)
    private String zhudixcz;
    /**
    * 邮政编码
    */
    @CsvBindByPosition(position = 17)
    private String youzhengbm;
    /**
    * 通信地址
    */
    @CsvBindByPosition(position = 18)
    private String tongxindz;
    /**
    * 军线电话号码
    */
    @CsvBindByPosition(position = 19)
    private String dianhuahm;
    /**
    * 地方号码
    */
    @CsvBindByPosition(position = 20)
    private String chuanzhenhm;
    /**
    * 战区；代码
    */
    @CsvBindByPosition(position = 21)
    private String zhanqu;
    /**
    * 保障区；代码
    */
    @CsvBindByPosition(position = 22)
    private String baozhangqu;
    /**
    * 军种；代码
    */
    @CsvBindByPosition(position = 23)
    private String junzhong;
    /**
    * 兵种；代码
    */
    @CsvBindByPosition(position = 24)
    private String bingzhong;
    /**
    * 气候区
    */
    @CsvBindByPosition(position = 25)
    private String qihouqu;
    /**
    * 单位类型：卡管理中心、卡管理部门
    */
    @CsvBindByPosition(position = 26)
    private String leixing;
    /**
    * 数据所在单位
    */
    @CsvBindByPosition(position = 27)
    private String shujuszdw;
    /**
    * 上报标志；0：未上报，1：已上报
    */
    @CsvBindByPosition(position = 28)
    private Double shangbaobz;
    /**
    * 更新标志；1:新增，2：修改，3：删除
    */
    @CsvBindByPosition(position = 29)
    private Double gengxinbz;
    /**
    * 分发标志；0：未分发，1：已分发
    */
    @CsvBindByPosition(position = 30)
    private Double fenfabz;
    /**
    * 审核标志；0：未审核，1：已审核
    */
    @CsvBindByPosition(position = 31)
    private Double shenhebz;
    /**
    * 变更文号及内容
    */
    @CsvBindByPosition(position = 32)
    private String beizhu;
    /**
    * 后勤供应关系
    */
    @CsvBindByPosition(position = 33)
    private String houqingygx;
    /**
    * 联勤保障关系
    */
    @CsvBindByPosition(position = 34)
    private String lianqinbzgx;
    /**
    * 财务供应
    */
    @CsvBindByPosition(position = 35)
    private String caiwugy;
    /**
    * 被装供应
    */
    @CsvBindByPosition(position = 36)
    private String beizhuanggy;
    /**
    * 油料供应
    */
    @CsvBindByPosition(position = 37)
    private String youliaogy;
    /**
    * 军交运输保障
    */
    @CsvBindByPosition(position = 38)
    private String junjiaoysbz;
    /**
    * 基建营房保障
    */
    @CsvBindByPosition(position = 39)
    private String jijianyfbz;
    /**
    * 银行所在地
    */
    @CsvBindByPosition(position = 40)
    private String yinhangszd;
    /**
    * 代发工资银行
    */
    @CsvBindByPosition(position = 41)
    private String yinhangdm;
    /**
    * 经办人
    */
    @CsvBindByPosition(position = 42)
    private String jingbanren;
    /**
    * 联系电话
    */
    @CsvBindByPosition(position = 43)
    private String lianxidianhua;
    /**
    * 变更文号日期
    */
    @CsvBindByPosition(position = 44)
    @CsvDate("dd/MM/yyyy HH:mm:ss")
    private Date bgwhriqi;
    /**
    * 是否能够补卡，是，否
    */
    @CsvBindByPosition(position = 45)
    private String shifoungbk;
    /**
    * 单位类型2：卡管理中心、卡管理终端、代管单位
    */
    @CsvBindByPosition(position = 46)
    private String danweilx;
    /**
    * 隶属层次码
    */
    @CsvBindByPosition(position = 47)
    private String lishuccm;
    /**
    * 下发标志：分别标识行政（1）、财务（2）、卫生（3）、被装（4）、营房（5）、医院1(11)、医院2(12)、医院1对应大单位(13)、医院2对应大单位(14)、医院1对应战区(15)、医院2对应战区(16)、隶属数据下发（17）
    */
    @CsvBindByPosition(position = 48)
    private String xiafabz;

}