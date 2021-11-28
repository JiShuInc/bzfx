package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.TaskBzkTabDanweijbxx;
import com.cardinal.tech.bzfx.dao.TaskBzkTabDanweijbxxDao;
import com.cardinal.tech.bzfx.service.TaskBzkTabDanweijbxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 单位基本信息(TaskBzkTabDanweijbxx)表服务实现类
 *
 * @author makejava
 * @since 2021-11-28 12:40:57
 */
@RequiredArgsConstructor
@Service("taskBzkTabDanweijbxxService")
public class TaskBzkTabDanweijbxxServiceImpl implements TaskBzkTabDanweijbxxService {

    private final TaskBzkTabDanweijbxxDao taskBzkTabDanweijbxxDao;

    /**
     * 通过ID查询单条数据
     *
     * @param taskid 主键
     * @return 实例对象
     */
    @Override
    public TaskBzkTabDanweijbxx queryById(Long taskid) {
        return this.taskBzkTabDanweijbxxDao.queryById(taskid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TaskBzkTabDanweijbxx> queryAllByLimit(int offset, int limit) {
        return this.taskBzkTabDanweijbxxDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param taskBzkTabDanweijbxx 实例对象
     * @return 实例对象
     */
    @Override
    public TaskBzkTabDanweijbxx insert(TaskBzkTabDanweijbxx taskBzkTabDanweijbxx) {
        this.taskBzkTabDanweijbxxDao.insert(taskBzkTabDanweijbxx);
        return taskBzkTabDanweijbxx;
    }

    /**
     * 修改数据
     *
     * @param taskBzkTabDanweijbxx 实例对象
     * @return 实例对象
     */
    @Override
    public TaskBzkTabDanweijbxx update(TaskBzkTabDanweijbxx taskBzkTabDanweijbxx) {
        this.taskBzkTabDanweijbxxDao.update(taskBzkTabDanweijbxx);
        return this.queryById(taskBzkTabDanweijbxx.getTaskid());
    }

    /**
     * 通过主键删除数据
     *
     * @param taskid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long taskid) {
        return this.taskBzkTabDanweijbxxDao.deleteById(taskid) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.taskBzkTabDanweijbxxDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<TaskBzkTabDanweijbxx> page(PageForm<TaskBzkTabDanweijbxx> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<TaskBzkTabDanweijbxx> entityList = this.taskBzkTabDanweijbxxDao.queryPageTaskBzkTabDanweijbxxList(pq);
        Page<TaskBzkTabDanweijbxx> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}