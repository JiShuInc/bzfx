package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabGangweilb;
import com.cardinal.tech.bzfx.dao.BzkBzTabGangweilbDao;
import com.cardinal.tech.bzfx.service.BzkBzTabGangweilbService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 岗位类别(BzkBzTabGangweilb)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
@RequiredArgsConstructor
@Service("bzkBzTabGangweilbService")
public class BzkBzTabGangweilbServiceImpl implements BzkBzTabGangweilbService {

    private final BzkBzTabGangweilbDao bzkBzTabGangweilbDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabGangweilb queryById(String id) {
        return this.bzkBzTabGangweilbDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabGangweilb> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabGangweilbDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabGangweilb 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabGangweilb insert(BzkBzTabGangweilb bzkBzTabGangweilb) {
        this.bzkBzTabGangweilbDao.insert(bzkBzTabGangweilb);
        return bzkBzTabGangweilb;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabGangweilb 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabGangweilb update(BzkBzTabGangweilb bzkBzTabGangweilb) {
        this.bzkBzTabGangweilbDao.update(bzkBzTabGangweilb);
        return this.queryById(bzkBzTabGangweilb.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabGangweilbDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabGangweilbDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabGangweilb> page(PageForm<BzkBzTabGangweilb> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabGangweilb> entityList = this.bzkBzTabGangweilbDao.queryPageBzkBzTabGangweilbList(pq);
        Page<BzkBzTabGangweilb> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}