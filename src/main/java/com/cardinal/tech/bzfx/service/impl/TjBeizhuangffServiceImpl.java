package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.TjBeizhuangff;
import com.cardinal.tech.bzfx.dao.TjBeizhuangffDao;
import com.cardinal.tech.bzfx.service.TjBeizhuangffService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 被装发放记录(TjBeizhuangff)表服务实现类
 *
 * @author cadinal.tech
 * @since 2021-11-13 19:28:47
 */
@RequiredArgsConstructor
@Service("tjBeizhuangffService")
public class TjBeizhuangffServiceImpl implements TjBeizhuangffService {

    private final TjBeizhuangffDao tjBeizhuangffDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TjBeizhuangff queryById(Long id) {
        return this.tjBeizhuangffDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TjBeizhuangff> queryAllByLimit(int offset, int limit) {
        return this.tjBeizhuangffDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tjBeizhuangff 实例对象
     * @return 实例对象
     */
    @Override
    public TjBeizhuangff insert(TjBeizhuangff tjBeizhuangff) {
        this.tjBeizhuangffDao.insert(tjBeizhuangff);
        return tjBeizhuangff;
    }

    /**
     * 修改数据
     *
     * @param tjBeizhuangff 实例对象
     * @return 实例对象
     */
    @Override
    public TjBeizhuangff update(TjBeizhuangff tjBeizhuangff) {
        this.tjBeizhuangffDao.update(tjBeizhuangff);
        return this.queryById(tjBeizhuangff.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tjBeizhuangffDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.tjBeizhuangffDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<TjBeizhuangff> page(PageForm<TjBeizhuangff> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<TjBeizhuangff> entityList = this.tjBeizhuangffDao.queryPageTjBeizhuangffList(pq);
        Page<TjBeizhuangff> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}