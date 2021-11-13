package com.cardinal.tech.bzfx.service;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.entity.TjDanweixx;
import java.util.List;
import java.util.Map;

/**
 * 单位信息表(TjDanweixx)表服务接口
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:38
 */
public interface TjDanweixxService {

        /**
         * 通过ID查询单条数据
         *
         * @param id 主键
         * @return 实例对象
         */
        TjDanweixx queryById(Long id);

        /**
         * 查询多条数据
         *
         * @param offset 查询起始位置
         * @param limit 查询条数
         * @return 对象列表
         */
        List<TjDanweixx> queryAllByLimit(int offset, int limit);

        /**
         * 新增数据
         *
         * @param tjDanweixx 实例对象
         * @return 实例对象
         */
        TjDanweixx insert(TjDanweixx tjDanweixx);

        /**
         * 修改数据
         *
         * @param tjDanweixx 实例对象
         * @return 实例对象
         */
        TjDanweixx update(TjDanweixx tjDanweixx);

        /**
         * 通过主键删除数据
         *
         * @param id 主键
         * @return 是否成功
         */
        boolean deleteById(Long id);

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
        Page<TjDanweixx> page(PageForm<TjDanweixx> userQueryForm);

}