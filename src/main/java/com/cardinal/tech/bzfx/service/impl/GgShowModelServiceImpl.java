package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.GgShowModel;
import com.cardinal.tech.bzfx.dao.GgShowModelDao;
import com.cardinal.tech.bzfx.service.GgShowModelService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 可视化模型(GgShowModel)表服务实现类
 *
 * @author cadinal.tech
 * @since 2021-11-14 14:09:12
 */
@RequiredArgsConstructor
@Service("ggShowModelService")
public class GgShowModelServiceImpl implements GgShowModelService {

    private final GgShowModelDao ggShowModelDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public GgShowModel queryById(Long id) {
        return this.ggShowModelDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<GgShowModel> queryAllByLimit(int offset, int limit) {
        return this.ggShowModelDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ggShowModel 实例对象
     * @return 实例对象
     */
    @Override
    public GgShowModel insert(GgShowModel ggShowModel) {
        this.ggShowModelDao.insert(ggShowModel);
        return ggShowModel;
    }

    /**
     * 修改数据
     *
     * @param ggShowModel 实例对象
     * @return 实例对象
     */
    @Override
    public GgShowModel update(GgShowModel ggShowModel) {
        this.ggShowModelDao.update(ggShowModel);
        return this.queryById(ggShowModel.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.ggShowModelDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.ggShowModelDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<GgShowModel> page(PageForm<GgShowModel> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<GgShowModel> entityList = this.ggShowModelDao.queryPageGgShowModelList(pq);
        Page<GgShowModel> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}