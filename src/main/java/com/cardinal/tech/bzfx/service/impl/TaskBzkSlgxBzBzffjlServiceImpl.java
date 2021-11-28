package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.TaskBzkSlgxBzBzffjl;
import com.cardinal.tech.bzfx.dao.TaskBzkSlgxBzBzffjlDao;
import com.cardinal.tech.bzfx.service.TaskBzkSlgxBzBzffjlService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 被装发放记录(TaskBzkSlgxBzBzffjl)表服务实现类
 *
 * @author makejava
 * @since 2021-11-28 12:40:57
 */
@RequiredArgsConstructor
@Service("taskBzkSlgxBzBzffjlService")
public class TaskBzkSlgxBzBzffjlServiceImpl implements TaskBzkSlgxBzBzffjlService {

    private final TaskBzkSlgxBzBzffjlDao taskBzkSlgxBzBzffjlDao;

    /**
     * 通过ID查询单条数据
     *
     * @param taskid 主键
     * @return 实例对象
     */
    @Override
    public TaskBzkSlgxBzBzffjl queryById(Long taskid) {
        return this.taskBzkSlgxBzBzffjlDao.queryById(taskid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TaskBzkSlgxBzBzffjl> queryAllByLimit(int offset, int limit) {
        return this.taskBzkSlgxBzBzffjlDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param taskBzkSlgxBzBzffjl 实例对象
     * @return 实例对象
     */
    @Override
    public TaskBzkSlgxBzBzffjl insert(TaskBzkSlgxBzBzffjl taskBzkSlgxBzBzffjl) {
        this.taskBzkSlgxBzBzffjlDao.insert(taskBzkSlgxBzBzffjl);
        return taskBzkSlgxBzBzffjl;
    }

    /**
     * 修改数据
     *
     * @param taskBzkSlgxBzBzffjl 实例对象
     * @return 实例对象
     */
    @Override
    public TaskBzkSlgxBzBzffjl update(TaskBzkSlgxBzBzffjl taskBzkSlgxBzBzffjl) {
        this.taskBzkSlgxBzBzffjlDao.update(taskBzkSlgxBzBzffjl);
        return this.queryById(taskBzkSlgxBzBzffjl.getTaskid());
    }

    /**
     * 通过主键删除数据
     *
     * @param taskid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long taskid) {
        return this.taskBzkSlgxBzBzffjlDao.deleteById(taskid) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.taskBzkSlgxBzBzffjlDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<TaskBzkSlgxBzBzffjl> page(PageForm<TaskBzkSlgxBzBzffjl> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<TaskBzkSlgxBzBzffjl> entityList = this.taskBzkSlgxBzBzffjlDao.queryPageTaskBzkSlgxBzBzffjlList(pq);
        Page<TaskBzkSlgxBzBzffjl> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}