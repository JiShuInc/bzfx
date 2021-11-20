package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkSlgxYfRyzfqk;
import com.cardinal.tech.bzfx.dao.BzkSlgxYfRyzfqkDao;
import com.cardinal.tech.bzfx.service.BzkSlgxYfRyzfqkService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 人员住房情况(BzkSlgxYfRyzfqk)表服务实现类
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
@RequiredArgsConstructor
@Service("bzkSlgxYfRyzfqkService")
public class BzkSlgxYfRyzfqkServiceImpl implements BzkSlgxYfRyzfqkService {

    private final BzkSlgxYfRyzfqkDao bzkSlgxYfRyzfqkDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkSlgxYfRyzfqk queryById(String id) {
        return this.bzkSlgxYfRyzfqkDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkSlgxYfRyzfqk> queryAllByLimit(int offset, int limit) {
        return this.bzkSlgxYfRyzfqkDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkSlgxYfRyzfqk 实例对象
     * @return 实例对象
     */
    @Override
    public BzkSlgxYfRyzfqk insert(BzkSlgxYfRyzfqk bzkSlgxYfRyzfqk) {
        this.bzkSlgxYfRyzfqkDao.insert(bzkSlgxYfRyzfqk);
        return bzkSlgxYfRyzfqk;
    }

    /**
     * 修改数据
     *
     * @param bzkSlgxYfRyzfqk 实例对象
     * @return 实例对象
     */
    @Override
    public BzkSlgxYfRyzfqk update(BzkSlgxYfRyzfqk bzkSlgxYfRyzfqk) {
        this.bzkSlgxYfRyzfqkDao.update(bzkSlgxYfRyzfqk);
        return this.queryById(bzkSlgxYfRyzfqk.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkSlgxYfRyzfqkDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkSlgxYfRyzfqkDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkSlgxYfRyzfqk> page(PageForm<BzkSlgxYfRyzfqk> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkSlgxYfRyzfqk> entityList = this.bzkSlgxYfRyzfqkDao.queryPageBzkSlgxYfRyzfqkList(pq);
        Page<BzkSlgxYfRyzfqk> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}