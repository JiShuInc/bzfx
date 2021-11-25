package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabJiguanfdb;
import com.cardinal.tech.bzfx.dao.BzkBzTabJiguanfdbDao;
import com.cardinal.tech.bzfx.service.BzkBzTabJiguanfdbService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 机关分队标识(BzkBzTabJiguanfdb)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@Service("bzkBzTabJiguanfdbService")
public class BzkBzTabJiguanfdbServiceImpl implements BzkBzTabJiguanfdbService {

    private final BzkBzTabJiguanfdbDao bzkBzTabJiguanfdbDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabJiguanfdb queryById(String id) {
        return this.bzkBzTabJiguanfdbDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabJiguanfdb> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabJiguanfdbDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabJiguanfdb 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabJiguanfdb insert(BzkBzTabJiguanfdb bzkBzTabJiguanfdb) {
        this.bzkBzTabJiguanfdbDao.insert(bzkBzTabJiguanfdb);
        return bzkBzTabJiguanfdb;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabJiguanfdb 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabJiguanfdb update(BzkBzTabJiguanfdb bzkBzTabJiguanfdb) {
        this.bzkBzTabJiguanfdbDao.update(bzkBzTabJiguanfdb);
        return this.queryById(bzkBzTabJiguanfdb.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabJiguanfdbDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabJiguanfdbDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabJiguanfdb> page(PageForm<BzkBzTabJiguanfdb> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabJiguanfdb> entityList = this.bzkBzTabJiguanfdbDao.queryPageBzkBzTabJiguanfdbList(pq);
        Page<BzkBzTabJiguanfdb> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}