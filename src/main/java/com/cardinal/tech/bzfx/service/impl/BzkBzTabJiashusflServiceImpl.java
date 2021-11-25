package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabJiashusfl;
import com.cardinal.tech.bzfx.dao.BzkBzTabJiashusflDao;
import com.cardinal.tech.bzfx.service.BzkBzTabJiashusflService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 家属身份类别(BzkBzTabJiashusfl)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@Service("bzkBzTabJiashusflService")
public class BzkBzTabJiashusflServiceImpl implements BzkBzTabJiashusflService {

    private final BzkBzTabJiashusflDao bzkBzTabJiashusflDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabJiashusfl queryById(String id) {
        return this.bzkBzTabJiashusflDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabJiashusfl> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabJiashusflDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabJiashusfl 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabJiashusfl insert(BzkBzTabJiashusfl bzkBzTabJiashusfl) {
        this.bzkBzTabJiashusflDao.insert(bzkBzTabJiashusfl);
        return bzkBzTabJiashusfl;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabJiashusfl 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabJiashusfl update(BzkBzTabJiashusfl bzkBzTabJiashusfl) {
        this.bzkBzTabJiashusflDao.update(bzkBzTabJiashusfl);
        return this.queryById(bzkBzTabJiashusfl.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabJiashusflDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabJiashusflDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabJiashusfl> page(PageForm<BzkBzTabJiashusfl> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabJiashusfl> entityList = this.bzkBzTabJiashusflDao.queryPageBzkBzTabJiashusflList(pq);
        Page<BzkBzTabJiashusfl> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}