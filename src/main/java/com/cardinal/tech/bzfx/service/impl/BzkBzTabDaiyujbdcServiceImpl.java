package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabDaiyujbdc;
import com.cardinal.tech.bzfx.dao.BzkBzTabDaiyujbdcDao;
import com.cardinal.tech.bzfx.service.BzkBzTabDaiyujbdcService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 待遇级别档次标准编码(BzkBzTabDaiyujbdc)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
@RequiredArgsConstructor
@Service("bzkBzTabDaiyujbdcService")
public class BzkBzTabDaiyujbdcServiceImpl implements BzkBzTabDaiyujbdcService {

    private final BzkBzTabDaiyujbdcDao bzkBzTabDaiyujbdcDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabDaiyujbdc queryById(String id) {
        return this.bzkBzTabDaiyujbdcDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabDaiyujbdc> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabDaiyujbdcDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabDaiyujbdc 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabDaiyujbdc insert(BzkBzTabDaiyujbdc bzkBzTabDaiyujbdc) {
        this.bzkBzTabDaiyujbdcDao.insert(bzkBzTabDaiyujbdc);
        return bzkBzTabDaiyujbdc;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabDaiyujbdc 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabDaiyujbdc update(BzkBzTabDaiyujbdc bzkBzTabDaiyujbdc) {
        this.bzkBzTabDaiyujbdcDao.update(bzkBzTabDaiyujbdc);
        return this.queryById(bzkBzTabDaiyujbdc.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabDaiyujbdcDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabDaiyujbdcDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabDaiyujbdc> page(PageForm<BzkBzTabDaiyujbdc> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabDaiyujbdc> entityList = this.bzkBzTabDaiyujbdcDao.queryPageBzkBzTabDaiyujbdcList(pq);
        Page<BzkBzTabDaiyujbdc> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}