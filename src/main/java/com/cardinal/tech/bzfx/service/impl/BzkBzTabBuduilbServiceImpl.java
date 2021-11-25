package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabBuduilb;
import com.cardinal.tech.bzfx.dao.BzkBzTabBuduilbDao;
import com.cardinal.tech.bzfx.service.BzkBzTabBuduilbService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 部队类别(BzkBzTabBuduilb)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:53
 */
@RequiredArgsConstructor
@Service("bzkBzTabBuduilbService")
public class BzkBzTabBuduilbServiceImpl implements BzkBzTabBuduilbService {

    private final BzkBzTabBuduilbDao bzkBzTabBuduilbDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabBuduilb queryById(String id) {
        return this.bzkBzTabBuduilbDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabBuduilb> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabBuduilbDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabBuduilb 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabBuduilb insert(BzkBzTabBuduilb bzkBzTabBuduilb) {
        this.bzkBzTabBuduilbDao.insert(bzkBzTabBuduilb);
        return bzkBzTabBuduilb;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabBuduilb 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabBuduilb update(BzkBzTabBuduilb bzkBzTabBuduilb) {
        this.bzkBzTabBuduilbDao.update(bzkBzTabBuduilb);
        return this.queryById(bzkBzTabBuduilb.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabBuduilbDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabBuduilbDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabBuduilb> page(PageForm<BzkBzTabBuduilb> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabBuduilb> entityList = this.bzkBzTabBuduilbDao.queryPageBzkBzTabBuduilbList(pq);
        Page<BzkBzTabBuduilb> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}