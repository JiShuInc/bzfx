package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabDiaodongcz;
import com.cardinal.tech.bzfx.dao.BzkBzTabDiaodongczDao;
import com.cardinal.tech.bzfx.service.BzkBzTabDiaodongczService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 调动操作(BzkBzTabDiaodongcz)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
@RequiredArgsConstructor
@Service("bzkBzTabDiaodongczService")
public class BzkBzTabDiaodongczServiceImpl implements BzkBzTabDiaodongczService {

    private final BzkBzTabDiaodongczDao bzkBzTabDiaodongczDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabDiaodongcz queryById(String id) {
        return this.bzkBzTabDiaodongczDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabDiaodongcz> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabDiaodongczDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabDiaodongcz 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabDiaodongcz insert(BzkBzTabDiaodongcz bzkBzTabDiaodongcz) {
        this.bzkBzTabDiaodongczDao.insert(bzkBzTabDiaodongcz);
        return bzkBzTabDiaodongcz;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabDiaodongcz 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabDiaodongcz update(BzkBzTabDiaodongcz bzkBzTabDiaodongcz) {
        this.bzkBzTabDiaodongczDao.update(bzkBzTabDiaodongcz);
        return this.queryById(bzkBzTabDiaodongcz.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabDiaodongczDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabDiaodongczDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabDiaodongcz> page(PageForm<BzkBzTabDiaodongcz> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabDiaodongcz> entityList = this.bzkBzTabDiaodongczDao.queryPageBzkBzTabDiaodongczList(pq);
        Page<BzkBzTabDiaodongcz> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}