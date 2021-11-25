package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabZhuanyejsdj;
import com.cardinal.tech.bzfx.dao.BzkBzTabZhuanyejsdjDao;
import com.cardinal.tech.bzfx.service.BzkBzTabZhuanyejsdjService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 专业技术等级(BzkBzTabZhuanyejsdj)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@Service("bzkBzTabZhuanyejsdjService")
public class BzkBzTabZhuanyejsdjServiceImpl implements BzkBzTabZhuanyejsdjService {

    private final BzkBzTabZhuanyejsdjDao bzkBzTabZhuanyejsdjDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabZhuanyejsdj queryById(String id) {
        return this.bzkBzTabZhuanyejsdjDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabZhuanyejsdj> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabZhuanyejsdjDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabZhuanyejsdj 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabZhuanyejsdj insert(BzkBzTabZhuanyejsdj bzkBzTabZhuanyejsdj) {
        this.bzkBzTabZhuanyejsdjDao.insert(bzkBzTabZhuanyejsdj);
        return bzkBzTabZhuanyejsdj;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabZhuanyejsdj 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabZhuanyejsdj update(BzkBzTabZhuanyejsdj bzkBzTabZhuanyejsdj) {
        this.bzkBzTabZhuanyejsdjDao.update(bzkBzTabZhuanyejsdj);
        return this.queryById(bzkBzTabZhuanyejsdj.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabZhuanyejsdjDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabZhuanyejsdjDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabZhuanyejsdj> page(PageForm<BzkBzTabZhuanyejsdj> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabZhuanyejsdj> entityList = this.bzkBzTabZhuanyejsdjDao.queryPageBzkBzTabZhuanyejsdjList(pq);
        Page<BzkBzTabZhuanyejsdj> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}