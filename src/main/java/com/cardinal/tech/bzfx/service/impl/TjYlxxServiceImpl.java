package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.TjYlxx;
import com.cardinal.tech.bzfx.dao.TjYlxxDao;
import com.cardinal.tech.bzfx.service.TjYlxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 医疗信息(TjYlxx)表服务实现类
 *
 * @author cadinal.tech
 * @since 2021-11-13 19:28:47
 */
@RequiredArgsConstructor
@Service("tjYlxxService")
public class TjYlxxServiceImpl implements TjYlxxService {

    private final TjYlxxDao tjYlxxDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TjYlxx queryById(Long id) {
        return this.tjYlxxDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TjYlxx> queryAllByLimit(int offset, int limit) {
        return this.tjYlxxDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tjYlxx 实例对象
     * @return 实例对象
     */
    @Override
    public TjYlxx insert(TjYlxx tjYlxx) {
        this.tjYlxxDao.insert(tjYlxx);
        return tjYlxx;
    }

    /**
     * 修改数据
     *
     * @param tjYlxx 实例对象
     * @return 实例对象
     */
    @Override
    public TjYlxx update(TjYlxx tjYlxx) {
        this.tjYlxxDao.update(tjYlxx);
        return this.queryById(tjYlxx.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tjYlxxDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.tjYlxxDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<TjYlxx> page(PageForm<TjYlxx> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<TjYlxx> entityList = this.tjYlxxDao.queryPageTjYlxxList(pq);
        Page<TjYlxx> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}