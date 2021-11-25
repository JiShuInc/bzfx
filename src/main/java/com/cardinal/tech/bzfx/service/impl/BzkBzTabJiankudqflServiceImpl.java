package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabJiankudqfl;
import com.cardinal.tech.bzfx.dao.BzkBzTabJiankudqflDao;
import com.cardinal.tech.bzfx.service.BzkBzTabJiankudqflService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 艰苦地区分类(BzkBzTabJiankudqfl)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@Service("bzkBzTabJiankudqflService")
public class BzkBzTabJiankudqflServiceImpl implements BzkBzTabJiankudqflService {

    private final BzkBzTabJiankudqflDao bzkBzTabJiankudqflDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabJiankudqfl queryById(String id) {
        return this.bzkBzTabJiankudqflDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabJiankudqfl> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabJiankudqflDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabJiankudqfl 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabJiankudqfl insert(BzkBzTabJiankudqfl bzkBzTabJiankudqfl) {
        this.bzkBzTabJiankudqflDao.insert(bzkBzTabJiankudqfl);
        return bzkBzTabJiankudqfl;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabJiankudqfl 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabJiankudqfl update(BzkBzTabJiankudqfl bzkBzTabJiankudqfl) {
        this.bzkBzTabJiankudqflDao.update(bzkBzTabJiankudqfl);
        return this.queryById(bzkBzTabJiankudqfl.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabJiankudqflDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabJiankudqflDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabJiankudqfl> page(PageForm<BzkBzTabJiankudqfl> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabJiankudqfl> entityList = this.bzkBzTabJiankudqflDao.queryPageBzkBzTabJiankudqflList(pq);
        Page<BzkBzTabJiankudqfl> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}