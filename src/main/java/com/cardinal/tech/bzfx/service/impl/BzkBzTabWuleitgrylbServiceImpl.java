package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabWuleitgrylb;
import com.cardinal.tech.bzfx.dao.BzkBzTabWuleitgrylbDao;
import com.cardinal.tech.bzfx.service.BzkBzTabWuleitgrylbService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 五类特供人员类别(BzkBzTabWuleitgrylb)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@Service("bzkBzTabWuleitgrylbService")
public class BzkBzTabWuleitgrylbServiceImpl implements BzkBzTabWuleitgrylbService {

    private final BzkBzTabWuleitgrylbDao bzkBzTabWuleitgrylbDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabWuleitgrylb queryById(String id) {
        return this.bzkBzTabWuleitgrylbDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabWuleitgrylb> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabWuleitgrylbDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabWuleitgrylb 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabWuleitgrylb insert(BzkBzTabWuleitgrylb bzkBzTabWuleitgrylb) {
        this.bzkBzTabWuleitgrylbDao.insert(bzkBzTabWuleitgrylb);
        return bzkBzTabWuleitgrylb;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabWuleitgrylb 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabWuleitgrylb update(BzkBzTabWuleitgrylb bzkBzTabWuleitgrylb) {
        this.bzkBzTabWuleitgrylbDao.update(bzkBzTabWuleitgrylb);
        return this.queryById(bzkBzTabWuleitgrylb.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabWuleitgrylbDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabWuleitgrylbDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabWuleitgrylb> page(PageForm<BzkBzTabWuleitgrylb> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabWuleitgrylb> entityList = this.bzkBzTabWuleitgrylbDao.queryPageBzkBzTabWuleitgrylbList(pq);
        Page<BzkBzTabWuleitgrylb> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}