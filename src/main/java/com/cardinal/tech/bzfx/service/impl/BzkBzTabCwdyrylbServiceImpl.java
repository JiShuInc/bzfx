package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabCwdyrylb;
import com.cardinal.tech.bzfx.dao.BzkBzTabCwdyrylbDao;
import com.cardinal.tech.bzfx.service.BzkBzTabCwdyrylbService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 财务待遇人员类别(BzkBzTabCwdyrylb)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
@RequiredArgsConstructor
@Service("bzkBzTabCwdyrylbService")
public class BzkBzTabCwdyrylbServiceImpl implements BzkBzTabCwdyrylbService {

    private final BzkBzTabCwdyrylbDao bzkBzTabCwdyrylbDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabCwdyrylb queryById(String id) {
        return this.bzkBzTabCwdyrylbDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabCwdyrylb> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabCwdyrylbDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabCwdyrylb 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabCwdyrylb insert(BzkBzTabCwdyrylb bzkBzTabCwdyrylb) {
        this.bzkBzTabCwdyrylbDao.insert(bzkBzTabCwdyrylb);
        return bzkBzTabCwdyrylb;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabCwdyrylb 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabCwdyrylb update(BzkBzTabCwdyrylb bzkBzTabCwdyrylb) {
        this.bzkBzTabCwdyrylbDao.update(bzkBzTabCwdyrylb);
        return this.queryById(bzkBzTabCwdyrylb.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabCwdyrylbDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabCwdyrylbDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabCwdyrylb> page(PageForm<BzkBzTabCwdyrylb> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabCwdyrylb> entityList = this.bzkBzTabCwdyrylbDao.queryPageBzkBzTabCwdyrylbList(pq);
        Page<BzkBzTabCwdyrylb> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}