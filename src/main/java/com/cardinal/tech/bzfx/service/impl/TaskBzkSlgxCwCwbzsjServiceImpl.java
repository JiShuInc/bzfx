package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.TaskBzkSlgxCwCwbzsj;
import com.cardinal.tech.bzfx.dao.TaskBzkSlgxCwCwbzsjDao;
import com.cardinal.tech.bzfx.service.TaskBzkSlgxCwCwbzsjService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 财务保障数据(TaskBzkSlgxCwCwbzsj)表服务实现类
 *
 * @author makejava
 * @since 2021-11-28 12:40:57
 */
@RequiredArgsConstructor
@Service("taskBzkSlgxCwCwbzsjService")
public class TaskBzkSlgxCwCwbzsjServiceImpl implements TaskBzkSlgxCwCwbzsjService {

    private final TaskBzkSlgxCwCwbzsjDao taskBzkSlgxCwCwbzsjDao;

    /**
     * 通过ID查询单条数据
     *
     * @param taskid 主键
     * @return 实例对象
     */
    @Override
    public TaskBzkSlgxCwCwbzsj queryById(Long taskid) {
        return this.taskBzkSlgxCwCwbzsjDao.queryById(taskid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TaskBzkSlgxCwCwbzsj> queryAllByLimit(int offset, int limit) {
        return this.taskBzkSlgxCwCwbzsjDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param taskBzkSlgxCwCwbzsj 实例对象
     * @return 实例对象
     */
    @Override
    public TaskBzkSlgxCwCwbzsj insert(TaskBzkSlgxCwCwbzsj taskBzkSlgxCwCwbzsj) {
        this.taskBzkSlgxCwCwbzsjDao.insert(taskBzkSlgxCwCwbzsj);
        return taskBzkSlgxCwCwbzsj;
    }

    /**
     * 修改数据
     *
     * @param taskBzkSlgxCwCwbzsj 实例对象
     * @return 实例对象
     */
    @Override
    public TaskBzkSlgxCwCwbzsj update(TaskBzkSlgxCwCwbzsj taskBzkSlgxCwCwbzsj) {
        this.taskBzkSlgxCwCwbzsjDao.update(taskBzkSlgxCwCwbzsj);
        return this.queryById(taskBzkSlgxCwCwbzsj.getTaskid());
    }

    /**
     * 通过主键删除数据
     *
     * @param taskid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long taskid) {
        return this.taskBzkSlgxCwCwbzsjDao.deleteById(taskid) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.taskBzkSlgxCwCwbzsjDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<TaskBzkSlgxCwCwbzsj> page(PageForm<TaskBzkSlgxCwCwbzsj> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<TaskBzkSlgxCwCwbzsj> entityList = this.taskBzkSlgxCwCwbzsjDao.queryPageTaskBzkSlgxCwCwbzsjList(pq);
        Page<TaskBzkSlgxCwCwbzsj> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}