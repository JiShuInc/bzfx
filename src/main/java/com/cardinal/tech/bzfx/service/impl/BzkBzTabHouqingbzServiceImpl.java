package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabHouqingbz;
import com.cardinal.tech.bzfx.dao.BzkBzTabHouqingbzDao;
import com.cardinal.tech.bzfx.service.BzkBzTabHouqingbzService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 后勤干部专业类别(BzkBzTabHouqingbz)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
@RequiredArgsConstructor
@Service("bzkBzTabHouqingbzService")
public class BzkBzTabHouqingbzServiceImpl implements BzkBzTabHouqingbzService {

    private final BzkBzTabHouqingbzDao bzkBzTabHouqingbzDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabHouqingbz queryById(String id) {
        return this.bzkBzTabHouqingbzDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabHouqingbz> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabHouqingbzDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabHouqingbz 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabHouqingbz insert(BzkBzTabHouqingbz bzkBzTabHouqingbz) {
        this.bzkBzTabHouqingbzDao.insert(bzkBzTabHouqingbz);
        return bzkBzTabHouqingbz;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabHouqingbz 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabHouqingbz update(BzkBzTabHouqingbz bzkBzTabHouqingbz) {
        this.bzkBzTabHouqingbzDao.update(bzkBzTabHouqingbz);
        return this.queryById(bzkBzTabHouqingbz.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabHouqingbzDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabHouqingbzDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabHouqingbz> page(PageForm<BzkBzTabHouqingbz> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabHouqingbz> entityList = this.bzkBzTabHouqingbzDao.queryPageBzkBzTabHouqingbzList(pq);
        Page<BzkBzTabHouqingbz> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}