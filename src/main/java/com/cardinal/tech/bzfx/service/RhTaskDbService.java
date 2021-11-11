package com.cardinal.tech.bzfx.service;

import com.cardinal.tech.bzfx.entity.RhTaskDb;
import java.util.List;

/**
 * 任务数据-数据库(RhTaskDb)表服务接口
 *
 * @author cadinal.tech
 * @since 2021-11-11 20:18:33
 */
public interface RhTaskDbService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    RhTaskDb queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<RhTaskDb> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param rhTaskDb 实例对象
     * @return 实例对象
     */
    RhTaskDb insert(RhTaskDb rhTaskDb);

    /**
     * 修改数据
     *
     * @param rhTaskDb 实例对象
     * @return 实例对象
     */
    RhTaskDb update(RhTaskDb rhTaskDb);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}