package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabErleitgrylb;
import com.cardinal.tech.bzfx.dao.BzkBzTabErleitgrylbDao;
import com.cardinal.tech.bzfx.service.BzkBzTabErleitgrylbService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 二类特供人员类别(BzkBzTabErleitgrylb)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
@RequiredArgsConstructor
@Service("bzkBzTabErleitgrylbService")
public class BzkBzTabErleitgrylbServiceImpl implements BzkBzTabErleitgrylbService {

    private final BzkBzTabErleitgrylbDao bzkBzTabErleitgrylbDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabErleitgrylb queryById(String id) {
        return this.bzkBzTabErleitgrylbDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabErleitgrylb> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabErleitgrylbDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabErleitgrylb 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabErleitgrylb insert(BzkBzTabErleitgrylb bzkBzTabErleitgrylb) {
        this.bzkBzTabErleitgrylbDao.insert(bzkBzTabErleitgrylb);
        return bzkBzTabErleitgrylb;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabErleitgrylb 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabErleitgrylb update(BzkBzTabErleitgrylb bzkBzTabErleitgrylb) {
        this.bzkBzTabErleitgrylbDao.update(bzkBzTabErleitgrylb);
        return this.queryById(bzkBzTabErleitgrylb.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabErleitgrylbDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabErleitgrylbDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabErleitgrylb> page(PageForm<BzkBzTabErleitgrylb> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabErleitgrylb> entityList = this.bzkBzTabErleitgrylbDao.queryPageBzkBzTabErleitgrylbList(pq);
        Page<BzkBzTabErleitgrylb> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}