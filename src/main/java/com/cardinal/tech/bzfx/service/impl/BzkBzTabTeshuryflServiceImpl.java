package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabTeshuryfl;
import com.cardinal.tech.bzfx.dao.BzkBzTabTeshuryflDao;
import com.cardinal.tech.bzfx.service.BzkBzTabTeshuryflService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 特殊人员分类(BzkBzTabTeshuryfl)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@Service("bzkBzTabTeshuryflService")
public class BzkBzTabTeshuryflServiceImpl implements BzkBzTabTeshuryflService {

    private final BzkBzTabTeshuryflDao bzkBzTabTeshuryflDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabTeshuryfl queryById(String id) {
        return this.bzkBzTabTeshuryflDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabTeshuryfl> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabTeshuryflDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabTeshuryfl 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabTeshuryfl insert(BzkBzTabTeshuryfl bzkBzTabTeshuryfl) {
        this.bzkBzTabTeshuryflDao.insert(bzkBzTabTeshuryfl);
        return bzkBzTabTeshuryfl;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabTeshuryfl 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabTeshuryfl update(BzkBzTabTeshuryfl bzkBzTabTeshuryfl) {
        this.bzkBzTabTeshuryflDao.update(bzkBzTabTeshuryfl);
        return this.queryById(bzkBzTabTeshuryfl.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabTeshuryflDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabTeshuryflDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabTeshuryfl> page(PageForm<BzkBzTabTeshuryfl> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabTeshuryfl> entityList = this.bzkBzTabTeshuryflDao.queryPageBzkBzTabTeshuryflList(pq);
        Page<BzkBzTabTeshuryfl> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}