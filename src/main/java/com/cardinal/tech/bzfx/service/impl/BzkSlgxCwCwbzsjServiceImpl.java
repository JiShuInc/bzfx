package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkSlgxCwCwbzsj;
import com.cardinal.tech.bzfx.dao.BzkSlgxCwCwbzsjDao;
import com.cardinal.tech.bzfx.service.BzkSlgxCwCwbzsjService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 财务保障数据(BzkSlgxCwCwbzsj)表服务实现类
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
@RequiredArgsConstructor
@Service("bzkSlgxCwCwbzsjService")
public class BzkSlgxCwCwbzsjServiceImpl implements BzkSlgxCwCwbzsjService {

    private final BzkSlgxCwCwbzsjDao bzkSlgxCwCwbzsjDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkSlgxCwCwbzsj queryById(String id) {
        return this.bzkSlgxCwCwbzsjDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkSlgxCwCwbzsj> queryAllByLimit(int offset, int limit) {
        return this.bzkSlgxCwCwbzsjDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkSlgxCwCwbzsj 实例对象
     * @return 实例对象
     */
    @Override
    public BzkSlgxCwCwbzsj insert(BzkSlgxCwCwbzsj bzkSlgxCwCwbzsj) {
        this.bzkSlgxCwCwbzsjDao.insert(bzkSlgxCwCwbzsj);
        return bzkSlgxCwCwbzsj;
    }

    /**
     * 修改数据
     *
     * @param bzkSlgxCwCwbzsj 实例对象
     * @return 实例对象
     */
    @Override
    public BzkSlgxCwCwbzsj update(BzkSlgxCwCwbzsj bzkSlgxCwCwbzsj) {
        this.bzkSlgxCwCwbzsjDao.update(bzkSlgxCwCwbzsj);
        return this.queryById(bzkSlgxCwCwbzsj.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkSlgxCwCwbzsjDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkSlgxCwCwbzsjDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkSlgxCwCwbzsj> page(PageForm<BzkSlgxCwCwbzsj> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkSlgxCwCwbzsj> entityList = this.bzkSlgxCwCwbzsjDao.queryPageBzkSlgxCwCwbzsjList(pq);
        Page<BzkSlgxCwCwbzsj> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}