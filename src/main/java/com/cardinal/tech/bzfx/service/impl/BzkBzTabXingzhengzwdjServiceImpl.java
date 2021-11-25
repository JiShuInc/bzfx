package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabXingzhengzwdj;
import com.cardinal.tech.bzfx.dao.BzkBzTabXingzhengzwdjDao;
import com.cardinal.tech.bzfx.service.BzkBzTabXingzhengzwdjService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 行政职务等级(BzkBzTabXingzhengzwdj)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@Service("bzkBzTabXingzhengzwdjService")
public class BzkBzTabXingzhengzwdjServiceImpl implements BzkBzTabXingzhengzwdjService {

    private final BzkBzTabXingzhengzwdjDao bzkBzTabXingzhengzwdjDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabXingzhengzwdj queryById(String id) {
        return this.bzkBzTabXingzhengzwdjDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabXingzhengzwdj> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabXingzhengzwdjDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabXingzhengzwdj 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabXingzhengzwdj insert(BzkBzTabXingzhengzwdj bzkBzTabXingzhengzwdj) {
        this.bzkBzTabXingzhengzwdjDao.insert(bzkBzTabXingzhengzwdj);
        return bzkBzTabXingzhengzwdj;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabXingzhengzwdj 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabXingzhengzwdj update(BzkBzTabXingzhengzwdj bzkBzTabXingzhengzwdj) {
        this.bzkBzTabXingzhengzwdjDao.update(bzkBzTabXingzhengzwdj);
        return this.queryById(bzkBzTabXingzhengzwdj.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabXingzhengzwdjDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabXingzhengzwdjDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabXingzhengzwdj> page(PageForm<BzkBzTabXingzhengzwdj> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabXingzhengzwdj> entityList = this.bzkBzTabXingzhengzwdjDao.queryPageBzkBzTabXingzhengzwdjList(pq);
        Page<BzkBzTabXingzhengzwdj> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}