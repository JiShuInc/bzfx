package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabHouqinbdl;
import com.cardinal.tech.bzfx.dao.BzkBzTabHouqinbdlDao;
import com.cardinal.tech.bzfx.service.BzkBzTabHouqinbdlService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 后勤部队类别(BzkBzTabHouqinbdl)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
@RequiredArgsConstructor
@Service("bzkBzTabHouqinbdlService")
public class BzkBzTabHouqinbdlServiceImpl implements BzkBzTabHouqinbdlService {

    private final BzkBzTabHouqinbdlDao bzkBzTabHouqinbdlDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabHouqinbdl queryById(String id) {
        return this.bzkBzTabHouqinbdlDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabHouqinbdl> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabHouqinbdlDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabHouqinbdl 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabHouqinbdl insert(BzkBzTabHouqinbdl bzkBzTabHouqinbdl) {
        this.bzkBzTabHouqinbdlDao.insert(bzkBzTabHouqinbdl);
        return bzkBzTabHouqinbdl;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabHouqinbdl 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabHouqinbdl update(BzkBzTabHouqinbdl bzkBzTabHouqinbdl) {
        this.bzkBzTabHouqinbdlDao.update(bzkBzTabHouqinbdl);
        return this.queryById(bzkBzTabHouqinbdl.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabHouqinbdlDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabHouqinbdlDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabHouqinbdl> page(PageForm<BzkBzTabHouqinbdl> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabHouqinbdl> entityList = this.bzkBzTabHouqinbdlDao.queryPageBzkBzTabHouqinbdlList(pq);
        Page<BzkBzTabHouqinbdl> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}