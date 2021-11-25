package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabCanjiaylbx;
import com.cardinal.tech.bzfx.dao.BzkBzTabCanjiaylbxDao;
import com.cardinal.tech.bzfx.service.BzkBzTabCanjiaylbxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 参加医疗保险情况标准编码表(BzkBzTabCanjiaylbx)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
@RequiredArgsConstructor
@Service("bzkBzTabCanjiaylbxService")
public class BzkBzTabCanjiaylbxServiceImpl implements BzkBzTabCanjiaylbxService {

    private final BzkBzTabCanjiaylbxDao bzkBzTabCanjiaylbxDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabCanjiaylbx queryById(String id) {
        return this.bzkBzTabCanjiaylbxDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabCanjiaylbx> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabCanjiaylbxDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabCanjiaylbx 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabCanjiaylbx insert(BzkBzTabCanjiaylbx bzkBzTabCanjiaylbx) {
        this.bzkBzTabCanjiaylbxDao.insert(bzkBzTabCanjiaylbx);
        return bzkBzTabCanjiaylbx;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabCanjiaylbx 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabCanjiaylbx update(BzkBzTabCanjiaylbx bzkBzTabCanjiaylbx) {
        this.bzkBzTabCanjiaylbxDao.update(bzkBzTabCanjiaylbx);
        return this.queryById(bzkBzTabCanjiaylbx.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabCanjiaylbxDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabCanjiaylbxDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabCanjiaylbx> page(PageForm<BzkBzTabCanjiaylbx> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabCanjiaylbx> entityList = this.bzkBzTabCanjiaylbxDao.queryPageBzkBzTabCanjiaylbxList(pq);
        Page<BzkBzTabCanjiaylbx> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}