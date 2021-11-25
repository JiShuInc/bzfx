package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabGuominshi;
import com.cardinal.tech.bzfx.dao.BzkBzTabGuominshiDao;
import com.cardinal.tech.bzfx.service.BzkBzTabGuominshiService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 过敏史字典表(BzkBzTabGuominshi)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
@RequiredArgsConstructor
@Service("bzkBzTabGuominshiService")
public class BzkBzTabGuominshiServiceImpl implements BzkBzTabGuominshiService {

    private final BzkBzTabGuominshiDao bzkBzTabGuominshiDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabGuominshi queryById(String id) {
        return this.bzkBzTabGuominshiDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabGuominshi> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabGuominshiDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabGuominshi 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabGuominshi insert(BzkBzTabGuominshi bzkBzTabGuominshi) {
        this.bzkBzTabGuominshiDao.insert(bzkBzTabGuominshi);
        return bzkBzTabGuominshi;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabGuominshi 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabGuominshi update(BzkBzTabGuominshi bzkBzTabGuominshi) {
        this.bzkBzTabGuominshiDao.update(bzkBzTabGuominshi);
        return this.queryById(bzkBzTabGuominshi.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabGuominshiDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabGuominshiDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabGuominshi> page(PageForm<BzkBzTabGuominshi> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabGuominshi> entityList = this.bzkBzTabGuominshiDao.queryPageBzkBzTabGuominshiList(pq);
        Page<BzkBzTabGuominshi> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}