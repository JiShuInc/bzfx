package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabXuexing;
import com.cardinal.tech.bzfx.dao.BzkBzTabXuexingDao;
import com.cardinal.tech.bzfx.service.BzkBzTabXuexingService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 血型(BzkBzTabXuexing)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@Service("bzkBzTabXuexingService")
public class BzkBzTabXuexingServiceImpl implements BzkBzTabXuexingService {

    private final BzkBzTabXuexingDao bzkBzTabXuexingDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabXuexing queryById(String id) {
        return this.bzkBzTabXuexingDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabXuexing> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabXuexingDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabXuexing 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabXuexing insert(BzkBzTabXuexing bzkBzTabXuexing) {
        this.bzkBzTabXuexingDao.insert(bzkBzTabXuexing);
        return bzkBzTabXuexing;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabXuexing 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabXuexing update(BzkBzTabXuexing bzkBzTabXuexing) {
        this.bzkBzTabXuexingDao.update(bzkBzTabXuexing);
        return this.queryById(bzkBzTabXuexing.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabXuexingDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabXuexingDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabXuexing> page(PageForm<BzkBzTabXuexing> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabXuexing> entityList = this.bzkBzTabXuexingDao.queryPageBzkBzTabXuexingList(pq);
        Page<BzkBzTabXuexing> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}