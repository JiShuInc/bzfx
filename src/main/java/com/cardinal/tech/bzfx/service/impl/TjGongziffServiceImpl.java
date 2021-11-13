package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.TjGongziff;
import com.cardinal.tech.bzfx.dao.TjGongziffDao;
import com.cardinal.tech.bzfx.service.TjGongziffService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 工资发放表(TjGongziff)表服务实现类
 *
 * @author cadinal.tech
 * @since 2021-11-13 19:28:47
 */
@RequiredArgsConstructor
@Service("tjGongziffService")
public class TjGongziffServiceImpl implements TjGongziffService {

    private final TjGongziffDao tjGongziffDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TjGongziff queryById(Long id) {
        return this.tjGongziffDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TjGongziff> queryAllByLimit(int offset, int limit) {
        return this.tjGongziffDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tjGongziff 实例对象
     * @return 实例对象
     */
    @Override
    public TjGongziff insert(TjGongziff tjGongziff) {
        this.tjGongziffDao.insert(tjGongziff);
        return tjGongziff;
    }

    /**
     * 修改数据
     *
     * @param tjGongziff 实例对象
     * @return 实例对象
     */
    @Override
    public TjGongziff update(TjGongziff tjGongziff) {
        this.tjGongziffDao.update(tjGongziff);
        return this.queryById(tjGongziff.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tjGongziffDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.tjGongziffDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<TjGongziff> page(PageForm<TjGongziff> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<TjGongziff> entityList = this.tjGongziffDao.queryPageTjGongziffList(pq);
        Page<TjGongziff> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}