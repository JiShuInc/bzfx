package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabXiashujcyljg;
import com.cardinal.tech.bzfx.dao.BzkBzTabXiashujcyljgDao;
import com.cardinal.tech.bzfx.service.BzkBzTabXiashujcyljgService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 基层医疗机构表(BzkBzTabXiashujcyljg)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@Service("bzkBzTabXiashujcyljgService")
public class BzkBzTabXiashujcyljgServiceImpl implements BzkBzTabXiashujcyljgService {

    private final BzkBzTabXiashujcyljgDao bzkBzTabXiashujcyljgDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabXiashujcyljg queryById(String id) {
        return this.bzkBzTabXiashujcyljgDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabXiashujcyljg> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabXiashujcyljgDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabXiashujcyljg 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabXiashujcyljg insert(BzkBzTabXiashujcyljg bzkBzTabXiashujcyljg) {
        this.bzkBzTabXiashujcyljgDao.insert(bzkBzTabXiashujcyljg);
        return bzkBzTabXiashujcyljg;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabXiashujcyljg 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabXiashujcyljg update(BzkBzTabXiashujcyljg bzkBzTabXiashujcyljg) {
        this.bzkBzTabXiashujcyljgDao.update(bzkBzTabXiashujcyljg);
        return this.queryById(bzkBzTabXiashujcyljg.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabXiashujcyljgDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabXiashujcyljgDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabXiashujcyljg> page(PageForm<BzkBzTabXiashujcyljg> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabXiashujcyljg> entityList = this.bzkBzTabXiashujcyljgDao.queryPageBzkBzTabXiashujcyljgList(pq);
        Page<BzkBzTabXiashujcyljg> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}