package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;

import com.opencsv.bean.CsvBindByName;
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
    @CsvBindByName(column = "ID")
    private String id;
    /**
    * 单位；ID
    */
    @CsvBindByName(column = "DANWEIID")
    private String danweiid;
    /**
    * 军官编制员额
    */
    @CsvBindByName(column = "JUNGUANBZYE")
    private Double junguanbzye;
    /**
    * 文职干部编制员额
    */
    @CsvBindByName(column = "WENZHIGBBZYE")
    private Double wenzhigbbzye;
    /**
    * 兵编制员额
    */
    @CsvBindByName(column = "BINGBZYE")
    private Double bingbzye;
    /**
    * 职工编制员额
    */
    @CsvBindByName(column = "ZHIGONGBZYE")
    private Double zhigongbzye;
    /**
    * 非现役文职编制员额
    */
    @CsvBindByName(column = "FEIXIANYWZBZYE")
    private Double feixianywzbzye;
    /**
    * 解放军总医院干部床数
    */
    @CsvBindByName(column = "JIEFANGJZYYGBCS")
    private Double jiefangjzyygbcs;
    /**
    * 解放军总医院普通床数
    */
    @CsvBindByName(column = "JIEFANGJZYYPTCS")
    private Double jiefangjzyyptcs;
    /**
    * 总医院干部床数
    */
    @CsvBindByName(column = "ZONGYIYGBCS")
    private Double zongyiygbcs;
    /**
    * 总医院普通床数
    */
    @CsvBindByName(column = "ZONGYIYPTCS")
    private Double zongyiyptcs;
    /**
    * 中心医院干部床数
    */
    @CsvBindByName(column = "ZHONGXINYYGBCS")
    private Double zhongxinyygbcs;
    /**
    * 中心医院普通床数
    */
    @CsvBindByName(column = "ZHONGXINYYPTCS")
    private Double zhongxinyyptcs;
    /**
    * 队属医院干部床数
    */
    @CsvBindByName(column = "DUISHUYYGBCS")
    private Double duishuyygbcs;
    /**
    * 队属医院普通床数
    */
    @CsvBindByName(column = "DUISHUYYPTCS")
    private Double duishuyyptcs;
    /**
    * 附属医院干部床数
    */
    @CsvBindByName(column = "FUSHUYYGBCS")
    private Double fushuyygbcs;
    /**
    * 附属医院普通床数
    */
    @CsvBindByName(column = "FUSHUYYPTCS")
    private Double fushuyyptcs;
    /**
    * 门诊部医疗床位数
    */
    @CsvBindByName(column = "MENZHENBYLCWS")
    private Double menzhenbylcws;
    /**
    * 师旅医院医疗床位数
    */
    @CsvBindByName(column = "SHILVYYYLCWS")
    private Double shilvyyylcws;
    /**
    * 旅团卫生队医疗床位数
    */
    @CsvBindByName(column = "LVTUANWSDYLCWS")
    private Double lvtuanwsdylcws;
    /**
    * 疗养院特勤床数
    */
    @CsvBindByName(column = "LIAOYANGYTQCWS")
    private Double liaoyangytqcws;
    /**
    * 疗养院普通床数
    */
    @CsvBindByName(column = "LIAOYANGYPTCWS")
    private Double liaoyangyptcws;
    /**
    * 医疗手术台数 (台)
    */
    @CsvBindByName(column = "YILIAOSSTS")
    private Double yiliaossts;
    /**
    * 列编非企业化招待所床位数
    */
    @CsvBindByName(column = "LIEBIANFQYHZDSCWS")
    private Double liebianfqyhzdscws;
    /**
    * 高原兵站招待床位数
    */
    @CsvBindByName(column = "GAOYUANBZZDCWS")
    private Double gaoyuanbzzdcws;
    /**
    * 编外职工数
    */
    @CsvBindByName(column = "BIANWAIZGS")
    private Double bianwaizgs;
    /**
    * 有工作家属数
    */
    @CsvBindByName(column = "YOUGONGZJSS")
    private Double yougongzjss;
    /**
    * 无工作家属数
    */
    @CsvBindByName(column = "WUGONGZJSS")
    private Double wugongzjss;
    /**
    * 有工作遗属数
    */
    @CsvBindByName(column = "YOUGONGZYSS")
    private Double yougongzyss;
    /**
    * 无工作遗属数
    */
    @CsvBindByName(column = "WUGONGZYSS")
    private Double wugongzyss;
    /**
    * 办理医疗包干人员数
    */
    @CsvBindByName(column = "BANLIYLBGRYS")
    private Double banliylbgrys;
    /**
    * 发给医疗补助人员数
    */
    @CsvBindByName(column = "FAGEIYLBZRYS")
    private Double fageiylbzrys;
    /**
    * 已故离休干部配偶数
    */
    @CsvBindByName(column = "YIGULXGBPOS")
    private Double yigulxgbpos;
    /**
    * 遗属户数
    */
    @CsvBindByName(column = "YISHUHS")
    private Double yishuhs;
    /**
    * 劳教、判刑人员数
    */
    @CsvBindByName(column = "LAOJIAOPXRYS")
    private Double laojiaopxrys;
    /**
    * 军马数（匹）
    */
    @CsvBindByName(column = "JUNMASHU")
    private Double junmashu;
    /**
    * 军犬数（条）
    */
    @CsvBindByName(column = "JUNQUANSHU")
    private Double junquanshu;
    /**
    * 数据所在单位
    */
    @CsvBindByName(column = "SHUJUSZDW")
    private String shujuszdw;
    /**
    * 士官编制员额
    */
    @CsvBindByName(column = "SHIGUANBZYE")
    private Double shiguanbzye;
    /**
    * 非现役公勤编制员额
    */
    @CsvBindByName(column = "FEIXIANYGQBZYE")
    private Double feixianygqbzye;
    /**
    * 机关军官编制员额
    */
    @CsvBindByName(column = "JUNGUANBZYEJG")
    private Double junguanbzyejg;
    /**
    * 机关文职干部编制员额
    */
    @CsvBindByName(column = "WENZHIGBBZYEJG")
    private Double wenzhigbbzyejg;
    /**
    * 机关士官编制员额
    */
    @CsvBindByName(column = "SHIGUANBZYEJG")
    private Double shiguanbzyejg;
    /**
    * 机关兵编制员额
    */
    @CsvBindByName(column = "BINGBZYEJG")
    private Double bingbzyejg;
    /**
    * 机关职工编制员额
    */
    @CsvBindByName(column = "ZHIGONGBZYEJG")
    private Double zhigongbzyejg;
    /**
    * 机关非现役文职编制员额
    */
    @CsvBindByName(column = "FEIXIANYWZBZYEJG")
    private Double feixianywzbzyejg;
    /**
    * 机关非现役公勤编制员额
    */
    @CsvBindByName(column = "FEIXIANYGQBZYEJG")
    private Double feixianygqbzyejg;
    /**
    * 直属分队军官编制员额
    */
    @CsvBindByName(column = "JUNGUANBZYEZF")
    private Double junguanbzyezf;
    /**
    * 直属分队文职干部编制员额
    */
    @CsvBindByName(column = "WENZHIGBBZYEZF")
    private Double wenzhigbbzyezf;
    /**
    * 直属分队士官编制员额
    */
    @CsvBindByName(column = "SHIGUANBZYEZF")
    private Double shiguanbzyezf;
    /**
    * 直属分队兵编制员额
    */
    @CsvBindByName(column = "BINGBZYEZF")
    private Double bingbzyezf;
    /**
    * 直属分队职工编制员额
    */
    @CsvBindByName(column = "ZHIGONGBZYEZF")
    private Double zhigongbzyezf;
    /**
    * 直属分队非现役文职编制员额
    */
    @CsvBindByName(column = "FEIXIANYWZBZYEZF")
    private Double feixianywzbzyezf;
    /**
    * 直属分队非现役公勤编制员额
    */
    @CsvBindByName(column = "FEIXIANYGQBZYEZF")
    private Double feixianygqbzyezf;
    /**
    * 后方仓库容量(万平、立方米)编制数
    */
    @CsvBindByName(column = "CANGKURLBZS")
    private Double cangkurlbzs;
    /**
    * 后方医院、疗养院床位(张)编制数
    */
    @CsvBindByName(column = "YILIAOCWBZS")
    private Double yiliaocwbzs;
    /**
    * 汽车部队车辆(台)编制数
    */
    @CsvBindByName(column = "CHELIANGBZS")
    private Double cheliangbzs;
    /**
    * 野战输油管线长(公里)编制数
    */
    @CsvBindByName(column = "SHUYOUGXBZS")
    private Double shuyougxbzs;
    /**
    * 各类勤务船艇(艘)编制数
    */
    @CsvBindByName(column = "QINWUCTBZS")
    private Double qinwuctbzs;
    /**
    * 工程建筑部队工程机械(台)编制数
    */
    @CsvBindByName(column = "GONGCHENGJXBZS")
    private Double gongchengjxbzs;
    /**
    * 后方仓库容量(万平、立方米)现有数
    */
    @CsvBindByName(column = "CANGKURLXYS")
    private Double cangkurlxys;
    /**
    * 后方医院、疗养院床位(张)现有数
    */
    @CsvBindByName(column = "YILIAOCWXYS")
    private Double yiliaocwxys;
    /**
    * 汽车部队车辆(台) 现有数
    */
    @CsvBindByName(column = "CHELIANGXYS")
    private Double cheliangxys;
    /**
    * 野战输油管线长(公里)现有数
    */
    @CsvBindByName(column = "SHUYOUGXXYS")
    private Double shuyougxxys;
    /**
    * 各类勤务船艇(艘)现有数
    */
    @CsvBindByName(column = "QINWUCTXYS")
    private Double qinwuctxys;
    /**
    * 工程建筑部队工程机械(台)现有数
    */
    @CsvBindByName(column = "GONGCHENGJXXYS")
    private Double gongchengjxxys;
    /**
    * 骆驼数
    */
    @CsvBindByName(column = "LUOTUOSHU")
    private Double luotuoshu;
    /**
    * 学员编制员额
    */
    @CsvBindByName(column = "XUEYUANBZYE")
    private Double xueyuanbzye;
    /**
    * 机关学员编制员额
    */
    @CsvBindByName(column = "XUEYUANBZYEJG")
    private Double xueyuanbzyejg;
    /**
    * 直属分队学员编制员额
    */
    @CsvBindByName(column = "XUEYUANBZYEZF")
    private Double xueyuanbzyezf;

}