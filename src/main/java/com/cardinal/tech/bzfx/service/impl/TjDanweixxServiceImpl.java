package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.TjDanweixx;
import com.cardinal.tech.bzfx.dao.TjDanweixxDao;
import com.cardinal.tech.bzfx.service.TjDanweixxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 单位信息表(TjDanweixx)表服务实现类
 *
 * @author cadinal.tech
 * @since 2021-11-13 19:28:47
 */
@RequiredArgsConstructor
@Service("tjDanweixxService")
public class TjDanweixxServiceImpl implements TjDanweixxService {

    private final TjDanweixxDao tjDanweixxDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TjDanweixx queryById(Long id) {
        return this.tjDanweixxDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TjDanweixx> queryAllByLimit(int offset, int limit) {
        return this.tjDanweixxDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tjDanweixx 实例对象
     * @return 实例对象
     */
    @Override
    public TjDanweixx insert(TjDanweixx tjDanweixx) {
        this.tjDanweixxDao.insert(tjDanweixx);
        return tjDanweixx;
    }

    /**
     * 修改数据
     *
     * @param tjDanweixx 实例对象
     * @return 实例对象
     */
    @Override
    public TjDanweixx update(TjDanweixx tjDanweixx) {
        this.tjDanweixxDao.update(tjDanweixx);
        return this.queryById(tjDanweixx.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tjDanweixxDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.tjDanweixxDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<TjDanweixx> page(PageForm<TjDanweixx> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<TjDanweixx> entityList = this.tjDanweixxDao.queryPageTjDanweixxList(pq);
        Page<TjDanweixx> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}