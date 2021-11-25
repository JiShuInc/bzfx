package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabZhigongsf;
import com.cardinal.tech.bzfx.dao.BzkBzTabZhigongsfDao;
import com.cardinal.tech.bzfx.service.BzkBzTabZhigongsfService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 职工身份类别(BzkBzTabZhigongsf)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@Service("bzkBzTabZhigongsfService")
public class BzkBzTabZhigongsfServiceImpl implements BzkBzTabZhigongsfService {

    private final BzkBzTabZhigongsfDao bzkBzTabZhigongsfDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabZhigongsf queryById(String id) {
        return this.bzkBzTabZhigongsfDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabZhigongsf> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabZhigongsfDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabZhigongsf 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabZhigongsf insert(BzkBzTabZhigongsf bzkBzTabZhigongsf) {
        this.bzkBzTabZhigongsfDao.insert(bzkBzTabZhigongsf);
        return bzkBzTabZhigongsf;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabZhigongsf 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabZhigongsf update(BzkBzTabZhigongsf bzkBzTabZhigongsf) {
        this.bzkBzTabZhigongsfDao.update(bzkBzTabZhigongsf);
        return this.queryById(bzkBzTabZhigongsf.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabZhigongsfDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabZhigongsfDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabZhigongsf> page(PageForm<BzkBzTabZhigongsf> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabZhigongsf> entityList = this.bzkBzTabZhigongsfDao.queryPageBzkBzTabZhigongsfList(pq);
        Page<BzkBzTabZhigongsf> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}