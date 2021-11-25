package com.cardinal.tech.bzfx.service;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.entity.BzkBzTabDwxxdz;
import java.util.List;
import java.util.Map;

/**
 * 单位信息对照(BzkBzTabDwxxdz)表服务接口
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
public interface BzkBzTabDwxxdzService {

        /**
         * 通过ID查询单条数据
         *
         * @param danweiid 主键
         * @return 实例对象
         */
        BzkBzTabDwxxdz queryById(String danweiid);

        /**
         * 查询多条数据
         *
         * @param offset 查询起始位置
         * @param limit 查询条数
         * @return 对象列表
         */
        List<BzkBzTabDwxxdz> queryAllByLimit(int offset, int limit);

        /**
         * 新增数据
         *
         * @param bzkBzTabDwxxdz 实例对象
         * @return 实例对象
         */
        BzkBzTabDwxxdz insert(BzkBzTabDwxxdz bzkBzTabDwxxdz);

        /**
         * 修改数据
         *
         * @param bzkBzTabDwxxdz 实例对象
         * @return 实例对象
         */
        BzkBzTabDwxxdz update(BzkBzTabDwxxdz bzkBzTabDwxxdz);

        /**
         * 通过主键删除数据
         *
         * @param danweiid 主键
         * @return 是否成功
         */
        boolean deleteById(String danweiid);

        /**
         * 通过字段统计
         *
         * @param field 字段名
         * @return 统计结果
         */
        List<Map<String,Integer>> groupBy(String field);

        /**
         *  分页查询
         *
         * @param userQueryForm 查询对象
         * @return 分页结果
         */
        Page<BzkBzTabDwxxdz> page(PageForm<BzkBzTabDwxxdz> userQueryForm);

}