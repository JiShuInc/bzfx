package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabWenzhiryjb;
import com.cardinal.tech.bzfx.dao.BzkBzTabWenzhiryjbDao;
import com.cardinal.tech.bzfx.service.BzkBzTabWenzhiryjbService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 文职人员级别(BzkBzTabWenzhiryjb)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@Service("bzkBzTabWenzhiryjbService")
public class BzkBzTabWenzhiryjbServiceImpl implements BzkBzTabWenzhiryjbService {

    private final BzkBzTabWenzhiryjbDao bzkBzTabWenzhiryjbDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabWenzhiryjb queryById(String id) {
        return this.bzkBzTabWenzhiryjbDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabWenzhiryjb> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabWenzhiryjbDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabWenzhiryjb 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabWenzhiryjb insert(BzkBzTabWenzhiryjb bzkBzTabWenzhiryjb) {
        this.bzkBzTabWenzhiryjbDao.insert(bzkBzTabWenzhiryjb);
        return bzkBzTabWenzhiryjb;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabWenzhiryjb 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabWenzhiryjb update(BzkBzTabWenzhiryjb bzkBzTabWenzhiryjb) {
        this.bzkBzTabWenzhiryjbDao.update(bzkBzTabWenzhiryjb);
        return this.queryById(bzkBzTabWenzhiryjb.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabWenzhiryjbDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabWenzhiryjbDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabWenzhiryjb> page(PageForm<BzkBzTabWenzhiryjb> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabWenzhiryjb> entityList = this.bzkBzTabWenzhiryjbDao.queryPageBzkBzTabWenzhiryjbList(pq);
        Page<BzkBzTabWenzhiryjb> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}