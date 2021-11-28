package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.TaskBzkTabBaozhangkjbxx;
import com.cardinal.tech.bzfx.dao.TaskBzkTabBaozhangkjbxxDao;
import com.cardinal.tech.bzfx.service.TaskBzkTabBaozhangkjbxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 保障卡基本信息(TaskBzkTabBaozhangkjbxx)表服务实现类
 *
 * @author makejava
 * @since 2021-11-28 12:40:57
 */
@RequiredArgsConstructor
@Service("taskBzkTabBaozhangkjbxxService")
public class TaskBzkTabBaozhangkjbxxServiceImpl implements TaskBzkTabBaozhangkjbxxService {

    private final TaskBzkTabBaozhangkjbxxDao taskBzkTabBaozhangkjbxxDao;

    /**
     * 通过ID查询单条数据
     *
     * @param taskid 主键
     * @return 实例对象
     */
    @Override
    public TaskBzkTabBaozhangkjbxx queryById(Long taskid) {
        return this.taskBzkTabBaozhangkjbxxDao.queryById(taskid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TaskBzkTabBaozhangkjbxx> queryAllByLimit(int offset, int limit) {
        return this.taskBzkTabBaozhangkjbxxDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param taskBzkTabBaozhangkjbxx 实例对象
     * @return 实例对象
     */
    @Override
    public TaskBzkTabBaozhangkjbxx insert(TaskBzkTabBaozhangkjbxx taskBzkTabBaozhangkjbxx) {
        this.taskBzkTabBaozhangkjbxxDao.insert(taskBzkTabBaozhangkjbxx);
        return taskBzkTabBaozhangkjbxx;
    }

    /**
     * 修改数据
     *
     * @param taskBzkTabBaozhangkjbxx 实例对象
     * @return 实例对象
     */
    @Override
    public TaskBzkTabBaozhangkjbxx update(TaskBzkTabBaozhangkjbxx taskBzkTabBaozhangkjbxx) {
        this.taskBzkTabBaozhangkjbxxDao.update(taskBzkTabBaozhangkjbxx);
        return this.queryById(taskBzkTabBaozhangkjbxx.getTaskid());
    }

    /**
     * 通过主键删除数据
     *
     * @param taskid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long taskid) {
        return this.taskBzkTabBaozhangkjbxxDao.deleteById(taskid) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.taskBzkTabBaozhangkjbxxDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<TaskBzkTabBaozhangkjbxx> page(PageForm<TaskBzkTabBaozhangkjbxx> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<TaskBzkTabBaozhangkjbxx> entityList = this.taskBzkTabBaozhangkjbxxDao.queryPageTaskBzkTabBaozhangkjbxxList(pq);
        Page<TaskBzkTabBaozhangkjbxx> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}