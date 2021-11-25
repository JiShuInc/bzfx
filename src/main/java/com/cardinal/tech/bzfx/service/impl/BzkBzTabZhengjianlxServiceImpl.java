package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabZhengjianlx;
import com.cardinal.tech.bzfx.dao.BzkBzTabZhengjianlxDao;
import com.cardinal.tech.bzfx.service.BzkBzTabZhengjianlxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 证件类型(BzkBzTabZhengjianlx)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@Service("bzkBzTabZhengjianlxService")
public class BzkBzTabZhengjianlxServiceImpl implements BzkBzTabZhengjianlxService {

    private final BzkBzTabZhengjianlxDao bzkBzTabZhengjianlxDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabZhengjianlx queryById(String id) {
        return this.bzkBzTabZhengjianlxDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabZhengjianlx> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabZhengjianlxDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabZhengjianlx 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabZhengjianlx insert(BzkBzTabZhengjianlx bzkBzTabZhengjianlx) {
        this.bzkBzTabZhengjianlxDao.insert(bzkBzTabZhengjianlx);
        return bzkBzTabZhengjianlx;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabZhengjianlx 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabZhengjianlx update(BzkBzTabZhengjianlx bzkBzTabZhengjianlx) {
        this.bzkBzTabZhengjianlxDao.update(bzkBzTabZhengjianlx);
        return this.queryById(bzkBzTabZhengjianlx.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabZhengjianlxDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabZhengjianlxDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabZhengjianlx> page(PageForm<BzkBzTabZhengjianlx> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabZhengjianlx> entityList = this.bzkBzTabZhengjianlxDao.queryPageBzkBzTabZhengjianlxList(pq);
        Page<BzkBzTabZhengjianlx> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}