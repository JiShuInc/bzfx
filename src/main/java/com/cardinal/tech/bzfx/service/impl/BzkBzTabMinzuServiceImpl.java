package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabMinzu;
import com.cardinal.tech.bzfx.dao.BzkBzTabMinzuDao;
import com.cardinal.tech.bzfx.service.BzkBzTabMinzuService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 民族(BzkBzTabMinzu)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@Service("bzkBzTabMinzuService")
public class BzkBzTabMinzuServiceImpl implements BzkBzTabMinzuService {

    private final BzkBzTabMinzuDao bzkBzTabMinzuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabMinzu queryById(String id) {
        return this.bzkBzTabMinzuDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabMinzu> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabMinzuDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabMinzu 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabMinzu insert(BzkBzTabMinzu bzkBzTabMinzu) {
        this.bzkBzTabMinzuDao.insert(bzkBzTabMinzu);
        return bzkBzTabMinzu;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabMinzu 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabMinzu update(BzkBzTabMinzu bzkBzTabMinzu) {
        this.bzkBzTabMinzuDao.update(bzkBzTabMinzu);
        return this.queryById(bzkBzTabMinzu.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabMinzuDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabMinzuDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabMinzu> page(PageForm<BzkBzTabMinzu> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabMinzu> entityList = this.bzkBzTabMinzuDao.queryPageBzkBzTabMinzuList(pq);
        Page<BzkBzTabMinzu> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}