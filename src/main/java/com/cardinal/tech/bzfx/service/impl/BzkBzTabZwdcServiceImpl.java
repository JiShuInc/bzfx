package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabZwdc;
import com.cardinal.tech.bzfx.dao.BzkBzTabZwdcDao;
import com.cardinal.tech.bzfx.service.BzkBzTabZwdcService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 职务档次(BzkBzTabZwdc)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:59
 */
@RequiredArgsConstructor
@Service("bzkBzTabZwdcService")
public class BzkBzTabZwdcServiceImpl implements BzkBzTabZwdcService {

    private final BzkBzTabZwdcDao bzkBzTabZwdcDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabZwdc queryById(String id) {
        return this.bzkBzTabZwdcDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabZwdc> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabZwdcDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabZwdc 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabZwdc insert(BzkBzTabZwdc bzkBzTabZwdc) {
        this.bzkBzTabZwdcDao.insert(bzkBzTabZwdc);
        return bzkBzTabZwdc;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabZwdc 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabZwdc update(BzkBzTabZwdc bzkBzTabZwdc) {
        this.bzkBzTabZwdcDao.update(bzkBzTabZwdc);
        return this.queryById(bzkBzTabZwdc.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabZwdcDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabZwdcDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabZwdc> page(PageForm<BzkBzTabZwdc> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabZwdc> entityList = this.bzkBzTabZwdcDao.queryPageBzkBzTabZwdcList(pq);
        Page<BzkBzTabZwdc> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}