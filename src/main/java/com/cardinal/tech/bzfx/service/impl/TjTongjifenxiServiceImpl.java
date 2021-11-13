package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.TjTongjifenxi;
import com.cardinal.tech.bzfx.dao.TjTongjifenxiDao;
import com.cardinal.tech.bzfx.service.TjTongjifenxiService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 统计分析表(TjTongjifenxi)表服务实现类
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:38
 */
@RequiredArgsConstructor
@Service("tjTongjifenxiService")
public class TjTongjifenxiServiceImpl implements TjTongjifenxiService {

    private final TjTongjifenxiDao tjTongjifenxiDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TjTongjifenxi queryById(Long id) {
        return this.tjTongjifenxiDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TjTongjifenxi> queryAllByLimit(int offset, int limit) {
        return this.tjTongjifenxiDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tjTongjifenxi 实例对象
     * @return 实例对象
     */
    @Override
    public TjTongjifenxi insert(TjTongjifenxi tjTongjifenxi) {
        this.tjTongjifenxiDao.insert(tjTongjifenxi);
        return tjTongjifenxi;
    }

    /**
     * 修改数据
     *
     * @param tjTongjifenxi 实例对象
     * @return 实例对象
     */
    @Override
    public TjTongjifenxi update(TjTongjifenxi tjTongjifenxi) {
        this.tjTongjifenxiDao.update(tjTongjifenxi);
        return this.queryById(tjTongjifenxi.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tjTongjifenxiDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.tjTongjifenxiDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<TjTongjifenxi> page(PageForm<TjTongjifenxi> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<TjTongjifenxi> entityList = this.tjTongjifenxiDao.queryPageTjTongjifenxiList(pq);
        Page<TjTongjifenxi> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}