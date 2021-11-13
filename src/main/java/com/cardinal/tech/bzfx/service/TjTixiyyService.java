package com.cardinal.tech.bzfx.service;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.entity.TjTixiyy;
import java.util.List;
import java.util.Map;

/**
 * 体系医院标准编码(TjTixiyy)表服务接口
 *
 * @author cadinal.tech
 * @since 2021-11-13 19:28:47
 */
public interface TjTixiyyService {

        /**
         * 通过ID查询单条数据
         *
         * @param id 主键
         * @return 实例对象
         */
        TjTixiyy queryById(Long id);

        /**
         * 查询多条数据
         *
         * @param offset 查询起始位置
         * @param limit 查询条数
         * @return 对象列表
         */
        List<TjTixiyy> queryAllByLimit(int offset, int limit);

        /**
         * 新增数据
         *
         * @param tjTixiyy 实例对象
         * @return 实例对象
         */
        TjTixiyy insert(TjTixiyy tjTixiyy);

        /**
         * 修改数据
         *
         * @param tjTixiyy 实例对象
         * @return 实例对象
         */
        TjTixiyy update(TjTixiyy tjTixiyy);

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
        Page<TjTixiyy> page(PageForm<TjTixiyy> userQueryForm);

}