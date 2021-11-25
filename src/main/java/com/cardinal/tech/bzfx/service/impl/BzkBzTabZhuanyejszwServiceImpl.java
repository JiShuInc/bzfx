package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabZhuanyejszw;
import com.cardinal.tech.bzfx.dao.BzkBzTabZhuanyejszwDao;
import com.cardinal.tech.bzfx.service.BzkBzTabZhuanyejszwService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 专业技术职务(BzkBzTabZhuanyejszw)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@Service("bzkBzTabZhuanyejszwService")
public class BzkBzTabZhuanyejszwServiceImpl implements BzkBzTabZhuanyejszwService {

    private final BzkBzTabZhuanyejszwDao bzkBzTabZhuanyejszwDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabZhuanyejszw queryById(String id) {
        return this.bzkBzTabZhuanyejszwDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabZhuanyejszw> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabZhuanyejszwDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabZhuanyejszw 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabZhuanyejszw insert(BzkBzTabZhuanyejszw bzkBzTabZhuanyejszw) {
        this.bzkBzTabZhuanyejszwDao.insert(bzkBzTabZhuanyejszw);
        return bzkBzTabZhuanyejszw;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabZhuanyejszw 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabZhuanyejszw update(BzkBzTabZhuanyejszw bzkBzTabZhuanyejszw) {
        this.bzkBzTabZhuanyejszwDao.update(bzkBzTabZhuanyejszw);
        return this.queryById(bzkBzTabZhuanyejszw.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabZhuanyejszwDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabZhuanyejszwDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabZhuanyejszw> page(PageForm<BzkBzTabZhuanyejszw> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabZhuanyejszw> entityList = this.bzkBzTabZhuanyejszwDao.queryPageBzkBzTabZhuanyejszwList(pq);
        Page<BzkBzTabZhuanyejszw> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}