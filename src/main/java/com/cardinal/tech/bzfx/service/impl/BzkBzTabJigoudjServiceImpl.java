package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabJigoudj;
import com.cardinal.tech.bzfx.dao.BzkBzTabJigoudjDao;
import com.cardinal.tech.bzfx.service.BzkBzTabJigoudjService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 机构等级(BzkBzTabJigoudj)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@Service("bzkBzTabJigoudjService")
public class BzkBzTabJigoudjServiceImpl implements BzkBzTabJigoudjService {

    private final BzkBzTabJigoudjDao bzkBzTabJigoudjDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabJigoudj queryById(String id) {
        return this.bzkBzTabJigoudjDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabJigoudj> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabJigoudjDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabJigoudj 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabJigoudj insert(BzkBzTabJigoudj bzkBzTabJigoudj) {
        this.bzkBzTabJigoudjDao.insert(bzkBzTabJigoudj);
        return bzkBzTabJigoudj;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabJigoudj 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabJigoudj update(BzkBzTabJigoudj bzkBzTabJigoudj) {
        this.bzkBzTabJigoudjDao.update(bzkBzTabJigoudj);
        return this.queryById(bzkBzTabJigoudj.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabJigoudjDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabJigoudjDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabJigoudj> page(PageForm<BzkBzTabJigoudj> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabJigoudj> entityList = this.bzkBzTabJigoudjDao.queryPageBzkBzTabJigoudjList(pq);
        Page<BzkBzTabJigoudj> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}