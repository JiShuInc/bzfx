package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.TjRenyuanxx;
import com.cardinal.tech.bzfx.dao.TjRenyuanxxDao;
import com.cardinal.tech.bzfx.service.TjRenyuanxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 人员表(TjRenyuanxx)表服务实现类
 *
 * @author cadinal.tech
 * @since 2021-11-13 01:33:38
 */
@RequiredArgsConstructor
@Service("tjRenyuanxxService")
public class TjRenyuanxxServiceImpl implements TjRenyuanxxService {

    private final TjRenyuanxxDao tjRenyuanxxDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TjRenyuanxx queryById(Long id) {
        return this.tjRenyuanxxDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TjRenyuanxx> queryAllByLimit(int offset, int limit) {
        return this.tjRenyuanxxDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tjRenyuanxx 实例对象
     * @return 实例对象
     */
    @Override
    public TjRenyuanxx insert(TjRenyuanxx tjRenyuanxx) {
        this.tjRenyuanxxDao.insert(tjRenyuanxx);
        return tjRenyuanxx;
    }

    /**
     * 修改数据
     *
     * @param tjRenyuanxx 实例对象
     * @return 实例对象
     */
    @Override
    public TjRenyuanxx update(TjRenyuanxx tjRenyuanxx) {
        this.tjRenyuanxxDao.update(tjRenyuanxx);
        return this.queryById(tjRenyuanxx.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tjRenyuanxxDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.tjRenyuanxxDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<TjRenyuanxx> page(PageForm<TjRenyuanxx> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<TjRenyuanxx> entityList = this.tjRenyuanxxDao.queryPageTjRenyuanxxList(pq);
        Page<TjRenyuanxx> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}