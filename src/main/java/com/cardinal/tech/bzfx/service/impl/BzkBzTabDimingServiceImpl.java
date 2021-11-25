package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabDiming;
import com.cardinal.tech.bzfx.dao.BzkBzTabDimingDao;
import com.cardinal.tech.bzfx.service.BzkBzTabDimingService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 地名(BzkBzTabDiming)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
@RequiredArgsConstructor
@Service("bzkBzTabDimingService")
public class BzkBzTabDimingServiceImpl implements BzkBzTabDimingService {

    private final BzkBzTabDimingDao bzkBzTabDimingDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabDiming queryById(String id) {
        return this.bzkBzTabDimingDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabDiming> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabDimingDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabDiming 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabDiming insert(BzkBzTabDiming bzkBzTabDiming) {
        this.bzkBzTabDimingDao.insert(bzkBzTabDiming);
        return bzkBzTabDiming;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabDiming 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabDiming update(BzkBzTabDiming bzkBzTabDiming) {
        this.bzkBzTabDimingDao.update(bzkBzTabDiming);
        return this.queryById(bzkBzTabDiming.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabDimingDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabDimingDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabDiming> page(PageForm<BzkBzTabDiming> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabDiming> entityList = this.bzkBzTabDimingDao.queryPageBzkBzTabDimingList(pq);
        Page<BzkBzTabDiming> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}