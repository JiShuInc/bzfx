package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.TjBaozhangkajl;
import com.cardinal.tech.bzfx.dao.TjBaozhangkajlDao;
import com.cardinal.tech.bzfx.service.TjBaozhangkajlService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 保障卡卡记录表(TjBaozhangkajl)表服务实现类
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:37
 */
@RequiredArgsConstructor
@Service("tjBaozhangkajlService")
public class TjBaozhangkajlServiceImpl implements TjBaozhangkajlService {

    private final TjBaozhangkajlDao tjBaozhangkajlDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TjBaozhangkajl queryById(Long id) {
        return this.tjBaozhangkajlDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TjBaozhangkajl> queryAllByLimit(int offset, int limit) {
        return this.tjBaozhangkajlDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tjBaozhangkajl 实例对象
     * @return 实例对象
     */
    @Override
    public TjBaozhangkajl insert(TjBaozhangkajl tjBaozhangkajl) {
        this.tjBaozhangkajlDao.insert(tjBaozhangkajl);
        return tjBaozhangkajl;
    }

    /**
     * 修改数据
     *
     * @param tjBaozhangkajl 实例对象
     * @return 实例对象
     */
    @Override
    public TjBaozhangkajl update(TjBaozhangkajl tjBaozhangkajl) {
        this.tjBaozhangkajlDao.update(tjBaozhangkajl);
        return this.queryById(tjBaozhangkajl.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tjBaozhangkajlDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.tjBaozhangkajlDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<TjBaozhangkajl> page(PageForm<TjBaozhangkajl> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<TjBaozhangkajl> entityList = this.tjBaozhangkajlDao.queryPageTjBaozhangkajlList(pq);
        Page<TjBaozhangkajl> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}