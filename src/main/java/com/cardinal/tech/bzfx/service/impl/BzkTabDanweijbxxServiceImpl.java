package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkTabDanweijbxx;
import com.cardinal.tech.bzfx.dao.BzkTabDanweijbxxDao;
import com.cardinal.tech.bzfx.service.BzkTabDanweijbxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 单位基本信息(BzkTabDanweijbxx)表服务实现类
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
@RequiredArgsConstructor
@Service("bzkTabDanweijbxxService")
public class BzkTabDanweijbxxServiceImpl implements BzkTabDanweijbxxService {

    private final BzkTabDanweijbxxDao bzkTabDanweijbxxDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkTabDanweijbxx queryById(String id) {
        return this.bzkTabDanweijbxxDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkTabDanweijbxx> queryAllByLimit(int offset, int limit) {
        return this.bzkTabDanweijbxxDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkTabDanweijbxx 实例对象
     * @return 实例对象
     */
    @Override
    public BzkTabDanweijbxx insert(BzkTabDanweijbxx bzkTabDanweijbxx) {
        this.bzkTabDanweijbxxDao.insert(bzkTabDanweijbxx);
        return bzkTabDanweijbxx;
    }

    /**
     * 修改数据
     *
     * @param bzkTabDanweijbxx 实例对象
     * @return 实例对象
     */
    @Override
    public BzkTabDanweijbxx update(BzkTabDanweijbxx bzkTabDanweijbxx) {
        this.bzkTabDanweijbxxDao.update(bzkTabDanweijbxx);
        return this.queryById(bzkTabDanweijbxx.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkTabDanweijbxxDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkTabDanweijbxxDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkTabDanweijbxx> page(PageForm<BzkTabDanweijbxx> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkTabDanweijbxx> entityList = this.bzkTabDanweijbxxDao.queryPageBzkTabDanweijbxxList(pq);
        Page<BzkTabDanweijbxx> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }

    /**
     *  分页查询(获取字典)
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
    @Override
    public Page<BzkTabDanweijbxx> pageDict(PageForm<BzkTabDanweijbxx> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkTabDanweijbxx> entityList = this.bzkTabDanweijbxxDao.queryPageBzkTabDanweijbxxDictList(pq);
        Page<BzkTabDanweijbxx> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}