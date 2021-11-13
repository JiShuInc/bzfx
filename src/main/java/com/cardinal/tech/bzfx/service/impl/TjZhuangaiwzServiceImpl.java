package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.TjZhuangaiwz;
import com.cardinal.tech.bzfx.dao.TjZhuangaiwzDao;
import com.cardinal.tech.bzfx.service.TjZhuangaiwzService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 军官和文职干部互改记录表(TjZhuangaiwz)表服务实现类
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:38
 */
@RequiredArgsConstructor
@Service("tjZhuangaiwzService")
public class TjZhuangaiwzServiceImpl implements TjZhuangaiwzService {

    private final TjZhuangaiwzDao tjZhuangaiwzDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TjZhuangaiwz queryById(Long id) {
        return this.tjZhuangaiwzDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TjZhuangaiwz> queryAllByLimit(int offset, int limit) {
        return this.tjZhuangaiwzDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tjZhuangaiwz 实例对象
     * @return 实例对象
     */
    @Override
    public TjZhuangaiwz insert(TjZhuangaiwz tjZhuangaiwz) {
        this.tjZhuangaiwzDao.insert(tjZhuangaiwz);
        return tjZhuangaiwz;
    }

    /**
     * 修改数据
     *
     * @param tjZhuangaiwz 实例对象
     * @return 实例对象
     */
    @Override
    public TjZhuangaiwz update(TjZhuangaiwz tjZhuangaiwz) {
        this.tjZhuangaiwzDao.update(tjZhuangaiwz);
        return this.queryById(tjZhuangaiwz.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tjZhuangaiwzDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.tjZhuangaiwzDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<TjZhuangaiwz> page(PageForm<TjZhuangaiwz> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<TjZhuangaiwz> entityList = this.tjZhuangaiwzDao.queryPageTjZhuangaiwzList(pq);
        Page<TjZhuangaiwz> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}