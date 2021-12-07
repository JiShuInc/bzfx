package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.TjDapingshezhi;
import com.cardinal.tech.bzfx.dao.TjDapingshezhiDao;
import com.cardinal.tech.bzfx.service.TjDapingshezhiService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (TjDapingshezhi)表服务实现类
 *
 * @author makejava
 * @since 2021-12-07 10:48:02
 */
@RequiredArgsConstructor
@Service("tjDapingshezhiService")
public class TjDapingshezhiServiceImpl implements TjDapingshezhiService {

    private final TjDapingshezhiDao tjDapingshezhiDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TjDapingshezhi queryById(Long id) {
        return this.tjDapingshezhiDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TjDapingshezhi> queryAllByLimit(int offset, int limit) {
        return this.tjDapingshezhiDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tjDapingshezhi 实例对象
     * @return 实例对象
     */
    @Override
    public TjDapingshezhi insert(TjDapingshezhi tjDapingshezhi) {
        this.tjDapingshezhiDao.insert(tjDapingshezhi);
        return tjDapingshezhi;
    }

    /**
     * 修改数据
     *
     * @param tjDapingshezhi 实例对象
     * @return 实例对象
     */
    @Override
    public TjDapingshezhi update(TjDapingshezhi tjDapingshezhi) {
        this.tjDapingshezhiDao.update(tjDapingshezhi);
        return this.queryById(tjDapingshezhi.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tjDapingshezhiDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.tjDapingshezhiDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<TjDapingshezhi> page(PageForm<TjDapingshezhi> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<TjDapingshezhi> entityList = this.tjDapingshezhiDao.queryPageTjDapingshezhiList(pq);
        Page<TjDapingshezhi> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}