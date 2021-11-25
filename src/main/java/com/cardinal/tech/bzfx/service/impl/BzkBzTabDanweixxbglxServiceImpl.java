package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabDanweixxbglx;
import com.cardinal.tech.bzfx.dao.BzkBzTabDanweixxbglxDao;
import com.cardinal.tech.bzfx.service.BzkBzTabDanweixxbglxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 单位信息变更类型(BzkBzTabDanweixxbglx)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
@RequiredArgsConstructor
@Service("bzkBzTabDanweixxbglxService")
public class BzkBzTabDanweixxbglxServiceImpl implements BzkBzTabDanweixxbglxService {

    private final BzkBzTabDanweixxbglxDao bzkBzTabDanweixxbglxDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabDanweixxbglx queryById(String id) {
        return this.bzkBzTabDanweixxbglxDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabDanweixxbglx> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabDanweixxbglxDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabDanweixxbglx 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabDanweixxbglx insert(BzkBzTabDanweixxbglx bzkBzTabDanweixxbglx) {
        this.bzkBzTabDanweixxbglxDao.insert(bzkBzTabDanweixxbglx);
        return bzkBzTabDanweixxbglx;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabDanweixxbglx 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabDanweixxbglx update(BzkBzTabDanweixxbglx bzkBzTabDanweixxbglx) {
        this.bzkBzTabDanweixxbglxDao.update(bzkBzTabDanweixxbglx);
        return this.queryById(bzkBzTabDanweixxbglx.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabDanweixxbglxDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabDanweixxbglxDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabDanweixxbglx> page(PageForm<BzkBzTabDanweixxbglx> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabDanweixxbglx> entityList = this.bzkBzTabDanweixxbglxDao.queryPageBzkBzTabDanweixxbglxList(pq);
        Page<BzkBzTabDanweixxbglx> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}