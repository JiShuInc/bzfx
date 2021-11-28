package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.TaskBzkTabRenyuanjbxx;
import com.cardinal.tech.bzfx.dao.TaskBzkTabRenyuanjbxxDao;
import com.cardinal.tech.bzfx.service.TaskBzkTabRenyuanjbxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 人员基本信息(TaskBzkTabRenyuanjbxx)表服务实现类
 *
 * @author makejava
 * @since 2021-11-28 12:40:57
 */
@RequiredArgsConstructor
@Service("taskBzkTabRenyuanjbxxService")
public class TaskBzkTabRenyuanjbxxServiceImpl implements TaskBzkTabRenyuanjbxxService {

    private final TaskBzkTabRenyuanjbxxDao taskBzkTabRenyuanjbxxDao;

    /**
     * 通过ID查询单条数据
     *
     * @param taskid 主键
     * @return 实例对象
     */
    @Override
    public TaskBzkTabRenyuanjbxx queryById(Long taskid) {
        return this.taskBzkTabRenyuanjbxxDao.queryById(taskid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TaskBzkTabRenyuanjbxx> queryAllByLimit(int offset, int limit) {
        return this.taskBzkTabRenyuanjbxxDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param taskBzkTabRenyuanjbxx 实例对象
     * @return 实例对象
     */
    @Override
    public TaskBzkTabRenyuanjbxx insert(TaskBzkTabRenyuanjbxx taskBzkTabRenyuanjbxx) {
        this.taskBzkTabRenyuanjbxxDao.insert(taskBzkTabRenyuanjbxx);
        return taskBzkTabRenyuanjbxx;
    }

    /**
     * 修改数据
     *
     * @param taskBzkTabRenyuanjbxx 实例对象
     * @return 实例对象
     */
    @Override
    public TaskBzkTabRenyuanjbxx update(TaskBzkTabRenyuanjbxx taskBzkTabRenyuanjbxx) {
        this.taskBzkTabRenyuanjbxxDao.update(taskBzkTabRenyuanjbxx);
        return this.queryById(taskBzkTabRenyuanjbxx.getTaskid());
    }

    /**
     * 通过主键删除数据
     *
     * @param taskid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long taskid) {
        return this.taskBzkTabRenyuanjbxxDao.deleteById(taskid) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.taskBzkTabRenyuanjbxxDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<TaskBzkTabRenyuanjbxx> page(PageForm<TaskBzkTabRenyuanjbxx> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<TaskBzkTabRenyuanjbxx> entityList = this.taskBzkTabRenyuanjbxxDao.queryPageTaskBzkTabRenyuanjbxxList(pq);
        Page<TaskBzkTabRenyuanjbxx> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}