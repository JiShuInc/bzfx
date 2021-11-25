package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabLianqingx;
import com.cardinal.tech.bzfx.dao.BzkBzTabLianqingxDao;
import com.cardinal.tech.bzfx.service.BzkBzTabLianqingxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 联勤关系(BzkBzTabLianqingx)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@Service("bzkBzTabLianqingxService")
public class BzkBzTabLianqingxServiceImpl implements BzkBzTabLianqingxService {

    private final BzkBzTabLianqingxDao bzkBzTabLianqingxDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabLianqingx queryById(String id) {
        return this.bzkBzTabLianqingxDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabLianqingx> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabLianqingxDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabLianqingx 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabLianqingx insert(BzkBzTabLianqingx bzkBzTabLianqingx) {
        this.bzkBzTabLianqingxDao.insert(bzkBzTabLianqingx);
        return bzkBzTabLianqingx;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabLianqingx 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabLianqingx update(BzkBzTabLianqingx bzkBzTabLianqingx) {
        this.bzkBzTabLianqingxDao.update(bzkBzTabLianqingx);
        return this.queryById(bzkBzTabLianqingx.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabLianqingxDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabLianqingxDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabLianqingx> page(PageForm<BzkBzTabLianqingx> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabLianqingx> entityList = this.bzkBzTabLianqingxDao.queryPageBzkBzTabLianqingxList(pq);
        Page<BzkBzTabLianqingx> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}