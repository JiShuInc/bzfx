package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabRylbjxdy;
import com.cardinal.tech.bzfx.dao.BzkBzTabRylbjxdyDao;
import com.cardinal.tech.bzfx.service.BzkBzTabRylbjxdyService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 人员类别军衔对应表(BzkBzTabRylbjxdy)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@Service("bzkBzTabRylbjxdyService")
public class BzkBzTabRylbjxdyServiceImpl implements BzkBzTabRylbjxdyService {

    private final BzkBzTabRylbjxdyDao bzkBzTabRylbjxdyDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabRylbjxdy queryById(String id) {
        return this.bzkBzTabRylbjxdyDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabRylbjxdy> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabRylbjxdyDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabRylbjxdy 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabRylbjxdy insert(BzkBzTabRylbjxdy bzkBzTabRylbjxdy) {
        this.bzkBzTabRylbjxdyDao.insert(bzkBzTabRylbjxdy);
        return bzkBzTabRylbjxdy;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabRylbjxdy 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabRylbjxdy update(BzkBzTabRylbjxdy bzkBzTabRylbjxdy) {
        this.bzkBzTabRylbjxdyDao.update(bzkBzTabRylbjxdy);
        return this.queryById(bzkBzTabRylbjxdy.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabRylbjxdyDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabRylbjxdyDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabRylbjxdy> page(PageForm<BzkBzTabRylbjxdy> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabRylbjxdy> entityList = this.bzkBzTabRylbjxdyDao.queryPageBzkBzTabRylbjxdyList(pq);
        Page<BzkBzTabRylbjxdy> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}