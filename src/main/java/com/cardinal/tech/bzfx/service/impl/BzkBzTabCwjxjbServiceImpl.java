package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabCwjxjb;
import com.cardinal.tech.bzfx.dao.BzkBzTabCwjxjbDao;
import com.cardinal.tech.bzfx.service.BzkBzTabCwjxjbService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 军衔(BzkBzTabCwjxjb)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
@RequiredArgsConstructor
@Service("bzkBzTabCwjxjbService")
public class BzkBzTabCwjxjbServiceImpl implements BzkBzTabCwjxjbService {

    private final BzkBzTabCwjxjbDao bzkBzTabCwjxjbDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabCwjxjb queryById(String id) {
        return this.bzkBzTabCwjxjbDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabCwjxjb> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabCwjxjbDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabCwjxjb 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabCwjxjb insert(BzkBzTabCwjxjb bzkBzTabCwjxjb) {
        this.bzkBzTabCwjxjbDao.insert(bzkBzTabCwjxjb);
        return bzkBzTabCwjxjb;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabCwjxjb 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabCwjxjb update(BzkBzTabCwjxjb bzkBzTabCwjxjb) {
        this.bzkBzTabCwjxjbDao.update(bzkBzTabCwjxjb);
        return this.queryById(bzkBzTabCwjxjb.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabCwjxjbDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabCwjxjbDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabCwjxjb> page(PageForm<BzkBzTabCwjxjb> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabCwjxjb> entityList = this.bzkBzTabCwjxjbDao.queryPageBzkBzTabCwjxjbList(pq);
        Page<BzkBzTabCwjxjb> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}