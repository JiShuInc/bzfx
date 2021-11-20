package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkSlgxBzBzdaxx;
import com.cardinal.tech.bzfx.dao.BzkSlgxBzBzdaxxDao;
import com.cardinal.tech.bzfx.service.BzkSlgxBzBzdaxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 被装档案信息(BzkSlgxBzBzdaxx)表服务实现类
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
@RequiredArgsConstructor
@Service("bzkSlgxBzBzdaxxService")
public class BzkSlgxBzBzdaxxServiceImpl implements BzkSlgxBzBzdaxxService {

    private final BzkSlgxBzBzdaxxDao bzkSlgxBzBzdaxxDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkSlgxBzBzdaxx queryById(String id) {
        return this.bzkSlgxBzBzdaxxDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkSlgxBzBzdaxx> queryAllByLimit(int offset, int limit) {
        return this.bzkSlgxBzBzdaxxDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkSlgxBzBzdaxx 实例对象
     * @return 实例对象
     */
    @Override
    public BzkSlgxBzBzdaxx insert(BzkSlgxBzBzdaxx bzkSlgxBzBzdaxx) {
        this.bzkSlgxBzBzdaxxDao.insert(bzkSlgxBzBzdaxx);
        return bzkSlgxBzBzdaxx;
    }

    /**
     * 修改数据
     *
     * @param bzkSlgxBzBzdaxx 实例对象
     * @return 实例对象
     */
    @Override
    public BzkSlgxBzBzdaxx update(BzkSlgxBzBzdaxx bzkSlgxBzBzdaxx) {
        this.bzkSlgxBzBzdaxxDao.update(bzkSlgxBzBzdaxx);
        return this.queryById(bzkSlgxBzBzdaxx.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkSlgxBzBzdaxxDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkSlgxBzBzdaxxDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkSlgxBzBzdaxx> page(PageForm<BzkSlgxBzBzdaxx> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkSlgxBzBzdaxx> entityList = this.bzkSlgxBzBzdaxxDao.queryPageBzkSlgxBzBzdaxxList(pq);
        Page<BzkSlgxBzBzdaxx> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}