package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.TaskBzkSlgxBzBzdaxx;
import com.cardinal.tech.bzfx.dao.TaskBzkSlgxBzBzdaxxDao;
import com.cardinal.tech.bzfx.service.TaskBzkSlgxBzBzdaxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 被装档案信息(TaskBzkSlgxBzBzdaxx)表服务实现类
 *
 * @author makejava
 * @since 2021-11-28 12:40:57
 */
@RequiredArgsConstructor
@Service("taskBzkSlgxBzBzdaxxService")
public class TaskBzkSlgxBzBzdaxxServiceImpl implements TaskBzkSlgxBzBzdaxxService {

    private final TaskBzkSlgxBzBzdaxxDao taskBzkSlgxBzBzdaxxDao;

    /**
     * 通过ID查询单条数据
     *
     * @param taskid 主键
     * @return 实例对象
     */
    @Override
    public TaskBzkSlgxBzBzdaxx queryById(Long taskid) {
        return this.taskBzkSlgxBzBzdaxxDao.queryById(taskid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TaskBzkSlgxBzBzdaxx> queryAllByLimit(int offset, int limit) {
        return this.taskBzkSlgxBzBzdaxxDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param taskBzkSlgxBzBzdaxx 实例对象
     * @return 实例对象
     */
    @Override
    public TaskBzkSlgxBzBzdaxx insert(TaskBzkSlgxBzBzdaxx taskBzkSlgxBzBzdaxx) {
        this.taskBzkSlgxBzBzdaxxDao.insert(taskBzkSlgxBzBzdaxx);
        return taskBzkSlgxBzBzdaxx;
    }

    /**
     * 修改数据
     *
     * @param taskBzkSlgxBzBzdaxx 实例对象
     * @return 实例对象
     */
    @Override
    public TaskBzkSlgxBzBzdaxx update(TaskBzkSlgxBzBzdaxx taskBzkSlgxBzBzdaxx) {
        this.taskBzkSlgxBzBzdaxxDao.update(taskBzkSlgxBzBzdaxx);
        return this.queryById(taskBzkSlgxBzBzdaxx.getTaskid());
    }

    /**
     * 通过主键删除数据
     *
     * @param taskid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long taskid) {
        return this.taskBzkSlgxBzBzdaxxDao.deleteById(taskid) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.taskBzkSlgxBzBzdaxxDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<TaskBzkSlgxBzBzdaxx> page(PageForm<TaskBzkSlgxBzBzdaxx> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<TaskBzkSlgxBzBzdaxx> entityList = this.taskBzkSlgxBzBzdaxxDao.queryPageTaskBzkSlgxBzBzdaxxList(pq);
        Page<TaskBzkSlgxBzBzdaxx> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}