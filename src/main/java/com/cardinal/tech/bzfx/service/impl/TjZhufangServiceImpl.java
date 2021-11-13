package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.TjZhufang;
import com.cardinal.tech.bzfx.dao.TjZhufangDao;
import com.cardinal.tech.bzfx.service.TjZhufangService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 人员住房情况(TjZhufang)表服务实现类
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:38
 */
@RequiredArgsConstructor
@Service("tjZhufangService")
public class TjZhufangServiceImpl implements TjZhufangService {

    private final TjZhufangDao tjZhufangDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TjZhufang queryById(Long id) {
        return this.tjZhufangDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TjZhufang> queryAllByLimit(int offset, int limit) {
        return this.tjZhufangDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tjZhufang 实例对象
     * @return 实例对象
     */
    @Override
    public TjZhufang insert(TjZhufang tjZhufang) {
        this.tjZhufangDao.insert(tjZhufang);
        return tjZhufang;
    }

    /**
     * 修改数据
     *
     * @param tjZhufang 实例对象
     * @return 实例对象
     */
    @Override
    public TjZhufang update(TjZhufang tjZhufang) {
        this.tjZhufangDao.update(tjZhufang);
        return this.queryById(tjZhufang.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tjZhufangDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.tjZhufangDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<TjZhufang> page(PageForm<TjZhufang> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<TjZhufang> entityList = this.tjZhufangDao.queryPageTjZhufangList(pq);
        Page<TjZhufang> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}