package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabZnzk;
import com.cardinal.tech.bzfx.dao.BzkBzTabZnzkDao;
import com.cardinal.tech.bzfx.service.BzkBzTabZnzkService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 子女状况(BzkBzTabZnzk)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:59
 */
@RequiredArgsConstructor
@Service("bzkBzTabZnzkService")
public class BzkBzTabZnzkServiceImpl implements BzkBzTabZnzkService {

    private final BzkBzTabZnzkDao bzkBzTabZnzkDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabZnzk queryById(String id) {
        return this.bzkBzTabZnzkDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabZnzk> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabZnzkDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabZnzk 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabZnzk insert(BzkBzTabZnzk bzkBzTabZnzk) {
        this.bzkBzTabZnzkDao.insert(bzkBzTabZnzk);
        return bzkBzTabZnzk;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabZnzk 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabZnzk update(BzkBzTabZnzk bzkBzTabZnzk) {
        this.bzkBzTabZnzkDao.update(bzkBzTabZnzk);
        return this.queryById(bzkBzTabZnzk.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabZnzkDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabZnzkDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabZnzk> page(PageForm<BzkBzTabZnzk> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabZnzk> entityList = this.bzkBzTabZnzkDao.queryPageBzkBzTabZnzkList(pq);
        Page<BzkBzTabZnzk> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}