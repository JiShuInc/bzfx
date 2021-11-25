package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabRylbzzqkdy;
import com.cardinal.tech.bzfx.dao.BzkBzTabRylbzzqkdyDao;
import com.cardinal.tech.bzfx.service.BzkBzTabRylbzzqkdyService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 人员类别在职情况对应表(BzkBzTabRylbzzqkdy)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@Service("bzkBzTabRylbzzqkdyService")
public class BzkBzTabRylbzzqkdyServiceImpl implements BzkBzTabRylbzzqkdyService {

    private final BzkBzTabRylbzzqkdyDao bzkBzTabRylbzzqkdyDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabRylbzzqkdy queryById(String id) {
        return this.bzkBzTabRylbzzqkdyDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabRylbzzqkdy> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabRylbzzqkdyDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabRylbzzqkdy 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabRylbzzqkdy insert(BzkBzTabRylbzzqkdy bzkBzTabRylbzzqkdy) {
        this.bzkBzTabRylbzzqkdyDao.insert(bzkBzTabRylbzzqkdy);
        return bzkBzTabRylbzzqkdy;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabRylbzzqkdy 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabRylbzzqkdy update(BzkBzTabRylbzzqkdy bzkBzTabRylbzzqkdy) {
        this.bzkBzTabRylbzzqkdyDao.update(bzkBzTabRylbzzqkdy);
        return this.queryById(bzkBzTabRylbzzqkdy.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabRylbzzqkdyDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabRylbzzqkdyDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabRylbzzqkdy> page(PageForm<BzkBzTabRylbzzqkdy> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabRylbzzqkdy> entityList = this.bzkBzTabRylbzzqkdyDao.queryPageBzkBzTabRylbzzqkdyList(pq);
        Page<BzkBzTabRylbzzqkdy> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}