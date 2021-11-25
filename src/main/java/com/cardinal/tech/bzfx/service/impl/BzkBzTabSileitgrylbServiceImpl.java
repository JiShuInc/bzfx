package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabSileitgrylb;
import com.cardinal.tech.bzfx.dao.BzkBzTabSileitgrylbDao;
import com.cardinal.tech.bzfx.service.BzkBzTabSileitgrylbService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 四类特供人员类别(BzkBzTabSileitgrylb)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@Service("bzkBzTabSileitgrylbService")
public class BzkBzTabSileitgrylbServiceImpl implements BzkBzTabSileitgrylbService {

    private final BzkBzTabSileitgrylbDao bzkBzTabSileitgrylbDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabSileitgrylb queryById(String id) {
        return this.bzkBzTabSileitgrylbDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabSileitgrylb> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabSileitgrylbDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabSileitgrylb 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabSileitgrylb insert(BzkBzTabSileitgrylb bzkBzTabSileitgrylb) {
        this.bzkBzTabSileitgrylbDao.insert(bzkBzTabSileitgrylb);
        return bzkBzTabSileitgrylb;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabSileitgrylb 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabSileitgrylb update(BzkBzTabSileitgrylb bzkBzTabSileitgrylb) {
        this.bzkBzTabSileitgrylbDao.update(bzkBzTabSileitgrylb);
        return this.queryById(bzkBzTabSileitgrylb.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabSileitgrylbDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabSileitgrylbDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabSileitgrylb> page(PageForm<BzkBzTabSileitgrylb> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabSileitgrylb> entityList = this.bzkBzTabSileitgrylbDao.queryPageBzkBzTabSileitgrylbList(pq);
        Page<BzkBzTabSileitgrylb> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}