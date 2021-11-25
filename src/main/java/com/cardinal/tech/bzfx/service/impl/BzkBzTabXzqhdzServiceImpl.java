package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabXzqhdz;
import com.cardinal.tech.bzfx.dao.BzkBzTabXzqhdzDao;
import com.cardinal.tech.bzfx.service.BzkBzTabXzqhdzService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 行政区划对照(BzkBzTabXzqhdz)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@Service("bzkBzTabXzqhdzService")
public class BzkBzTabXzqhdzServiceImpl implements BzkBzTabXzqhdzService {

    private final BzkBzTabXzqhdzDao bzkBzTabXzqhdzDao;

    /**
     * 通过ID查询单条数据
     *
     * @param dimingdm 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabXzqhdz queryById(String dimingdm) {
        return this.bzkBzTabXzqhdzDao.queryById(dimingdm);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabXzqhdz> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabXzqhdzDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabXzqhdz 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabXzqhdz insert(BzkBzTabXzqhdz bzkBzTabXzqhdz) {
        this.bzkBzTabXzqhdzDao.insert(bzkBzTabXzqhdz);
        return bzkBzTabXzqhdz;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabXzqhdz 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabXzqhdz update(BzkBzTabXzqhdz bzkBzTabXzqhdz) {
        this.bzkBzTabXzqhdzDao.update(bzkBzTabXzqhdz);
        return this.queryById(bzkBzTabXzqhdz.getDimingdm());
    }

    /**
     * 通过主键删除数据
     *
     * @param dimingdm 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String dimingdm) {
        return this.bzkBzTabXzqhdzDao.deleteById(dimingdm) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabXzqhdzDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabXzqhdz> page(PageForm<BzkBzTabXzqhdz> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabXzqhdz> entityList = this.bzkBzTabXzqhdzDao.queryPageBzkBzTabXzqhdzList(pq);
        Page<BzkBzTabXzqhdz> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}