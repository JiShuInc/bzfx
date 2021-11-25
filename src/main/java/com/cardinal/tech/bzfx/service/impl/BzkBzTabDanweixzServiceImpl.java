package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabDanweixz;
import com.cardinal.tech.bzfx.dao.BzkBzTabDanweixzDao;
import com.cardinal.tech.bzfx.service.BzkBzTabDanweixzService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 单位性质(BzkBzTabDanweixz)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
@RequiredArgsConstructor
@Service("bzkBzTabDanweixzService")
public class BzkBzTabDanweixzServiceImpl implements BzkBzTabDanweixzService {

    private final BzkBzTabDanweixzDao bzkBzTabDanweixzDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabDanweixz queryById(String id) {
        return this.bzkBzTabDanweixzDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabDanweixz> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabDanweixzDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabDanweixz 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabDanweixz insert(BzkBzTabDanweixz bzkBzTabDanweixz) {
        this.bzkBzTabDanweixzDao.insert(bzkBzTabDanweixz);
        return bzkBzTabDanweixz;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabDanweixz 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabDanweixz update(BzkBzTabDanweixz bzkBzTabDanweixz) {
        this.bzkBzTabDanweixzDao.update(bzkBzTabDanweixz);
        return this.queryById(bzkBzTabDanweixz.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabDanweixzDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabDanweixzDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabDanweixz> page(PageForm<BzkBzTabDanweixz> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabDanweixz> entityList = this.bzkBzTabDanweixzDao.queryPageBzkBzTabDanweixzList(pq);
        Page<BzkBzTabDanweixz> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}