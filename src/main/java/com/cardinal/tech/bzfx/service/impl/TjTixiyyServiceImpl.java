package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.TjTixiyy;
import com.cardinal.tech.bzfx.dao.TjTixiyyDao;
import com.cardinal.tech.bzfx.service.TjTixiyyService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 体系医院标准编码(TjTixiyy)表服务实现类
 *
 * @author cadinal.tech
 * @since 2021-11-13 19:28:47
 */
@RequiredArgsConstructor
@Service("tjTixiyyService")
public class TjTixiyyServiceImpl implements TjTixiyyService {

    private final TjTixiyyDao tjTixiyyDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TjTixiyy queryById(Long id) {
        return this.tjTixiyyDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TjTixiyy> queryAllByLimit(int offset, int limit) {
        return this.tjTixiyyDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tjTixiyy 实例对象
     * @return 实例对象
     */
    @Override
    public TjTixiyy insert(TjTixiyy tjTixiyy) {
        this.tjTixiyyDao.insert(tjTixiyy);
        return tjTixiyy;
    }

    /**
     * 修改数据
     *
     * @param tjTixiyy 实例对象
     * @return 实例对象
     */
    @Override
    public TjTixiyy update(TjTixiyy tjTixiyy) {
        this.tjTixiyyDao.update(tjTixiyy);
        return this.queryById(tjTixiyy.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tjTixiyyDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.tjTixiyyDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<TjTixiyy> page(PageForm<TjTixiyy> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<TjTixiyy> entityList = this.tjTixiyyDao.queryPageTjTixiyyList(pq);
        Page<TjTixiyy> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}