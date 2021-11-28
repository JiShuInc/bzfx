package com.cardinal.tech.bzfx.service;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.entity.TaskBzkTabDanweibclrxx;
import java.util.List;
import java.util.Map;

/**
 * 单位补充录入信息(TaskBzkTabDanweibclrxx)表服务接口
 *
 * @author makejava
 * @since 2021-11-28 12:40:57
 */
public interface TaskBzkTabDanweibclrxxService {

        /**
         * 通过ID查询单条数据
         *
         * @param taskid 主键
         * @return 实例对象
         */
        TaskBzkTabDanweibclrxx queryById(Long taskid);

        /**
         * 查询多条数据
         *
         * @param offset 查询起始位置
         * @param limit 查询条数
         * @return 对象列表
         */
        List<TaskBzkTabDanweibclrxx> queryAllByLimit(int offset, int limit);

        /**
         * 新增数据
         *
         * @param taskBzkTabDanweibclrxx 实例对象
         * @return 实例对象
         */
        TaskBzkTabDanweibclrxx insert(TaskBzkTabDanweibclrxx taskBzkTabDanweibclrxx);

        /**
         * 修改数据
         *
         * @param taskBzkTabDanweibclrxx 实例对象
         * @return 实例对象
         */
        TaskBzkTabDanweibclrxx update(TaskBzkTabDanweibclrxx taskBzkTabDanweibclrxx);

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
        Page<TaskBzkTabDanweibclrxx> page(PageForm<TaskBzkTabDanweibclrxx> userQueryForm);

}