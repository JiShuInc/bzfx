package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.TaskBzkTabDanweibclrxx;
import com.cardinal.tech.bzfx.dao.TaskBzkTabDanweibclrxxDao;
import com.cardinal.tech.bzfx.service.TaskBzkTabDanweibclrxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 单位补充录入信息(TaskBzkTabDanweibclrxx)表服务实现类
 *
 * @author makejava
 * @since 2021-11-28 12:40:57
 */
@RequiredArgsConstructor
@Service("taskBzkTabDanweibclrxxService")
public class TaskBzkTabDanweibclrxxServiceImpl implements TaskBzkTabDanweibclrxxService {

    private final TaskBzkTabDanweibclrxxDao taskBzkTabDanweibclrxxDao;

    /**
     * 通过ID查询单条数据
     *
     * @param taskid 主键
     * @return 实例对象
     */
    @Override
    public TaskBzkTabDanweibclrxx queryById(Long taskid) {
        return this.taskBzkTabDanweibclrxxDao.queryById(taskid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TaskBzkTabDanweibclrxx> queryAllByLimit(int offset, int limit) {
        return this.taskBzkTabDanweibclrxxDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param taskBzkTabDanweibclrxx 实例对象
     * @return 实例对象
     */
    @Override
    public TaskBzkTabDanweibclrxx insert(TaskBzkTabDanweibclrxx taskBzkTabDanweibclrxx) {
        this.taskBzkTabDanweibclrxxDao.insert(taskBzkTabDanweibclrxx);
        return taskBzkTabDanweibclrxx;
    }

    /**
     * 修改数据
     *
     * @param taskBzkTabDanweibclrxx 实例对象
     * @return 实例对象
     */
    @Override
    public TaskBzkTabDanweibclrxx update(TaskBzkTabDanweibclrxx taskBzkTabDanweibclrxx) {
        this.taskBzkTabDanweibclrxxDao.update(taskBzkTabDanweibclrxx);
        return this.queryById(taskBzkTabDanweibclrxx.getTaskid());
    }

    /**
     * 通过主键删除数据
     *
     * @param taskid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long taskid) {
        return this.taskBzkTabDanweibclrxxDao.deleteById(taskid) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.taskBzkTabDanweibclrxxDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<TaskBzkTabDanweibclrxx> page(PageForm<TaskBzkTabDanweibclrxx> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<TaskBzkTabDanweibclrxx> entityList = this.taskBzkTabDanweibclrxxDao.queryPageTaskBzkTabDanweibclrxxList(pq);
        Page<TaskBzkTabDanweibclrxx> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}