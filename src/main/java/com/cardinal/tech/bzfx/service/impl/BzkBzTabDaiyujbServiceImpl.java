package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabDaiyujb;
import com.cardinal.tech.bzfx.dao.BzkBzTabDaiyujbDao;
import com.cardinal.tech.bzfx.service.BzkBzTabDaiyujbService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 待遇级别标准编码(BzkBzTabDaiyujb)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
@RequiredArgsConstructor
@Service("bzkBzTabDaiyujbService")
public class BzkBzTabDaiyujbServiceImpl implements BzkBzTabDaiyujbService {

    private final BzkBzTabDaiyujbDao bzkBzTabDaiyujbDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabDaiyujb queryById(String id) {
        return this.bzkBzTabDaiyujbDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabDaiyujb> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabDaiyujbDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabDaiyujb 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabDaiyujb insert(BzkBzTabDaiyujb bzkBzTabDaiyujb) {
        this.bzkBzTabDaiyujbDao.insert(bzkBzTabDaiyujb);
        return bzkBzTabDaiyujb;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabDaiyujb 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabDaiyujb update(BzkBzTabDaiyujb bzkBzTabDaiyujb) {
        this.bzkBzTabDaiyujbDao.update(bzkBzTabDaiyujb);
        return this.queryById(bzkBzTabDaiyujb.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabDaiyujbDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabDaiyujbDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabDaiyujb> page(PageForm<BzkBzTabDaiyujb> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabDaiyujb> entityList = this.bzkBzTabDaiyujbDao.queryPageBzkBzTabDaiyujbList(pq);
        Page<BzkBzTabDaiyujb> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}