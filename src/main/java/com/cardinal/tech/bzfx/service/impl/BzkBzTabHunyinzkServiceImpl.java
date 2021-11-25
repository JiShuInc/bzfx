package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabHunyinzk;
import com.cardinal.tech.bzfx.dao.BzkBzTabHunyinzkDao;
import com.cardinal.tech.bzfx.service.BzkBzTabHunyinzkService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 婚姻状况(BzkBzTabHunyinzk)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@Service("bzkBzTabHunyinzkService")
public class BzkBzTabHunyinzkServiceImpl implements BzkBzTabHunyinzkService {

    private final BzkBzTabHunyinzkDao bzkBzTabHunyinzkDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabHunyinzk queryById(String id) {
        return this.bzkBzTabHunyinzkDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabHunyinzk> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabHunyinzkDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabHunyinzk 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabHunyinzk insert(BzkBzTabHunyinzk bzkBzTabHunyinzk) {
        this.bzkBzTabHunyinzkDao.insert(bzkBzTabHunyinzk);
        return bzkBzTabHunyinzk;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabHunyinzk 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabHunyinzk update(BzkBzTabHunyinzk bzkBzTabHunyinzk) {
        this.bzkBzTabHunyinzkDao.update(bzkBzTabHunyinzk);
        return this.queryById(bzkBzTabHunyinzk.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabHunyinzkDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabHunyinzkDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabHunyinzk> page(PageForm<BzkBzTabHunyinzk> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabHunyinzk> entityList = this.bzkBzTabHunyinzkDao.queryPageBzkBzTabHunyinzkList(pq);
        Page<BzkBzTabHunyinzk> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}