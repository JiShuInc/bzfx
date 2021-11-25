package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabScdj;
import com.cardinal.tech.bzfx.dao.BzkBzTabScdjDao;
import com.cardinal.tech.bzfx.service.BzkBzTabScdjService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 伤残等级(BzkBzTabScdj)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@Service("bzkBzTabScdjService")
public class BzkBzTabScdjServiceImpl implements BzkBzTabScdjService {

    private final BzkBzTabScdjDao bzkBzTabScdjDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabScdj queryById(String id) {
        return this.bzkBzTabScdjDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabScdj> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabScdjDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabScdj 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabScdj insert(BzkBzTabScdj bzkBzTabScdj) {
        this.bzkBzTabScdjDao.insert(bzkBzTabScdj);
        return bzkBzTabScdj;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabScdj 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabScdj update(BzkBzTabScdj bzkBzTabScdj) {
        this.bzkBzTabScdjDao.update(bzkBzTabScdj);
        return this.queryById(bzkBzTabScdj.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabScdjDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabScdjDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabScdj> page(PageForm<BzkBzTabScdj> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabScdj> entityList = this.bzkBzTabScdjDao.queryPageBzkBzTabScdjList(pq);
        Page<BzkBzTabScdj> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}