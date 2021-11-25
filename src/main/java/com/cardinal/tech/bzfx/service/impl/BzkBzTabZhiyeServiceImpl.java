package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabZhiye;
import com.cardinal.tech.bzfx.dao.BzkBzTabZhiyeDao;
import com.cardinal.tech.bzfx.service.BzkBzTabZhiyeService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 职业(BzkBzTabZhiye)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@Service("bzkBzTabZhiyeService")
public class BzkBzTabZhiyeServiceImpl implements BzkBzTabZhiyeService {

    private final BzkBzTabZhiyeDao bzkBzTabZhiyeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabZhiye queryById(String id) {
        return this.bzkBzTabZhiyeDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabZhiye> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabZhiyeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabZhiye 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabZhiye insert(BzkBzTabZhiye bzkBzTabZhiye) {
        this.bzkBzTabZhiyeDao.insert(bzkBzTabZhiye);
        return bzkBzTabZhiye;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabZhiye 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabZhiye update(BzkBzTabZhiye bzkBzTabZhiye) {
        this.bzkBzTabZhiyeDao.update(bzkBzTabZhiye);
        return this.queryById(bzkBzTabZhiye.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabZhiyeDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabZhiyeDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabZhiye> page(PageForm<BzkBzTabZhiye> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabZhiye> entityList = this.bzkBzTabZhiyeDao.queryPageBzkBzTabZhiyeList(pq);
        Page<BzkBzTabZhiye> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}