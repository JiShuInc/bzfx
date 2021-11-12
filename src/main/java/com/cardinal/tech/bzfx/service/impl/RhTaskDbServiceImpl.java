package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.RhTaskDb;
import com.cardinal.tech.bzfx.dao.RhTaskDbDao;
import com.cardinal.tech.bzfx.service.RhTaskDbService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 任务数据-数据库(RhTaskDb)表服务实现类
 *
 * @author cadinal.tech
 * @since 2021-11-13 01:33:38
 */
@RequiredArgsConstructor
@Service("rhTaskDbService")
public class RhTaskDbServiceImpl implements RhTaskDbService {

    private final RhTaskDbDao rhTaskDbDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public RhTaskDb queryById(Long id) {
        return this.rhTaskDbDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<RhTaskDb> queryAllByLimit(int offset, int limit) {
        return this.rhTaskDbDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param rhTaskDb 实例对象
     * @return 实例对象
     */
    @Override
    public RhTaskDb insert(RhTaskDb rhTaskDb) {
        this.rhTaskDbDao.insert(rhTaskDb);
        return rhTaskDb;
    }

    /**
     * 修改数据
     *
     * @param rhTaskDb 实例对象
     * @return 实例对象
     */
    @Override
    public RhTaskDb update(RhTaskDb rhTaskDb) {
        this.rhTaskDbDao.update(rhTaskDb);
        return this.queryById(rhTaskDb.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.rhTaskDbDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.rhTaskDbDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<RhTaskDb> page(PageForm<RhTaskDb> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<RhTaskDb> entityList = this.rhTaskDbDao.queryPageRhTaskDbList(pq);
        Page<RhTaskDb> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}