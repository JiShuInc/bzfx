package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkTabRenyuanjbxx;
import com.cardinal.tech.bzfx.dao.BzkTabRenyuanjbxxDao;
import com.cardinal.tech.bzfx.service.BzkTabRenyuanjbxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 人员基本信息(BzkTabRenyuanjbxx)表服务实现类
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
@RequiredArgsConstructor
@Service("bzkTabRenyuanjbxxService")
public class BzkTabRenyuanjbxxServiceImpl implements BzkTabRenyuanjbxxService {

    private final BzkTabRenyuanjbxxDao bzkTabRenyuanjbxxDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkTabRenyuanjbxx queryById(String id) {
        return this.bzkTabRenyuanjbxxDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkTabRenyuanjbxx> queryAllByLimit(int offset, int limit) {
        return this.bzkTabRenyuanjbxxDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkTabRenyuanjbxx 实例对象
     * @return 实例对象
     */
    @Override
    public BzkTabRenyuanjbxx insert(BzkTabRenyuanjbxx bzkTabRenyuanjbxx) {
        this.bzkTabRenyuanjbxxDao.insert(bzkTabRenyuanjbxx);
        return bzkTabRenyuanjbxx;
    }

    /**
     * 修改数据
     *
     * @param bzkTabRenyuanjbxx 实例对象
     * @return 实例对象
     */
    @Override
    public BzkTabRenyuanjbxx update(BzkTabRenyuanjbxx bzkTabRenyuanjbxx) {
        this.bzkTabRenyuanjbxxDao.update(bzkTabRenyuanjbxx);
        return this.queryById(bzkTabRenyuanjbxx.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkTabRenyuanjbxxDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkTabRenyuanjbxxDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkTabRenyuanjbxx> page(PageForm<BzkTabRenyuanjbxx> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkTabRenyuanjbxx> entityList = this.bzkTabRenyuanjbxxDao.queryPageBzkTabRenyuanjbxxList(pq);
        Page<BzkTabRenyuanjbxx> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}