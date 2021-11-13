package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.SlSyncLogs;
import com.cardinal.tech.bzfx.dao.SlSyncLogsDao;
import com.cardinal.tech.bzfx.service.SlSyncLogsService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 数据同步日志(SlSyncLogs)表服务实现类
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:37
 */
@RequiredArgsConstructor
@Service("slSyncLogsService")
public class SlSyncLogsServiceImpl implements SlSyncLogsService {

    private final SlSyncLogsDao slSyncLogsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SlSyncLogs queryById(Long id) {
        return this.slSyncLogsDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SlSyncLogs> queryAllByLimit(int offset, int limit) {
        return this.slSyncLogsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param slSyncLogs 实例对象
     * @return 实例对象
     */
    @Override
    public SlSyncLogs insert(SlSyncLogs slSyncLogs) {
        this.slSyncLogsDao.insert(slSyncLogs);
        return slSyncLogs;
    }

    /**
     * 修改数据
     *
     * @param slSyncLogs 实例对象
     * @return 实例对象
     */
    @Override
    public SlSyncLogs update(SlSyncLogs slSyncLogs) {
        this.slSyncLogsDao.update(slSyncLogs);
        return this.queryById(slSyncLogs.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.slSyncLogsDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.slSyncLogsDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<SlSyncLogs> page(PageForm<SlSyncLogs> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<SlSyncLogs> entityList = this.slSyncLogsDao.queryPageSlSyncLogsList(pq);
        Page<SlSyncLogs> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}