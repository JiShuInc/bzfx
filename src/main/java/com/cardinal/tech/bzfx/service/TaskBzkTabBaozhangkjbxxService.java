package com.cardinal.tech.bzfx.service;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.entity.TaskBzkTabBaozhangkjbxx;
import java.util.List;
import java.util.Map;

/**
 * 保障卡基本信息(TaskBzkTabBaozhangkjbxx)表服务接口
 *
 * @author makejava
 * @since 2021-11-28 12:40:57
 */
public interface TaskBzkTabBaozhangkjbxxService {

        /**
         * 通过ID查询单条数据
         *
         * @param taskid 主键
         * @return 实例对象
         */
        TaskBzkTabBaozhangkjbxx queryById(Long taskid);

        /**
         * 查询多条数据
         *
         * @param offset 查询起始位置
         * @param limit 查询条数
         * @return 对象列表
         */
        List<TaskBzkTabBaozhangkjbxx> queryAllByLimit(int offset, int limit);

        /**
         * 新增数据
         *
         * @param taskBzkTabBaozhangkjbxx 实例对象
         * @return 实例对象
         */
        TaskBzkTabBaozhangkjbxx insert(TaskBzkTabBaozhangkjbxx taskBzkTabBaozhangkjbxx);

        /**
         * 修改数据
         *
         * @param taskBzkTabBaozhangkjbxx 实例对象
         * @return 实例对象
         */
        TaskBzkTabBaozhangkjbxx update(TaskBzkTabBaozhangkjbxx taskBzkTabBaozhangkjbxx);

        /**
         * 通过主键删除数据
         *
         * @param taskid 主键
         * @return 是否成功
         */
        boolean deleteById(Long taskid);

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
        Page<TaskBzkTabBaozhangkjbxx> page(PageForm<TaskBzkTabBaozhangkjbxx> userQueryForm);

}