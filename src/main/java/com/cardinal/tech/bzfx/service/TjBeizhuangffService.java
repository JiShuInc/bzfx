package com.cardinal.tech.bzfx.service;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.entity.TjBeizhuangff;
import java.util.List;
import java.util.Map;

/**
 * 被装发放记录(TjBeizhuangff)表服务接口
 *
 * @author cadinal.tech
 * @since 2021-11-13 01:33:38
 */
public interface TjBeizhuangffService {

        /**
         * 通过ID查询单条数据
         *
         * @param id 主键
         * @return 实例对象
         */
        TjBeizhuangff queryById(Long id);

        /**
         * 查询多条数据
         *
         * @param offset 查询起始位置
         * @param limit 查询条数
         * @return 对象列表
         */
        List<TjBeizhuangff> queryAllByLimit(int offset, int limit);

        /**
         * 新增数据
         *
         * @param tjBeizhuangff 实例对象
         * @return 实例对象
         */
        TjBeizhuangff insert(TjBeizhuangff tjBeizhuangff);

        /**
         * 修改数据
         *
         * @param tjBeizhuangff 实例对象
         * @return 实例对象
         */
        TjBeizhuangff update(TjBeizhuangff tjBeizhuangff);

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
        Page<TjBeizhuangff> page(PageForm<TjBeizhuangff> userQueryForm);

}