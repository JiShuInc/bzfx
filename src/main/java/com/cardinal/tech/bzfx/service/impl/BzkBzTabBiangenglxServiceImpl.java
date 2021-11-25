package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabBiangenglx;
import com.cardinal.tech.bzfx.dao.BzkBzTabBiangenglxDao;
import com.cardinal.tech.bzfx.service.BzkBzTabBiangenglxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 变更类型标准表(BzkBzTabBiangenglx)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:53
 */
@RequiredArgsConstructor
@Service("bzkBzTabBiangenglxService")
public class BzkBzTabBiangenglxServiceImpl implements BzkBzTabBiangenglxService {

    private final BzkBzTabBiangenglxDao bzkBzTabBiangenglxDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabBiangenglx queryById(String id) {
        return this.bzkBzTabBiangenglxDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabBiangenglx> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabBiangenglxDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabBiangenglx 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabBiangenglx insert(BzkBzTabBiangenglx bzkBzTabBiangenglx) {
        this.bzkBzTabBiangenglxDao.insert(bzkBzTabBiangenglx);
        return bzkBzTabBiangenglx;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabBiangenglx 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabBiangenglx update(BzkBzTabBiangenglx bzkBzTabBiangenglx) {
        this.bzkBzTabBiangenglxDao.update(bzkBzTabBiangenglx);
        return this.queryById(bzkBzTabBiangenglx.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabBiangenglxDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabBiangenglxDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabBiangenglx> page(PageForm<BzkBzTabBiangenglx> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabBiangenglx> entityList = this.bzkBzTabBiangenglxDao.queryPageBzkBzTabBiangenglxList(pq);
        Page<BzkBzTabBiangenglx> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}