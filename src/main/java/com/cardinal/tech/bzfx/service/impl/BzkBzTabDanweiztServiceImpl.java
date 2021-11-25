package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabDanweizt;
import com.cardinal.tech.bzfx.dao.BzkBzTabDanweiztDao;
import com.cardinal.tech.bzfx.service.BzkBzTabDanweiztService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 单位状态(BzkBzTabDanweizt)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
@RequiredArgsConstructor
@Service("bzkBzTabDanweiztService")
public class BzkBzTabDanweiztServiceImpl implements BzkBzTabDanweiztService {

    private final BzkBzTabDanweiztDao bzkBzTabDanweiztDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabDanweizt queryById(String id) {
        return this.bzkBzTabDanweiztDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabDanweizt> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabDanweiztDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabDanweizt 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabDanweizt insert(BzkBzTabDanweizt bzkBzTabDanweizt) {
        this.bzkBzTabDanweiztDao.insert(bzkBzTabDanweizt);
        return bzkBzTabDanweizt;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabDanweizt 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabDanweizt update(BzkBzTabDanweizt bzkBzTabDanweizt) {
        this.bzkBzTabDanweiztDao.update(bzkBzTabDanweizt);
        return this.queryById(bzkBzTabDanweizt.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabDanweiztDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabDanweiztDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabDanweizt> page(PageForm<BzkBzTabDanweizt> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabDanweizt> entityList = this.bzkBzTabDanweiztDao.queryPageBzkBzTabDanweiztList(pq);
        Page<BzkBzTabDanweizt> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}