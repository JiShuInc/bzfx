package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabGerenzt;
import com.cardinal.tech.bzfx.dao.BzkBzTabGerenztDao;
import com.cardinal.tech.bzfx.service.BzkBzTabGerenztService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 个人状态(BzkBzTabGerenzt)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
@RequiredArgsConstructor
@Service("bzkBzTabGerenztService")
public class BzkBzTabGerenztServiceImpl implements BzkBzTabGerenztService {

    private final BzkBzTabGerenztDao bzkBzTabGerenztDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabGerenzt queryById(String id) {
        return this.bzkBzTabGerenztDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabGerenzt> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabGerenztDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabGerenzt 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabGerenzt insert(BzkBzTabGerenzt bzkBzTabGerenzt) {
        this.bzkBzTabGerenztDao.insert(bzkBzTabGerenzt);
        return bzkBzTabGerenzt;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabGerenzt 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabGerenzt update(BzkBzTabGerenzt bzkBzTabGerenzt) {
        this.bzkBzTabGerenztDao.update(bzkBzTabGerenzt);
        return this.queryById(bzkBzTabGerenzt.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabGerenztDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabGerenztDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabGerenzt> page(PageForm<BzkBzTabGerenzt> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabGerenzt> entityList = this.bzkBzTabGerenztDao.queryPageBzkBzTabGerenztList(pq);
        Page<BzkBzTabGerenzt> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}