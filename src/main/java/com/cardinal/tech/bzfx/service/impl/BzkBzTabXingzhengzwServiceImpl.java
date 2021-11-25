package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabXingzhengzw;
import com.cardinal.tech.bzfx.dao.BzkBzTabXingzhengzwDao;
import com.cardinal.tech.bzfx.service.BzkBzTabXingzhengzwService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 行政职务(BzkBzTabXingzhengzw)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@Service("bzkBzTabXingzhengzwService")
public class BzkBzTabXingzhengzwServiceImpl implements BzkBzTabXingzhengzwService {

    private final BzkBzTabXingzhengzwDao bzkBzTabXingzhengzwDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabXingzhengzw queryById(String id) {
        return this.bzkBzTabXingzhengzwDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabXingzhengzw> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabXingzhengzwDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabXingzhengzw 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabXingzhengzw insert(BzkBzTabXingzhengzw bzkBzTabXingzhengzw) {
        this.bzkBzTabXingzhengzwDao.insert(bzkBzTabXingzhengzw);
        return bzkBzTabXingzhengzw;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabXingzhengzw 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabXingzhengzw update(BzkBzTabXingzhengzw bzkBzTabXingzhengzw) {
        this.bzkBzTabXingzhengzwDao.update(bzkBzTabXingzhengzw);
        return this.queryById(bzkBzTabXingzhengzw.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabXingzhengzwDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabXingzhengzwDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabXingzhengzw> page(PageForm<BzkBzTabXingzhengzw> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabXingzhengzw> entityList = this.bzkBzTabXingzhengzwDao.queryPageBzkBzTabXingzhengzwList(pq);
        Page<BzkBzTabXingzhengzw> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}