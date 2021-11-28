package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.TaskBzkSlgxYfRyzfqk;
import com.cardinal.tech.bzfx.dao.TaskBzkSlgxYfRyzfqkDao;
import com.cardinal.tech.bzfx.service.TaskBzkSlgxYfRyzfqkService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 人员住房情况(TaskBzkSlgxYfRyzfqk)表服务实现类
 *
 * @author makejava
 * @since 2021-11-28 12:40:57
 */
@RequiredArgsConstructor
@Service("taskBzkSlgxYfRyzfqkService")
public class TaskBzkSlgxYfRyzfqkServiceImpl implements TaskBzkSlgxYfRyzfqkService {

    private final TaskBzkSlgxYfRyzfqkDao taskBzkSlgxYfRyzfqkDao;

    /**
     * 通过ID查询单条数据
     *
     * @param taskid 主键
     * @return 实例对象
     */
    @Override
    public TaskBzkSlgxYfRyzfqk queryById(Long taskid) {
        return this.taskBzkSlgxYfRyzfqkDao.queryById(taskid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TaskBzkSlgxYfRyzfqk> queryAllByLimit(int offset, int limit) {
        return this.taskBzkSlgxYfRyzfqkDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param taskBzkSlgxYfRyzfqk 实例对象
     * @return 实例对象
     */
    @Override
    public TaskBzkSlgxYfRyzfqk insert(TaskBzkSlgxYfRyzfqk taskBzkSlgxYfRyzfqk) {
        this.taskBzkSlgxYfRyzfqkDao.insert(taskBzkSlgxYfRyzfqk);
        return taskBzkSlgxYfRyzfqk;
    }

    /**
     * 修改数据
     *
     * @param taskBzkSlgxYfRyzfqk 实例对象
     * @return 实例对象
     */
    @Override
    public TaskBzkSlgxYfRyzfqk update(TaskBzkSlgxYfRyzfqk taskBzkSlgxYfRyzfqk) {
        this.taskBzkSlgxYfRyzfqkDao.update(taskBzkSlgxYfRyzfqk);
        return this.queryById(taskBzkSlgxYfRyzfqk.getTaskid());
    }

    /**
     * 通过主键删除数据
     *
     * @param taskid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long taskid) {
        return this.taskBzkSlgxYfRyzfqkDao.deleteById(taskid) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.taskBzkSlgxYfRyzfqkDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<TaskBzkSlgxYfRyzfqk> page(PageForm<TaskBzkSlgxYfRyzfqk> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<TaskBzkSlgxYfRyzfqk> entityList = this.taskBzkSlgxYfRyzfqkDao.queryPageTaskBzkSlgxYfRyzfqkList(pq);
        Page<TaskBzkSlgxYfRyzfqk> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}