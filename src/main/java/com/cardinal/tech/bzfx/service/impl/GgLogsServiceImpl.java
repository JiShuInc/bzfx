package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.GgLogs;
import com.cardinal.tech.bzfx.dao.GgLogsDao;
import com.cardinal.tech.bzfx.service.GgLogsService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 日志(GgLogs)表服务实现类
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:37
 */
@RequiredArgsConstructor
@Service("ggLogsService")
public class GgLogsServiceImpl implements GgLogsService {

    private final GgLogsDao ggLogsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public GgLogs queryById(Long id) {
        return this.ggLogsDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<GgLogs> queryAllByLimit(int offset, int limit) {
        return this.ggLogsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ggLogs 实例对象
     * @return 实例对象
     */
    @Override
    public GgLogs insert(GgLogs ggLogs) {
        this.ggLogsDao.insert(ggLogs);
        return ggLogs;
    }

    /**
     * 修改数据
     *
     * @param ggLogs 实例对象
     * @return 实例对象
     */
    @Override
    public GgLogs update(GgLogs ggLogs) {
        this.ggLogsDao.update(ggLogs);
        return this.queryById(ggLogs.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.ggLogsDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.ggLogsDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<GgLogs> page(PageForm<GgLogs> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<GgLogs> entityList = this.ggLogsDao.queryPageGgLogsList(pq);
        Page<GgLogs> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}