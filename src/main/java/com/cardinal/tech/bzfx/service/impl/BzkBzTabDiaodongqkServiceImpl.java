package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabDiaodongqk;
import com.cardinal.tech.bzfx.dao.BzkBzTabDiaodongqkDao;
import com.cardinal.tech.bzfx.service.BzkBzTabDiaodongqkService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 调动情况(BzkBzTabDiaodongqk)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
@RequiredArgsConstructor
@Service("bzkBzTabDiaodongqkService")
public class BzkBzTabDiaodongqkServiceImpl implements BzkBzTabDiaodongqkService {

    private final BzkBzTabDiaodongqkDao bzkBzTabDiaodongqkDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabDiaodongqk queryById(String id) {
        return this.bzkBzTabDiaodongqkDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabDiaodongqk> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabDiaodongqkDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabDiaodongqk 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabDiaodongqk insert(BzkBzTabDiaodongqk bzkBzTabDiaodongqk) {
        this.bzkBzTabDiaodongqkDao.insert(bzkBzTabDiaodongqk);
        return bzkBzTabDiaodongqk;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabDiaodongqk 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabDiaodongqk update(BzkBzTabDiaodongqk bzkBzTabDiaodongqk) {
        this.bzkBzTabDiaodongqkDao.update(bzkBzTabDiaodongqk);
        return this.queryById(bzkBzTabDiaodongqk.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabDiaodongqkDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabDiaodongqkDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabDiaodongqk> page(PageForm<BzkBzTabDiaodongqk> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabDiaodongqk> entityList = this.bzkBzTabDiaodongqkDao.queryPageBzkBzTabDiaodongqkList(pq);
        Page<BzkBzTabDiaodongqk> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}