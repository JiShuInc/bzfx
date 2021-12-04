package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.TjTongjifenxiSpecial;
import com.cardinal.tech.bzfx.dao.TjTongjifenxiSpecialDao;
import com.cardinal.tech.bzfx.service.TjTongjifenxiSpecialService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 专项任务统计分析表(TjTongjifenxiSpecial)表服务实现类
 *
 * @author makejava
 * @since 2021-12-04 19:29:47
 */
@RequiredArgsConstructor
@Service("tjTongjifenxiSpecialService")
public class TjTongjifenxiSpecialServiceImpl implements TjTongjifenxiSpecialService {

    private final TjTongjifenxiSpecialDao tjTongjifenxiSpecialDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TjTongjifenxiSpecial queryById(Long id) {
        return this.tjTongjifenxiSpecialDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TjTongjifenxiSpecial> queryAllByLimit(int offset, int limit) {
        return this.tjTongjifenxiSpecialDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tjTongjifenxiSpecial 实例对象
     * @return 实例对象
     */
    @Override
    public TjTongjifenxiSpecial insert(TjTongjifenxiSpecial tjTongjifenxiSpecial) {
        this.tjTongjifenxiSpecialDao.insert(tjTongjifenxiSpecial);
        return tjTongjifenxiSpecial;
    }

    /**
     * 修改数据
     *
     * @param tjTongjifenxiSpecial 实例对象
     * @return 实例对象
     */
    @Override
    public TjTongjifenxiSpecial update(TjTongjifenxiSpecial tjTongjifenxiSpecial) {
        this.tjTongjifenxiSpecialDao.update(tjTongjifenxiSpecial);
        return this.queryById(tjTongjifenxiSpecial.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tjTongjifenxiSpecialDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.tjTongjifenxiSpecialDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<TjTongjifenxiSpecial> page(PageForm<TjTongjifenxiSpecial> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<TjTongjifenxiSpecial> entityList = this.tjTongjifenxiSpecialDao.queryPageTjTongjifenxiSpecialList(pq);
        Page<TjTongjifenxiSpecial> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}