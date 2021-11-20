package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkTabBaozhangkjbxx;
import com.cardinal.tech.bzfx.dao.BzkTabBaozhangkjbxxDao;
import com.cardinal.tech.bzfx.service.BzkTabBaozhangkjbxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 保障卡基本信息(BzkTabBaozhangkjbxx)表服务实现类
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
@RequiredArgsConstructor
@Service("bzkTabBaozhangkjbxxService")
public class BzkTabBaozhangkjbxxServiceImpl implements BzkTabBaozhangkjbxxService {

    private final BzkTabBaozhangkjbxxDao bzkTabBaozhangkjbxxDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkTabBaozhangkjbxx queryById(String id) {
        return this.bzkTabBaozhangkjbxxDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkTabBaozhangkjbxx> queryAllByLimit(int offset, int limit) {
        return this.bzkTabBaozhangkjbxxDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkTabBaozhangkjbxx 实例对象
     * @return 实例对象
     */
    @Override
    public BzkTabBaozhangkjbxx insert(BzkTabBaozhangkjbxx bzkTabBaozhangkjbxx) {
        this.bzkTabBaozhangkjbxxDao.insert(bzkTabBaozhangkjbxx);
        return bzkTabBaozhangkjbxx;
    }

    /**
     * 修改数据
     *
     * @param bzkTabBaozhangkjbxx 实例对象
     * @return 实例对象
     */
    @Override
    public BzkTabBaozhangkjbxx update(BzkTabBaozhangkjbxx bzkTabBaozhangkjbxx) {
        this.bzkTabBaozhangkjbxxDao.update(bzkTabBaozhangkjbxx);
        return this.queryById(bzkTabBaozhangkjbxx.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkTabBaozhangkjbxxDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkTabBaozhangkjbxxDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkTabBaozhangkjbxx> page(PageForm<BzkTabBaozhangkjbxx> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkTabBaozhangkjbxx> entityList = this.bzkTabBaozhangkjbxxDao.queryPageBzkTabBaozhangkjbxxList(pq);
        Page<BzkTabBaozhangkjbxx> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}