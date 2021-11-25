package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabBukazt;
import com.cardinal.tech.bzfx.dao.BzkBzTabBukaztDao;
import com.cardinal.tech.bzfx.service.BzkBzTabBukaztService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 补卡状态(BzkBzTabBukazt)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:53
 */
@RequiredArgsConstructor
@Service("bzkBzTabBukaztService")
public class BzkBzTabBukaztServiceImpl implements BzkBzTabBukaztService {

    private final BzkBzTabBukaztDao bzkBzTabBukaztDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabBukazt queryById(String id) {
        return this.bzkBzTabBukaztDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabBukazt> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabBukaztDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabBukazt 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabBukazt insert(BzkBzTabBukazt bzkBzTabBukazt) {
        this.bzkBzTabBukaztDao.insert(bzkBzTabBukazt);
        return bzkBzTabBukazt;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabBukazt 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabBukazt update(BzkBzTabBukazt bzkBzTabBukazt) {
        this.bzkBzTabBukaztDao.update(bzkBzTabBukazt);
        return this.queryById(bzkBzTabBukazt.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabBukaztDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabBukaztDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabBukazt> page(PageForm<BzkBzTabBukazt> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabBukazt> entityList = this.bzkBzTabBukaztDao.queryPageBzkBzTabBukaztList(pq);
        Page<BzkBzTabBukazt> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}