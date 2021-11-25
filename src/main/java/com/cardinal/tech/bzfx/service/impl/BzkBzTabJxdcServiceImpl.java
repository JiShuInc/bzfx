package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabJxdc;
import com.cardinal.tech.bzfx.dao.BzkBzTabJxdcDao;
import com.cardinal.tech.bzfx.service.BzkBzTabJxdcService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 军衔档次(BzkBzTabJxdc)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@Service("bzkBzTabJxdcService")
public class BzkBzTabJxdcServiceImpl implements BzkBzTabJxdcService {

    private final BzkBzTabJxdcDao bzkBzTabJxdcDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabJxdc queryById(String id) {
        return this.bzkBzTabJxdcDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabJxdc> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabJxdcDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabJxdc 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabJxdc insert(BzkBzTabJxdc bzkBzTabJxdc) {
        this.bzkBzTabJxdcDao.insert(bzkBzTabJxdc);
        return bzkBzTabJxdc;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabJxdc 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabJxdc update(BzkBzTabJxdc bzkBzTabJxdc) {
        this.bzkBzTabJxdcDao.update(bzkBzTabJxdc);
        return this.queryById(bzkBzTabJxdc.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabJxdcDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabJxdcDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabJxdc> page(PageForm<BzkBzTabJxdc> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabJxdc> entityList = this.bzkBzTabJxdcDao.queryPageBzkBzTabJxdcList(pq);
        Page<BzkBzTabJxdc> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}