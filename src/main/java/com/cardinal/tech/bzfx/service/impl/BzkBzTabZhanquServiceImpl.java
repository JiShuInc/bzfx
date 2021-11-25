package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabZhanqu;
import com.cardinal.tech.bzfx.dao.BzkBzTabZhanquDao;
import com.cardinal.tech.bzfx.service.BzkBzTabZhanquService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 战区(BzkBzTabZhanqu)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@Service("bzkBzTabZhanquService")
public class BzkBzTabZhanquServiceImpl implements BzkBzTabZhanquService {

    private final BzkBzTabZhanquDao bzkBzTabZhanquDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabZhanqu queryById(String id) {
        return this.bzkBzTabZhanquDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabZhanqu> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabZhanquDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabZhanqu 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabZhanqu insert(BzkBzTabZhanqu bzkBzTabZhanqu) {
        this.bzkBzTabZhanquDao.insert(bzkBzTabZhanqu);
        return bzkBzTabZhanqu;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabZhanqu 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabZhanqu update(BzkBzTabZhanqu bzkBzTabZhanqu) {
        this.bzkBzTabZhanquDao.update(bzkBzTabZhanqu);
        return this.queryById(bzkBzTabZhanqu.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabZhanquDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabZhanquDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabZhanqu> page(PageForm<BzkBzTabZhanqu> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabZhanqu> entityList = this.bzkBzTabZhanquDao.queryPageBzkBzTabZhanquList(pq);
        Page<BzkBzTabZhanqu> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}