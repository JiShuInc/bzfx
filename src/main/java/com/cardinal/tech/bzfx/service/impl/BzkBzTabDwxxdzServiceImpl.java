package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabDwxxdz;
import com.cardinal.tech.bzfx.dao.BzkBzTabDwxxdzDao;
import com.cardinal.tech.bzfx.service.BzkBzTabDwxxdzService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 单位信息对照(BzkBzTabDwxxdz)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
@RequiredArgsConstructor
@Service("bzkBzTabDwxxdzService")
public class BzkBzTabDwxxdzServiceImpl implements BzkBzTabDwxxdzService {

    private final BzkBzTabDwxxdzDao bzkBzTabDwxxdzDao;

    /**
     * 通过ID查询单条数据
     *
     * @param danweiid 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabDwxxdz queryById(String danweiid) {
        return this.bzkBzTabDwxxdzDao.queryById(danweiid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabDwxxdz> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabDwxxdzDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabDwxxdz 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabDwxxdz insert(BzkBzTabDwxxdz bzkBzTabDwxxdz) {
        this.bzkBzTabDwxxdzDao.insert(bzkBzTabDwxxdz);
        return bzkBzTabDwxxdz;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabDwxxdz 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabDwxxdz update(BzkBzTabDwxxdz bzkBzTabDwxxdz) {
        this.bzkBzTabDwxxdzDao.update(bzkBzTabDwxxdz);
        return this.queryById(bzkBzTabDwxxdz.getDanweiid());
    }

    /**
     * 通过主键删除数据
     *
     * @param danweiid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String danweiid) {
        return this.bzkBzTabDwxxdzDao.deleteById(danweiid) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabDwxxdzDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabDwxxdz> page(PageForm<BzkBzTabDwxxdz> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabDwxxdz> entityList = this.bzkBzTabDwxxdzDao.queryPageBzkBzTabDwxxdzList(pq);
        Page<BzkBzTabDwxxdz> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}