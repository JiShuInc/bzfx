package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabBukalx;
import com.cardinal.tech.bzfx.dao.BzkBzTabBukalxDao;
import com.cardinal.tech.bzfx.service.BzkBzTabBukalxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 补卡类型(BzkBzTabBukalx)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:53
 */
@RequiredArgsConstructor
@Service("bzkBzTabBukalxService")
public class BzkBzTabBukalxServiceImpl implements BzkBzTabBukalxService {

    private final BzkBzTabBukalxDao bzkBzTabBukalxDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabBukalx queryById(String id) {
        return this.bzkBzTabBukalxDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabBukalx> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabBukalxDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabBukalx 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabBukalx insert(BzkBzTabBukalx bzkBzTabBukalx) {
        this.bzkBzTabBukalxDao.insert(bzkBzTabBukalx);
        return bzkBzTabBukalx;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabBukalx 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabBukalx update(BzkBzTabBukalx bzkBzTabBukalx) {
        this.bzkBzTabBukalxDao.update(bzkBzTabBukalx);
        return this.queryById(bzkBzTabBukalx.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabBukalxDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabBukalxDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabBukalx> page(PageForm<BzkBzTabBukalx> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabBukalx> entityList = this.bzkBzTabBukalxDao.queryPageBzkBzTabBukalxList(pq);
        Page<BzkBzTabBukalx> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}