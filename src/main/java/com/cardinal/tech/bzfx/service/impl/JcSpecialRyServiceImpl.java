package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.JcSpecialRyForm;
import com.cardinal.tech.bzfx.bean.bo.JcSpecialRyPageForm;
import com.cardinal.tech.bzfx.bean.bo.Page;
import com.cardinal.tech.bzfx.bean.bo.PageForm;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.dao.JcSpecialRyDao;
import com.cardinal.tech.bzfx.entity.BzkTabRenyuanjbxx;
import com.cardinal.tech.bzfx.entity.JcSpecialRy;
import com.cardinal.tech.bzfx.service.JcSpecialRyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * 专项任务人员(JcSpecialRy)表服务实现类
 *
 * @author makejava
 * @since 2021-11-20 18:42:52
 */
@RequiredArgsConstructor
@Service("jcSpecialRyService")
public class JcSpecialRyServiceImpl implements JcSpecialRyService {

    private final JcSpecialRyDao jcSpecialRyDao;

    /**
     * 通过ID查询单条数据
     *
     * @param queryForm 任务
     * @return 实例对象
     */
    @Override
    public Page<BzkTabRenyuanjbxx> queryBySid(PageForm<JcSpecialRyPageForm> queryForm) {
        var pq = new PageQuery<>(queryForm);
        List<BzkTabRenyuanjbxx> entityList = this.jcSpecialRyDao.queryPageJcSpecialRyxxList(pq);
        Page<BzkTabRenyuanjbxx> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<JcSpecialRy> queryAllByLimit(int offset, int limit) {
        return this.jcSpecialRyDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param jcSpecialRy 实例对象
     * @return 实例对象
     */
    @Override
    public JcSpecialRy insert(JcSpecialRy jcSpecialRy) {
        this.jcSpecialRyDao.insert(jcSpecialRy);
        return jcSpecialRy;
    }

    /**
     * 修改数据
     *
     * @param jcSpecialRy 实例对象
     * @return 实例对象
     */
    @Override
    public JcSpecialRy update(JcSpecialRy jcSpecialRy) {
        this.jcSpecialRyDao.update(jcSpecialRy);
        return this.jcSpecialRyDao.queryById(jcSpecialRy.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param sid 任务id
     * @param sid 任务id
     * @return 是否成功
     */
    @Override
    public boolean deleteBySId(Long sid, String rid) {
        return this.jcSpecialRyDao.deleteBySId(sid, rid) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String, Integer>> groupBy(String field) {
        return this.jcSpecialRyDao.groupBy(field);
    }

    /**
     * 分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
    @Override
    public Page<JcSpecialRy> page(PageForm<JcSpecialRy> userQueryForm) {
        var pq = new PageQuery<>(userQueryForm);
        List<JcSpecialRy> entityList = this.jcSpecialRyDao.queryPageJcSpecialRyList(pq);
        Page<JcSpecialRy> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }

    @Transactional
    @Override
    public void addRy(JcSpecialRyForm jcSpecialRy) {
        this.jcSpecialRyDao.addRyToRw(jcSpecialRy.getSid(), jcSpecialRy.getQuery());
    }
}