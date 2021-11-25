package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabJingjizk;
import com.cardinal.tech.bzfx.dao.BzkBzTabJingjizkDao;
import com.cardinal.tech.bzfx.service.BzkBzTabJingjizkService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 经济状况(BzkBzTabJingjizk)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@Service("bzkBzTabJingjizkService")
public class BzkBzTabJingjizkServiceImpl implements BzkBzTabJingjizkService {

    private final BzkBzTabJingjizkDao bzkBzTabJingjizkDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabJingjizk queryById(String id) {
        return this.bzkBzTabJingjizkDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabJingjizk> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabJingjizkDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabJingjizk 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabJingjizk insert(BzkBzTabJingjizk bzkBzTabJingjizk) {
        this.bzkBzTabJingjizkDao.insert(bzkBzTabJingjizk);
        return bzkBzTabJingjizk;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabJingjizk 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabJingjizk update(BzkBzTabJingjizk bzkBzTabJingjizk) {
        this.bzkBzTabJingjizkDao.update(bzkBzTabJingjizk);
        return this.queryById(bzkBzTabJingjizk.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabJingjizkDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabJingjizkDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabJingjizk> page(PageForm<BzkBzTabJingjizk> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabJingjizk> entityList = this.bzkBzTabJingjizkDao.queryPageBzkBzTabJingjizkList(pq);
        Page<BzkBzTabJingjizk> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}