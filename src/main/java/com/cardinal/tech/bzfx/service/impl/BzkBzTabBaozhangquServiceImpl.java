package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabBaozhangqu;
import com.cardinal.tech.bzfx.dao.BzkBzTabBaozhangquDao;
import com.cardinal.tech.bzfx.service.BzkBzTabBaozhangquService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 保障区(BzkBzTabBaozhangqu)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:53
 */
@RequiredArgsConstructor
@Service("bzkBzTabBaozhangquService")
public class BzkBzTabBaozhangquServiceImpl implements BzkBzTabBaozhangquService {

    private final BzkBzTabBaozhangquDao bzkBzTabBaozhangquDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabBaozhangqu queryById(String id) {
        return this.bzkBzTabBaozhangquDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabBaozhangqu> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabBaozhangquDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabBaozhangqu 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabBaozhangqu insert(BzkBzTabBaozhangqu bzkBzTabBaozhangqu) {
        this.bzkBzTabBaozhangquDao.insert(bzkBzTabBaozhangqu);
        return bzkBzTabBaozhangqu;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabBaozhangqu 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabBaozhangqu update(BzkBzTabBaozhangqu bzkBzTabBaozhangqu) {
        this.bzkBzTabBaozhangquDao.update(bzkBzTabBaozhangqu);
        return this.queryById(bzkBzTabBaozhangqu.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabBaozhangquDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabBaozhangquDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabBaozhangqu> page(PageForm<BzkBzTabBaozhangqu> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabBaozhangqu> entityList = this.bzkBzTabBaozhangquDao.queryPageBzkBzTabBaozhangquList(pq);
        Page<BzkBzTabBaozhangqu> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}