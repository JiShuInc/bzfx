package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabGongyingxz;
import com.cardinal.tech.bzfx.dao.BzkBzTabGongyingxzDao;
import com.cardinal.tech.bzfx.service.BzkBzTabGongyingxzService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 供应性质(BzkBzTabGongyingxz)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
@RequiredArgsConstructor
@Service("bzkBzTabGongyingxzService")
public class BzkBzTabGongyingxzServiceImpl implements BzkBzTabGongyingxzService {

    private final BzkBzTabGongyingxzDao bzkBzTabGongyingxzDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabGongyingxz queryById(String id) {
        return this.bzkBzTabGongyingxzDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabGongyingxz> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabGongyingxzDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabGongyingxz 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabGongyingxz insert(BzkBzTabGongyingxz bzkBzTabGongyingxz) {
        this.bzkBzTabGongyingxzDao.insert(bzkBzTabGongyingxz);
        return bzkBzTabGongyingxz;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabGongyingxz 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabGongyingxz update(BzkBzTabGongyingxz bzkBzTabGongyingxz) {
        this.bzkBzTabGongyingxzDao.update(bzkBzTabGongyingxz);
        return this.queryById(bzkBzTabGongyingxz.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabGongyingxzDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabGongyingxzDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabGongyingxz> page(PageForm<BzkBzTabGongyingxz> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabGongyingxz> entityList = this.bzkBzTabGongyingxzDao.queryPageBzkBzTabGongyingxzList(pq);
        Page<BzkBzTabGongyingxz> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}