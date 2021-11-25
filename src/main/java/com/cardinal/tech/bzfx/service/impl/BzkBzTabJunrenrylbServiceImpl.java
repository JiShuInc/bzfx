package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabJunrenrylb;
import com.cardinal.tech.bzfx.dao.BzkBzTabJunrenrylbDao;
import com.cardinal.tech.bzfx.service.BzkBzTabJunrenrylbService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 军人人员类别(BzkBzTabJunrenrylb)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@Service("bzkBzTabJunrenrylbService")
public class BzkBzTabJunrenrylbServiceImpl implements BzkBzTabJunrenrylbService {

    private final BzkBzTabJunrenrylbDao bzkBzTabJunrenrylbDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabJunrenrylb queryById(String id) {
        return this.bzkBzTabJunrenrylbDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabJunrenrylb> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabJunrenrylbDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabJunrenrylb 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabJunrenrylb insert(BzkBzTabJunrenrylb bzkBzTabJunrenrylb) {
        this.bzkBzTabJunrenrylbDao.insert(bzkBzTabJunrenrylb);
        return bzkBzTabJunrenrylb;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabJunrenrylb 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabJunrenrylb update(BzkBzTabJunrenrylb bzkBzTabJunrenrylb) {
        this.bzkBzTabJunrenrylbDao.update(bzkBzTabJunrenrylb);
        return this.queryById(bzkBzTabJunrenrylb.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabJunrenrylbDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabJunrenrylbDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabJunrenrylb> page(PageForm<BzkBzTabJunrenrylb> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabJunrenrylb> entityList = this.bzkBzTabJunrenrylbDao.queryPageBzkBzTabJunrenrylbList(pq);
        Page<BzkBzTabJunrenrylb> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}