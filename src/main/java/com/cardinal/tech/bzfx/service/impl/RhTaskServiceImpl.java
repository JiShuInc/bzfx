package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.RhTask;
import com.cardinal.tech.bzfx.dao.RhTaskDao;
import com.cardinal.tech.bzfx.service.RhTaskService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 任务(RhTask)表服务实现类
 *
 * @author cadinal.tech
 * @since 2021-11-13 19:28:46
 */
@RequiredArgsConstructor
@Service("rhTaskService")
public class RhTaskServiceImpl implements RhTaskService {

    private final RhTaskDao rhTaskDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public RhTask queryById(Long id) {
        return this.rhTaskDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<RhTask> queryAllByLimit(int offset, int limit) {
        return this.rhTaskDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param rhTask 实例对象
     * @return 实例对象
     */
    @Override
    public RhTask insert(RhTask rhTask) {
        this.rhTaskDao.insert(rhTask);
        return rhTask;
    }

    /**
     * 修改数据
     *
     * @param rhTask 实例对象
     * @return 实例对象
     */
    @Override
    public RhTask update(RhTask rhTask) {
        this.rhTaskDao.update(rhTask);
        return this.queryById(rhTask.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.rhTaskDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.rhTaskDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<RhTask> page(PageForm<RhTask> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<RhTask> entityList = this.rhTaskDao.queryPageRhTaskList(pq);
        Page<RhTask> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}