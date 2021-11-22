package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Data;

@Data
/**
 * 单位补充录入信息(BzkTabDanweibclrxx)实体类
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
public class BzkTabDanweibclrxx implements Serializable {
    private static final long serialVersionUID = 447234048371689324L;
    /**
    * 主键ID
    */
    @CsvBindByPosition(position = 0)
    private String id;
    /**
    * 单位；ID
    */
    @CsvBindByPosition(position = 1)
    private String danweiid;
    /**
    * 军官编制员额
    */
    @CsvBindByPosition(position = 2)
    private Double junguanbzye;
    /**
    * 文职干部编制员额
    */
    @CsvBindByPosition(position = 3)
    private Double wenzhigbbzye;
    /**
    * 兵编制员额
    */
    @CsvBindByPosition(position = 4)
    private Double bingbzye;
    /**
    * 职工编制员额
    */
    @CsvBindByPosition(position = 5)
    private Double zhigongbzye;
    /**
    * 非现役文职编制员额
    */
    @CsvBindByPosition(position = 6)
    private Double feixianywzbzye;
    /**
    * 解放军总医院干部床数
    */
    @CsvBindByPosition(position = 7)
    private Double jiefangjzyygbcs;
    /**
    * 解放军总医院普通床数
    */
    @CsvBindByPosition(position = 8)
    private Double jiefangjzyyptcs;
    /**
    * 总医院干部床数
    */
    @CsvBindByPosition(position = 9)
    private Double zongyiygbcs;
    /**
    * 总医院普通床数
    */
    @CsvBindByPosition(position = 10)
    private Double zongyiyptcs;
    /**
    * 中心医院干部床数
    */
    @CsvBindByPosition(position = 11)
    private Double zhongxinyygbcs;
    /**
    * 中心医院普通床数
    */
    @CsvBindByPosition(position = 12)
    private Double zhongxinyyptcs;
    /**
    * 队属医院干部床数
    */
    @CsvBindByPosition(position = 13)
    private Double duishuyygbcs;
    /**
    * 队属医院普通床数
    */
    @CsvBindByPosition(position = 14)
    private Double duishuyyptcs;
    /**
    * 附属医院干部床数
    */
    @CsvBindByPosition(position = 15)
    private Double fushuyygbcs;
    /**
    * 附属医院普通床数
    */
    @CsvBindByPosition(position = 16)
    private Double fushuyyptcs;
    /**
    * 门诊部医疗床位数
    */
    @CsvBindByPosition(position = 17)
    private Double menzhenbylcws;
    /**
    * 师旅医院医疗床位数
    */
    @CsvBindByPosition(position = 18)
    private Double shilvyyylcws;
    /**
    * 旅团卫生队医疗床位数
    */
    @CsvBindByPosition(position = 19)
    private Double lvtuanwsdylcws;
    /**
    * 疗养院特勤床数
    */
    @CsvBindByPosition(position = 20)
    private Double liaoyangytqcws;
    /**
    * 疗养院普通床数
    */
    @CsvBindByPosition(position = 21)
    private Double liaoyangyptcws;
    /**
    * 医疗手术台数 (台)
    */
    @CsvBindByPosition(position = 22)
    private Double yiliaossts;
    /**
    * 列编非企业化招待所床位数
    */
    @CsvBindByPosition(position = 23)
    private Double liebianfqyhzdscws;
    /**
    * 高原兵站招待床位数
    */
    @CsvBindByPosition(position = 24)
    private Double gaoyuanbzzdcws;
    /**
    * 编外职工数
    */
    @CsvBindByPosition(position = 25)
    private Double bianwaizgs;
    /**
    * 有工作家属数
    */
    @CsvBindByPosition(position = 26)
    private Double yougongzjss;
    /**
    * 无工作家属数
    */
    @CsvBindByPosition(position = 27)
    private Double wugongzjss;
    /**
    * 有工作遗属数
    */
    @CsvBindByPosition(position = 28)
    private Double yougongzyss;
    /**
    * 无工作遗属数
    */
    @CsvBindByPosition(position = 29)
    private Double wugongzyss;
    /**
    * 办理医疗包干人员数
    */
    @CsvBindByPosition(position = 30)
    private Double banliylbgrys;
    /**
    * 发给医疗补助人员数
    */
    @CsvBindByPosition(position = 31)
    private Double fageiylbzrys;
    /**
    * 已故离休干部配偶数
    */
    @CsvBindByPosition(position = 32)
    private Double yigulxgbpos;
    /**
    * 遗属户数
    */
    @CsvBindByPosition(position = 33)
    private Double yishuhs;
    /**
    * 劳教、判刑人员数
    */
    @CsvBindByPosition(position = 34)
    private Double laojiaopxrys;
    /**
    * 军马数（匹）
    */
    @CsvBindByPosition(position = 35)
    private Double junmashu;
    /**
    * 军犬数（条）
    */
    @CsvBindByPosition(position = 36)
    private Double junquanshu;
    /**
    * 数据所在单位
    */
    @CsvBindByPosition(position = 37)
    private String shujuszdw;
    /**
    * 士官编制员额
    */
    @CsvBindByPosition(position = 38)
    private Double shiguanbzye;
    /**
    * 非现役公勤编制员额
    */
    @CsvBindByPosition(position = 39)
    private Double feixianygqbzye;
    /**
    * 机关军官编制员额
    */
    @CsvBindByPosition(position = 40)
    private Double junguanbzyejg;
    /**
    * 机关文职干部编制员额
    */
    @CsvBindByPosition(position = 41)
    private Double wenzhigbbzyejg;
    /**
    * 机关士官编制员额
    */
    @CsvBindByPosition(position = 42)
    private Double shiguanbzyejg;
    /**
    * 机关兵编制员额
    */
    @CsvBindByPosition(position = 43)
    private Double bingbzyejg;
    /**
    * 机关职工编制员额
    */
    @CsvBindByPosition(position = 44)
    private Double zhigongbzyejg;
    /**
    * 机关非现役文职编制员额
    */
    @CsvBindByPosition(position = 45)
    private Double feixianywzbzyejg;
    /**
    * 机关非现役公勤编制员额
    */
    @CsvBindByPosition(position = 46)
    private Double feixianygqbzyejg;
    /**
    * 直属分队军官编制员额
    */
    @CsvBindByPosition(position = 47)
    private Double junguanbzyezf;
    /**
    * 直属分队文职干部编制员额
    */
    @CsvBindByPosition(position = 48)
    private Double wenzhigbbzyezf;
    /**
    * 直属分队士官编制员额
    */
    @CsvBindByPosition(position = 49)
    private Double shiguanbzyezf;
    /**
    * 直属分队兵编制员额
    */
    @CsvBindByPosition(position = 50)
    private Double bingbzyezf;
    /**
    * 直属分队职工编制员额
    */
    @CsvBindByPosition(position = 51)
    private Double zhigongbzyezf;
    /**
    * 直属分队非现役文职编制员额
    */
    @CsvBindByPosition(position = 52)
    private Double feixianywzbzyezf;
    /**
    * 直属分队非现役公勤编制员额
    */
    @CsvBindByPosition(position = 53)
    private Double feixianygqbzyezf;
    /**
    * 后方仓库容量(万平、立方米)编制数
    */
    @CsvBindByPosition(position = 54)
    private Double cangkurlbzs;
    /**
    * 后方医院、疗养院床位(张)编制数
    */
    @CsvBindByPosition(position = 55)
    private Double yiliaocwbzs;
    /**
    * 汽车部队车辆(台)编制数
    */
    @CsvBindByPosition(position = 56)
    private Double cheliangbzs;
    /**
    * 野战输油管线长(公里)编制数
    */
    @CsvBindByPosition(position = 57)
    private Double shuyougxbzs;
    /**
    * 各类勤务船艇(艘)编制数
    */
    @CsvBindByPosition(position = 58)
    private Double qinwuctbzs;
    /**
    * 工程建筑部队工程机械(台)编制数
    */
    @CsvBindByPosition(position = 59)
    private Double gongchengjxbzs;
    /**
    * 后方仓库容量(万平、立方米)现有数
    */
    @CsvBindByPosition(position = 60)
    private Double cangkurlxys;
    /**
    * 后方医院、疗养院床位(张)现有数
    */
    @CsvBindByPosition(position = 61)
    private Double yiliaocwxys;
    /**
    * 汽车部队车辆(台) 现有数
    */
    @CsvBindByPosition(position = 62)
    private Double cheliangxys;
    /**
    * 野战输油管线长(公里)现有数
    */
    @CsvBindByPosition(position = 63)
    private Double shuyougxxys;
    /**
    * 各类勤务船艇(艘)现有数
    */
    @CsvBindByPosition(position = 64)
    private Double qinwuctxys;
    /**
    * 工程建筑部队工程机械(台)现有数
    */
    @CsvBindByPosition(position = 65)
    private Double gongchengjxxys;
    /**
    * 骆驼数
    */
    @CsvBindByPosition(position = 66)
    private Double luotuoshu;
    /**
    * 学员编制员额
    */
    @CsvBindByPosition(position = 67)
    private Double xueyuanbzye;
    /**
    * 机关学员编制员额
    */
    @CsvBindByPosition(position = 68)
    private Double xueyuanbzyejg;
    /**
    * 直属分队学员编制员额
    */
    @CsvBindByPosition(position = 69)
    private Double xueyuanbzyezf;

}