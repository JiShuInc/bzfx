package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabKaohejg;
import com.cardinal.tech.bzfx.dao.BzkBzTabKaohejgDao;
import com.cardinal.tech.bzfx.service.BzkBzTabKaohejgService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 考核结果标准编码(BzkBzTabKaohejg)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@Service("bzkBzTabKaohejgService")
public class BzkBzTabKaohejgServiceImpl implements BzkBzTabKaohejgService {

    private final BzkBzTabKaohejgDao bzkBzTabKaohejgDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabKaohejg queryById(String id) {
        return this.bzkBzTabKaohejgDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabKaohejg> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabKaohejgDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabKaohejg 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabKaohejg insert(BzkBzTabKaohejg bzkBzTabKaohejg) {
        this.bzkBzTabKaohejgDao.insert(bzkBzTabKaohejg);
        return bzkBzTabKaohejg;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabKaohejg 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabKaohejg update(BzkBzTabKaohejg bzkBzTabKaohejg) {
        this.bzkBzTabKaohejgDao.update(bzkBzTabKaohejg);
        return this.queryById(bzkBzTabKaohejg.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabKaohejgDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabKaohejgDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabKaohejg> page(PageForm<BzkBzTabKaohejg> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabKaohejg> entityList = this.bzkBzTabKaohejgDao.queryPageBzkBzTabKaohejgList(pq);
        Page<BzkBzTabKaohejg> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}