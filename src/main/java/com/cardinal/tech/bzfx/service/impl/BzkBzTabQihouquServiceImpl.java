package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabQihouqu;
import com.cardinal.tech.bzfx.dao.BzkBzTabQihouquDao;
import com.cardinal.tech.bzfx.service.BzkBzTabQihouquService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 气候区(BzkBzTabQihouqu)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:57
 */
@RequiredArgsConstructor
@Service("bzkBzTabQihouquService")
public class BzkBzTabQihouquServiceImpl implements BzkBzTabQihouquService {

    private final BzkBzTabQihouquDao bzkBzTabQihouquDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabQihouqu queryById(String id) {
        return this.bzkBzTabQihouquDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabQihouqu> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabQihouquDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabQihouqu 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabQihouqu insert(BzkBzTabQihouqu bzkBzTabQihouqu) {
        this.bzkBzTabQihouquDao.insert(bzkBzTabQihouqu);
        return bzkBzTabQihouqu;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabQihouqu 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabQihouqu update(BzkBzTabQihouqu bzkBzTabQihouqu) {
        this.bzkBzTabQihouquDao.update(bzkBzTabQihouqu);
        return this.queryById(bzkBzTabQihouqu.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabQihouquDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabQihouquDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabQihouqu> page(PageForm<BzkBzTabQihouqu> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabQihouqu> entityList = this.bzkBzTabQihouquDao.queryPageBzkBzTabQihouquList(pq);
        Page<BzkBzTabQihouqu> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}