package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabDimingOld;
import com.cardinal.tech.bzfx.dao.BzkBzTabDimingOldDao;
import com.cardinal.tech.bzfx.service.BzkBzTabDimingOldService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (BzkBzTabDimingOld)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
@RequiredArgsConstructor
@Service("bzkBzTabDimingOldService")
public class BzkBzTabDimingOldServiceImpl implements BzkBzTabDimingOldService {

    private final BzkBzTabDimingOldDao bzkBzTabDimingOldDao;

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabDimingOld queryById( ) {
        return this.bzkBzTabDimingOldDao.queryById();
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabDimingOld> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabDimingOldDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabDimingOld 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabDimingOld insert(BzkBzTabDimingOld bzkBzTabDimingOld) {
        this.bzkBzTabDimingOldDao.insert(bzkBzTabDimingOld);
        return bzkBzTabDimingOld;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabDimingOld 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabDimingOld update(BzkBzTabDimingOld bzkBzTabDimingOld) {
        this.bzkBzTabDimingOldDao.update(bzkBzTabDimingOld);
        return this.queryById(bzkBzTabDimingOld.get());
    }

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById( ) {
        return this.bzkBzTabDimingOldDao.deleteById() > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabDimingOldDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabDimingOld> page(PageForm<BzkBzTabDimingOld> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabDimingOld> entityList = this.bzkBzTabDimingOldDao.queryPageBzkBzTabDimingOldList(pq);
        Page<BzkBzTabDimingOld> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}