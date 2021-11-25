package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabXingbie;
import com.cardinal.tech.bzfx.dao.BzkBzTabXingbieDao;
import com.cardinal.tech.bzfx.service.BzkBzTabXingbieService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 性别(BzkBzTabXingbie)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@Service("bzkBzTabXingbieService")
public class BzkBzTabXingbieServiceImpl implements BzkBzTabXingbieService {

    private final BzkBzTabXingbieDao bzkBzTabXingbieDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabXingbie queryById(String id) {
        return this.bzkBzTabXingbieDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabXingbie> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabXingbieDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabXingbie 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabXingbie insert(BzkBzTabXingbie bzkBzTabXingbie) {
        this.bzkBzTabXingbieDao.insert(bzkBzTabXingbie);
        return bzkBzTabXingbie;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabXingbie 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabXingbie update(BzkBzTabXingbie bzkBzTabXingbie) {
        this.bzkBzTabXingbieDao.update(bzkBzTabXingbie);
        return this.queryById(bzkBzTabXingbie.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabXingbieDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabXingbieDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabXingbie> page(PageForm<BzkBzTabXingbie> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabXingbie> entityList = this.bzkBzTabXingbieDao.queryPageBzkBzTabXingbieList(pq);
        Page<BzkBzTabXingbie> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}