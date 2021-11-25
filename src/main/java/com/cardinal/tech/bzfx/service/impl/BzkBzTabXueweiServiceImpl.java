package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabXuewei;
import com.cardinal.tech.bzfx.dao.BzkBzTabXueweiDao;
import com.cardinal.tech.bzfx.service.BzkBzTabXueweiService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 学位(BzkBzTabXuewei)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@Service("bzkBzTabXueweiService")
public class BzkBzTabXueweiServiceImpl implements BzkBzTabXueweiService {

    private final BzkBzTabXueweiDao bzkBzTabXueweiDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabXuewei queryById(String id) {
        return this.bzkBzTabXueweiDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabXuewei> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabXueweiDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabXuewei 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabXuewei insert(BzkBzTabXuewei bzkBzTabXuewei) {
        this.bzkBzTabXueweiDao.insert(bzkBzTabXuewei);
        return bzkBzTabXuewei;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabXuewei 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabXuewei update(BzkBzTabXuewei bzkBzTabXuewei) {
        this.bzkBzTabXueweiDao.update(bzkBzTabXuewei);
        return this.queryById(bzkBzTabXuewei.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabXueweiDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabXueweiDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabXuewei> page(PageForm<BzkBzTabXuewei> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabXuewei> entityList = this.bzkBzTabXueweiDao.queryPageBzkBzTabXueweiList(pq);
        Page<BzkBzTabXuewei> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}