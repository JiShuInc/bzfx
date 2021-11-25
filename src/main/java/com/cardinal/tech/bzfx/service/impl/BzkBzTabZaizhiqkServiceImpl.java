package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabZaizhiqk;
import com.cardinal.tech.bzfx.dao.BzkBzTabZaizhiqkDao;
import com.cardinal.tech.bzfx.service.BzkBzTabZaizhiqkService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 在职情况标准表(BzkBzTabZaizhiqk)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@Service("bzkBzTabZaizhiqkService")
public class BzkBzTabZaizhiqkServiceImpl implements BzkBzTabZaizhiqkService {

    private final BzkBzTabZaizhiqkDao bzkBzTabZaizhiqkDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabZaizhiqk queryById(String id) {
        return this.bzkBzTabZaizhiqkDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabZaizhiqk> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabZaizhiqkDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabZaizhiqk 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabZaizhiqk insert(BzkBzTabZaizhiqk bzkBzTabZaizhiqk) {
        this.bzkBzTabZaizhiqkDao.insert(bzkBzTabZaizhiqk);
        return bzkBzTabZaizhiqk;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabZaizhiqk 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabZaizhiqk update(BzkBzTabZaizhiqk bzkBzTabZaizhiqk) {
        this.bzkBzTabZaizhiqkDao.update(bzkBzTabZaizhiqk);
        return this.queryById(bzkBzTabZaizhiqk.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabZaizhiqkDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabZaizhiqkDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabZaizhiqk> page(PageForm<BzkBzTabZaizhiqk> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabZaizhiqk> entityList = this.bzkBzTabZaizhiqkDao.queryPageBzkBzTabZaizhiqkList(pq);
        Page<BzkBzTabZaizhiqk> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}