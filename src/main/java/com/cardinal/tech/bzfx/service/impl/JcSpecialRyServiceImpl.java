package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.JcSpecialRy;
import com.cardinal.tech.bzfx.dao.JcSpecialRyDao;
import com.cardinal.tech.bzfx.service.JcSpecialRyService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 专项任务人员(JcSpecialRy)表服务实现类
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:37
 */
@RequiredArgsConstructor
@Service("jcSpecialRyService")
public class JcSpecialRyServiceImpl implements JcSpecialRyService {

    private final JcSpecialRyDao jcSpecialRyDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public JcSpecialRy queryById(Long id) {
        return this.jcSpecialRyDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
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
        return this.queryById(jcSpecialRy.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.jcSpecialRyDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.jcSpecialRyDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<JcSpecialRy> page(PageForm<JcSpecialRy> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<JcSpecialRy> entityList = this.jcSpecialRyDao.queryPageJcSpecialRyList(pq);
        Page<JcSpecialRy> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}