package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabRylbcwjxdy;
import com.cardinal.tech.bzfx.dao.BzkBzTabRylbcwjxdyDao;
import com.cardinal.tech.bzfx.service.BzkBzTabRylbcwjxdyService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 人员类别军衔对应表(BzkBzTabRylbcwjxdy)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:57
 */
@RequiredArgsConstructor
@Service("bzkBzTabRylbcwjxdyService")
public class BzkBzTabRylbcwjxdyServiceImpl implements BzkBzTabRylbcwjxdyService {

    private final BzkBzTabRylbcwjxdyDao bzkBzTabRylbcwjxdyDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabRylbcwjxdy queryById(String id) {
        return this.bzkBzTabRylbcwjxdyDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabRylbcwjxdy> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabRylbcwjxdyDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabRylbcwjxdy 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabRylbcwjxdy insert(BzkBzTabRylbcwjxdy bzkBzTabRylbcwjxdy) {
        this.bzkBzTabRylbcwjxdyDao.insert(bzkBzTabRylbcwjxdy);
        return bzkBzTabRylbcwjxdy;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabRylbcwjxdy 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabRylbcwjxdy update(BzkBzTabRylbcwjxdy bzkBzTabRylbcwjxdy) {
        this.bzkBzTabRylbcwjxdyDao.update(bzkBzTabRylbcwjxdy);
        return this.queryById(bzkBzTabRylbcwjxdy.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabRylbcwjxdyDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabRylbcwjxdyDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabRylbcwjxdy> page(PageForm<BzkBzTabRylbcwjxdy> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabRylbcwjxdy> entityList = this.bzkBzTabRylbcwjxdyDao.queryPageBzkBzTabRylbcwjxdyList(pq);
        Page<BzkBzTabRylbcwjxdy> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}