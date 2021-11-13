package com.cardinal.tech.bzfx.service;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.entity.TjBeizhuangxx;
import java.util.List;
import java.util.Map;

/**
 * 被装发放记录(TjBeizhuangxx)表服务接口
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:38
 */
public interface TjBeizhuangxxService {

        /**
         * 通过ID查询单条数据
         *
         * @param id 主键
         * @return 实例对象
         */
        TjBeizhuangxx queryById(Long id);

        /**
         * 查询多条数据
         *
         * @param offset 查询起始位置
         * @param limit 查询条数
         * @return 对象列表
         */
        List<TjBeizhuangxx> queryAllByLimit(int offset, int limit);

        /**
         * 新增数据
         *
         * @param tjBeizhuangxx 实例对象
         * @return 实例对象
         */
        TjBeizhuangxx insert(TjBeizhuangxx tjBeizhuangxx);

        /**
         * 修改数据
         *
         * @param tjBeizhuangxx 实例对象
         * @return 实例对象
         */
        TjBeizhuangxx update(TjBeizhuangxx tjBeizhuangxx);

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
        Page<TjBeizhuangxx> page(PageForm<TjBeizhuangxx> userQueryForm);

}