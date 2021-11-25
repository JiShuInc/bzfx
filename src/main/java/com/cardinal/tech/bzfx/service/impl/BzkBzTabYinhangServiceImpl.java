package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabYinhang;
import com.cardinal.tech.bzfx.dao.BzkBzTabYinhangDao;
import com.cardinal.tech.bzfx.service.BzkBzTabYinhangService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 银行代码(BzkBzTabYinhang)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@Service("bzkBzTabYinhangService")
public class BzkBzTabYinhangServiceImpl implements BzkBzTabYinhangService {

    private final BzkBzTabYinhangDao bzkBzTabYinhangDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabYinhang queryById(String id) {
        return this.bzkBzTabYinhangDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabYinhang> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabYinhangDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabYinhang 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabYinhang insert(BzkBzTabYinhang bzkBzTabYinhang) {
        this.bzkBzTabYinhangDao.insert(bzkBzTabYinhang);
        return bzkBzTabYinhang;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabYinhang 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabYinhang update(BzkBzTabYinhang bzkBzTabYinhang) {
        this.bzkBzTabYinhangDao.update(bzkBzTabYinhang);
        return this.queryById(bzkBzTabYinhang.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabYinhangDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabYinhangDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabYinhang> page(PageForm<BzkBzTabYinhang> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabYinhang> entityList = this.bzkBzTabYinhangDao.queryPageBzkBzTabYinhangList(pq);
        Page<BzkBzTabYinhang> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}