package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabZhuleibie;
import com.cardinal.tech.bzfx.dao.BzkBzTabZhuleibieDao;
import com.cardinal.tech.bzfx.service.BzkBzTabZhuleibieService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 主类别(BzkBzTabZhuleibie)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:59
 */
@RequiredArgsConstructor
@Service("bzkBzTabZhuleibieService")
public class BzkBzTabZhuleibieServiceImpl implements BzkBzTabZhuleibieService {

    private final BzkBzTabZhuleibieDao bzkBzTabZhuleibieDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabZhuleibie queryById(String id) {
        return this.bzkBzTabZhuleibieDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabZhuleibie> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabZhuleibieDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabZhuleibie 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabZhuleibie insert(BzkBzTabZhuleibie bzkBzTabZhuleibie) {
        this.bzkBzTabZhuleibieDao.insert(bzkBzTabZhuleibie);
        return bzkBzTabZhuleibie;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabZhuleibie 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabZhuleibie update(BzkBzTabZhuleibie bzkBzTabZhuleibie) {
        this.bzkBzTabZhuleibieDao.update(bzkBzTabZhuleibie);
        return this.queryById(bzkBzTabZhuleibie.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabZhuleibieDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabZhuleibieDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabZhuleibie> page(PageForm<BzkBzTabZhuleibie> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabZhuleibie> entityList = this.bzkBzTabZhuleibieDao.queryPageBzkBzTabZhuleibieList(pq);
        Page<BzkBzTabZhuleibie> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}