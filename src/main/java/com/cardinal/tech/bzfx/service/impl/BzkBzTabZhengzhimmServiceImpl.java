package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabZhengzhimm;
import com.cardinal.tech.bzfx.dao.BzkBzTabZhengzhimmDao;
import com.cardinal.tech.bzfx.service.BzkBzTabZhengzhimmService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 政治面貌(BzkBzTabZhengzhimm)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@Service("bzkBzTabZhengzhimmService")
public class BzkBzTabZhengzhimmServiceImpl implements BzkBzTabZhengzhimmService {

    private final BzkBzTabZhengzhimmDao bzkBzTabZhengzhimmDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabZhengzhimm queryById(String id) {
        return this.bzkBzTabZhengzhimmDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabZhengzhimm> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabZhengzhimmDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabZhengzhimm 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabZhengzhimm insert(BzkBzTabZhengzhimm bzkBzTabZhengzhimm) {
        this.bzkBzTabZhengzhimmDao.insert(bzkBzTabZhengzhimm);
        return bzkBzTabZhengzhimm;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabZhengzhimm 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabZhengzhimm update(BzkBzTabZhengzhimm bzkBzTabZhengzhimm) {
        this.bzkBzTabZhengzhimmDao.update(bzkBzTabZhengzhimm);
        return this.queryById(bzkBzTabZhengzhimm.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabZhengzhimmDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabZhengzhimmDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabZhengzhimm> page(PageForm<BzkBzTabZhengzhimm> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabZhengzhimm> entityList = this.bzkBzTabZhengzhimmDao.queryPageBzkBzTabZhengzhimmList(pq);
        Page<BzkBzTabZhengzhimm> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}