package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * 单位补充录入信息(TaskBzkTabDanweibclrxx)实体类
 *
 * @author makejava
 * @since 2021-11-28 12:40:57
 */
public class TaskBzkTabDanweibclrxx implements Serializable {
    private static final long serialVersionUID = -32096475392630522L;
    /**
    * 任务ID
    */
    private Long taskid;
    /**
    * 主键ID
    */
    private String id;
    /**
    * 单位；ID
    */
    private String danweiid;
    /**
    * 军官编制员额
    */
    private Double junguanbzye;
    /**
    * 文职干部编制员额
    */
    private Double wenzhigbbzye;
    /**
    * 兵编制员额
    */
    private Double bingbzye;
    /**
    * 职工编制员额
    */
    private Double zhigongbzye;
    /**
    * 非现役文职编制员额
    */
    private Double feixianywzbzye;
    /**
    * 解放军总医院干部床数
    */
    private Double jiefangjzyygbcs;
    /**
    * 解放军总医院普通床数
    */
    private Double jiefangjzyyptcs;
    /**
    * 总医院干部床数
    */
    private Double zongyiygbcs;
    /**
    * 总医院普通床数
    */
    private Double zongyiyptcs;
    /**
    * 中心医院干部床数
    */
    private Double zhongxinyygbcs;
    /**
    * 中心医院普通床数
    */
    private Double zhongxinyyptcs;
    /**
    * 队属医院干部床数
    */
    private Double duishuyygbcs;
    /**
    * 队属医院普通床数
    */
    private Double duishuyyptcs;
    /**
    * 附属医院干部床数
    */
    private Double fushuyygbcs;
    /**
    * 附属医院普通床数
    */
    private Double fushuyyptcs;
    /**
    * 门诊部医疗床位数
    */
    private Double menzhenbylcws;
    /**
    * 师旅医院医疗床位数
    */
    private Double shilvyyylcws;
    /**
    * 旅团卫生队医疗床位数
    */
    private Double lvtuanwsdylcws;
    /**
    * 疗养院特勤床数
    */
    private Double liaoyangytqcws;
    /**
    * 疗养院普通床数
    */
    private Double liaoyangyptcws;
    /**
    * 医疗手术台数 (台)
    */
    private Double yiliaossts;
    /**
    * 列编非企业化招待所床位数
    */
    private Double liebianfqyhzdscws;
    /**
    * 高原兵站招待床位数
    */
    private Double gaoyuanbzzdcws;
    /**
    * 编外职工数
    */
    private Double bianwaizgs;
    /**
    * 有工作家属数
    */
    private Double yougongzjss;
    /**
    * 无工作家属数
    */
    private Double wugongzjss;
    /**
    * 有工作遗属数
    */
    private Double yougongzyss;
    /**
    * 无工作遗属数
    */
    private Double wugongzyss;
    /**
    * 办理医疗包干人员数
    */
    private Double banliylbgrys;
    /**
    * 发给医疗补助人员数
    */
    private Double fageiylbzrys;
    /**
    * 已故离休干部配偶数
    */
    private Double yigulxgbpos;
    /**
    * 遗属户数
    */
    private Double yishuhs;
    /**
    * 劳教、判刑人员数
    */
    private Double laojiaopxrys;
    /**
    * 军马数（匹）
    */
    private Double junmashu;
    /**
    * 军犬数（条）
    */
    private Double junquanshu;
    /**
    * 数据所在单位
    */
    private String shujuszdw;
    /**
    * 士官编制员额
    */
    private Double shiguanbzye;
    /**
    * 非现役公勤编制员额
    */
    private Double feixianygqbzye;
    /**
    * 机关军官编制员额
    */
    private Double junguanbzyejg;
    /**
    * 机关文职干部编制员额
    */
    private Double wenzhigbbzyejg;
    /**
    * 机关士官编制员额
    */
    private Double shiguanbzyejg;
    /**
    * 机关兵编制员额
    */
    private Double bingbzyejg;
    /**
    * 机关职工编制员额
    */
    private Double zhigongbzyejg;
    /**
    * 机关非现役文职编制员额
    */
    private Double feixianywzbzyejg;
    /**
    * 机关非现役公勤编制员额
    */
    private Double feixianygqbzyejg;
    /**
    * 直属分队军官编制员额
    */
    private Double junguanbzyezf;
    /**
    * 直属分队文职干部编制员额
    */
    private Double wenzhigbbzyezf;
    /**
    * 直属分队士官编制员额
    */
    private Double shiguanbzyezf;
    /**
    * 直属分队兵编制员额
    */
    private Double bingbzyezf;
    /**
    * 直属分队职工编制员额
    */
    private Double zhigongbzyezf;
    /**
    * 直属分队非现役文职编制员额
    */
    private Double feixianywzbzyezf;
    /**
    * 直属分队非现役公勤编制员额
    */
    private Double feixianygqbzyezf;
    /**
    * 后方仓库容量(万平、立方米)编制数
    */
    private Double cangkurlbzs;
    /**
    * 后方医院、疗养院床位(张)编制数
    */
    private Double yiliaocwbzs;
    /**
    * 汽车部队车辆(台)编制数
    */
    private Double cheliangbzs;
    /**
    * 野战输油管线长(公里)编制数
    */
    private Double shuyougxbzs;
    /**
    * 各类勤务船艇(艘)编制数
    */
    private Double qinwuctbzs;
    /**
    * 工程建筑部队工程机械(台)编制数
    */
    private Double gongchengjxbzs;
    /**
    * 后方仓库容量(万平、立方米)现有数
    */
    private Double cangkurlxys;
    /**
    * 后方医院、疗养院床位(张)现有数
    */
    private Double yiliaocwxys;
    /**
    * 汽车部队车辆(台) 现有数
    */
    private Double cheliangxys;
    /**
    * 野战输油管线长(公里)现有数
    */
    private Double shuyougxxys;
    /**
    * 各类勤务船艇(艘)现有数
    */
    private Double qinwuctxys;
    /**
    * 工程建筑部队工程机械(台)现有数
    */
    private Double gongchengjxxys;
    /**
    * 骆驼数
    */
    private Double luotuoshu;
    /**
    * 学员编制员额
    */
    private Double xueyuanbzye;
    /**
    * 机关学员编制员额
    */
    private Double xueyuanbzyejg;
    /**
    * 直属分队学员编制员额
    */
    private Double xueyuanbzyezf;

}