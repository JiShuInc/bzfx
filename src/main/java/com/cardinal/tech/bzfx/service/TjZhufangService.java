package com.cardinal.tech.bzfx.service;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.entity.TjZhufang;
import java.util.List;
import java.util.Map;

/**
 * 人员住房情况(TjZhufang)表服务接口
 *
 * @author cadinal.tech
 * @since 2021-11-13 19:28:47
 */
public interface TjZhufangService {

        /**
         * 通过ID查询单条数据
         *
         * @param id 主键
         * @return 实例对象
         */
        TjZhufang queryById(Long id);

        /**
         * 查询多条数据
         *
         * @param offset 查询起始位置
         * @param limit 查询条数
         * @return 对象列表
         */
        List<TjZhufang> queryAllByLimit(int offset, int limit);

        /**
         * 新增数据
         *
         * @param tjZhufang 实例对象
         * @return 实例对象
         */
        TjZhufang insert(TjZhufang tjZhufang);

        /**
         * 修改数据
         *
         * @param tjZhufang 实例对象
         * @return 实例对象
         */
        TjZhufang update(TjZhufang tjZhufang);

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
        Page<TjZhufang> page(PageForm<TjZhufang> userQueryForm);

}