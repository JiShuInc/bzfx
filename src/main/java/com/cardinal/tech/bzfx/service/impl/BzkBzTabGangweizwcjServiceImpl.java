package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabGangweizwcj;
import com.cardinal.tech.bzfx.dao.BzkBzTabGangweizwcjDao;
import com.cardinal.tech.bzfx.service.BzkBzTabGangweizwcjService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 岗位职务层级标准编码(BzkBzTabGangweizwcj)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
@RequiredArgsConstructor
@Service("bzkBzTabGangweizwcjService")
public class BzkBzTabGangweizwcjServiceImpl implements BzkBzTabGangweizwcjService {

    private final BzkBzTabGangweizwcjDao bzkBzTabGangweizwcjDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabGangweizwcj queryById(String id) {
        return this.bzkBzTabGangweizwcjDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabGangweizwcj> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabGangweizwcjDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabGangweizwcj 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabGangweizwcj insert(BzkBzTabGangweizwcj bzkBzTabGangweizwcj) {
        this.bzkBzTabGangweizwcjDao.insert(bzkBzTabGangweizwcj);
        return bzkBzTabGangweizwcj;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabGangweizwcj 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabGangweizwcj update(BzkBzTabGangweizwcj bzkBzTabGangweizwcj) {
        this.bzkBzTabGangweizwcjDao.update(bzkBzTabGangweizwcj);
        return this.queryById(bzkBzTabGangweizwcj.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabGangweizwcjDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabGangweizwcjDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabGangweizwcj> page(PageForm<BzkBzTabGangweizwcj> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabGangweizwcj> entityList = this.bzkBzTabGangweizwcjDao.queryPageBzkBzTabGangweizwcjList(pq);
        Page<BzkBzTabGangweizwcj> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}