package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabShenhejg;
import com.cardinal.tech.bzfx.dao.BzkBzTabShenhejgDao;
import com.cardinal.tech.bzfx.service.BzkBzTabShenhejgService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 审核结果(BzkBzTabShenhejg)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@Service("bzkBzTabShenhejgService")
public class BzkBzTabShenhejgServiceImpl implements BzkBzTabShenhejgService {

    private final BzkBzTabShenhejgDao bzkBzTabShenhejgDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabShenhejg queryById(String id) {
        return this.bzkBzTabShenhejgDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabShenhejg> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabShenhejgDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabShenhejg 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabShenhejg insert(BzkBzTabShenhejg bzkBzTabShenhejg) {
        this.bzkBzTabShenhejgDao.insert(bzkBzTabShenhejg);
        return bzkBzTabShenhejg;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabShenhejg 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabShenhejg update(BzkBzTabShenhejg bzkBzTabShenhejg) {
        this.bzkBzTabShenhejgDao.update(bzkBzTabShenhejg);
        return this.queryById(bzkBzTabShenhejg.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabShenhejgDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabShenhejgDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabShenhejg> page(PageForm<BzkBzTabShenhejg> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabShenhejg> entityList = this.bzkBzTabShenhejgDao.queryPageBzkBzTabShenhejgList(pq);
        Page<BzkBzTabShenhejg> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}