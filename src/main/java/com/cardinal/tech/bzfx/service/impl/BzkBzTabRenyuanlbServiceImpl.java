package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabRenyuanlb;
import com.cardinal.tech.bzfx.dao.BzkBzTabRenyuanlbDao;
import com.cardinal.tech.bzfx.service.BzkBzTabRenyuanlbService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 人员类别(BzkBzTabRenyuanlb)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:57
 */
@RequiredArgsConstructor
@Service("bzkBzTabRenyuanlbService")
public class BzkBzTabRenyuanlbServiceImpl implements BzkBzTabRenyuanlbService {

    private final BzkBzTabRenyuanlbDao bzkBzTabRenyuanlbDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabRenyuanlb queryById(String id) {
        return this.bzkBzTabRenyuanlbDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabRenyuanlb> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabRenyuanlbDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabRenyuanlb 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabRenyuanlb insert(BzkBzTabRenyuanlb bzkBzTabRenyuanlb) {
        this.bzkBzTabRenyuanlbDao.insert(bzkBzTabRenyuanlb);
        return bzkBzTabRenyuanlb;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabRenyuanlb 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabRenyuanlb update(BzkBzTabRenyuanlb bzkBzTabRenyuanlb) {
        this.bzkBzTabRenyuanlbDao.update(bzkBzTabRenyuanlb);
        return this.queryById(bzkBzTabRenyuanlb.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabRenyuanlbDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabRenyuanlbDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabRenyuanlb> page(PageForm<BzkBzTabRenyuanlb> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabRenyuanlb> entityList = this.bzkBzTabRenyuanlbDao.queryPageBzkBzTabRenyuanlbList(pq);
        Page<BzkBzTabRenyuanlb> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}