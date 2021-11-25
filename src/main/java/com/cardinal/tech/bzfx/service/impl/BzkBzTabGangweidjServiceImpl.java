package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabGangweidj;
import com.cardinal.tech.bzfx.dao.BzkBzTabGangweidjDao;
import com.cardinal.tech.bzfx.service.BzkBzTabGangweidjService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 岗位等级标准编码(BzkBzTabGangweidj)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
@RequiredArgsConstructor
@Service("bzkBzTabGangweidjService")
public class BzkBzTabGangweidjServiceImpl implements BzkBzTabGangweidjService {

    private final BzkBzTabGangweidjDao bzkBzTabGangweidjDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabGangweidj queryById(String id) {
        return this.bzkBzTabGangweidjDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabGangweidj> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabGangweidjDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabGangweidj 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabGangweidj insert(BzkBzTabGangweidj bzkBzTabGangweidj) {
        this.bzkBzTabGangweidjDao.insert(bzkBzTabGangweidj);
        return bzkBzTabGangweidj;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabGangweidj 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabGangweidj update(BzkBzTabGangweidj bzkBzTabGangweidj) {
        this.bzkBzTabGangweidjDao.update(bzkBzTabGangweidj);
        return this.queryById(bzkBzTabGangweidj.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabGangweidjDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabGangweidjDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabGangweidj> page(PageForm<BzkBzTabGangweidj> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabGangweidj> entityList = this.bzkBzTabGangweidjDao.queryPageBzkBzTabGangweidjList(pq);
        Page<BzkBzTabGangweidj> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}