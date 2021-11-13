package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.TjBeizhuangxx;
import com.cardinal.tech.bzfx.dao.TjBeizhuangxxDao;
import com.cardinal.tech.bzfx.service.TjBeizhuangxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 被装发放记录(TjBeizhuangxx)表服务实现类
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:38
 */
@RequiredArgsConstructor
@Service("tjBeizhuangxxService")
public class TjBeizhuangxxServiceImpl implements TjBeizhuangxxService {

    private final TjBeizhuangxxDao tjBeizhuangxxDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TjBeizhuangxx queryById(Long id) {
        return this.tjBeizhuangxxDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TjBeizhuangxx> queryAllByLimit(int offset, int limit) {
        return this.tjBeizhuangxxDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tjBeizhuangxx 实例对象
     * @return 实例对象
     */
    @Override
    public TjBeizhuangxx insert(TjBeizhuangxx tjBeizhuangxx) {
        this.tjBeizhuangxxDao.insert(tjBeizhuangxx);
        return tjBeizhuangxx;
    }

    /**
     * 修改数据
     *
     * @param tjBeizhuangxx 实例对象
     * @return 实例对象
     */
    @Override
    public TjBeizhuangxx update(TjBeizhuangxx tjBeizhuangxx) {
        this.tjBeizhuangxxDao.update(tjBeizhuangxx);
        return this.queryById(tjBeizhuangxx.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tjBeizhuangxxDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.tjBeizhuangxxDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<TjBeizhuangxx> page(PageForm<TjBeizhuangxx> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<TjBeizhuangxx> entityList = this.tjBeizhuangxxDao.queryPageTjBeizhuangxxList(pq);
        Page<TjBeizhuangxx> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}