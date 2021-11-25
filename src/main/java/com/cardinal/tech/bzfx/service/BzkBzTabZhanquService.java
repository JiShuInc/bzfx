package com.cardinal.tech.bzfx.service;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.entity.BzkBzTabZhanqu;
import java.util.List;
import java.util.Map;

/**
 * 战区(BzkBzTabZhanqu)表服务接口
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
public interface BzkBzTabZhanquService {

        /**
         * 通过ID查询单条数据
         *
         * @param id 主键
         * @return 实例对象
         */
        BzkBzTabZhanqu queryById(String id);

        /**
         * 查询多条数据
         *
         * @param offset 查询起始位置
         * @param limit 查询条数
         * @return 对象列表
         */
        List<BzkBzTabZhanqu> queryAllByLimit(int offset, int limit);

        /**
         * 新增数据
         *
         * @param bzkBzTabZhanqu 实例对象
         * @return 实例对象
         */
        BzkBzTabZhanqu insert(BzkBzTabZhanqu bzkBzTabZhanqu);

        /**
         * 修改数据
         *
         * @param bzkBzTabZhanqu 实例对象
         * @return 实例对象
         */
        BzkBzTabZhanqu update(BzkBzTabZhanqu bzkBzTabZhanqu);

        /**
         * 通过主键删除数据
         *
         * @param id 主键
         * @return 是否成功
         */
        boolean deleteById(String id);

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
        Page<BzkBzTabZhanqu> page(PageForm<BzkBzTabZhanqu> userQueryForm);

}