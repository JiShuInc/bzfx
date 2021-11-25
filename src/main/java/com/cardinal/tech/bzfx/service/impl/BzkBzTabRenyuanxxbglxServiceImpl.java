package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabRenyuanxxbglx;
import com.cardinal.tech.bzfx.dao.BzkBzTabRenyuanxxbglxDao;
import com.cardinal.tech.bzfx.service.BzkBzTabRenyuanxxbglxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 人员信息变更类型(BzkBzTabRenyuanxxbglx)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:57
 */
@RequiredArgsConstructor
@Service("bzkBzTabRenyuanxxbglxService")
public class BzkBzTabRenyuanxxbglxServiceImpl implements BzkBzTabRenyuanxxbglxService {

    private final BzkBzTabRenyuanxxbglxDao bzkBzTabRenyuanxxbglxDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabRenyuanxxbglx queryById(String id) {
        return this.bzkBzTabRenyuanxxbglxDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabRenyuanxxbglx> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabRenyuanxxbglxDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabRenyuanxxbglx 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabRenyuanxxbglx insert(BzkBzTabRenyuanxxbglx bzkBzTabRenyuanxxbglx) {
        this.bzkBzTabRenyuanxxbglxDao.insert(bzkBzTabRenyuanxxbglx);
        return bzkBzTabRenyuanxxbglx;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabRenyuanxxbglx 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabRenyuanxxbglx update(BzkBzTabRenyuanxxbglx bzkBzTabRenyuanxxbglx) {
        this.bzkBzTabRenyuanxxbglxDao.update(bzkBzTabRenyuanxxbglx);
        return this.queryById(bzkBzTabRenyuanxxbglx.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabRenyuanxxbglxDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabRenyuanxxbglxDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabRenyuanxxbglx> page(PageForm<BzkBzTabRenyuanxxbglx> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabRenyuanxxbglx> entityList = this.bzkBzTabRenyuanxxbglxDao.queryPageBzkBzTabRenyuanxxbglxList(pq);
        Page<BzkBzTabRenyuanxxbglx> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}