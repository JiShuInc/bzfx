package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabJicengyljgdy;
import com.cardinal.tech.bzfx.dao.BzkBzTabJicengyljgdyDao;
import com.cardinal.tech.bzfx.service.BzkBzTabJicengyljgdyService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 体系医院对应表(BzkBzTabJicengyljgdy)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@Service("bzkBzTabJicengyljgdyService")
public class BzkBzTabJicengyljgdyServiceImpl implements BzkBzTabJicengyljgdyService {

    private final BzkBzTabJicengyljgdyDao bzkBzTabJicengyljgdyDao;

    /**
     * 通过ID查询单条数据
     *
     * @param jicengyljgdmls 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabJicengyljgdy queryById(String jicengyljgdmls) {
        return this.bzkBzTabJicengyljgdyDao.queryById(jicengyljgdmls);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabJicengyljgdy> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabJicengyljgdyDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabJicengyljgdy 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabJicengyljgdy insert(BzkBzTabJicengyljgdy bzkBzTabJicengyljgdy) {
        this.bzkBzTabJicengyljgdyDao.insert(bzkBzTabJicengyljgdy);
        return bzkBzTabJicengyljgdy;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabJicengyljgdy 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabJicengyljgdy update(BzkBzTabJicengyljgdy bzkBzTabJicengyljgdy) {
        this.bzkBzTabJicengyljgdyDao.update(bzkBzTabJicengyljgdy);
        return this.queryById(bzkBzTabJicengyljgdy.getJicengyljgdmls());
    }

    /**
     * 通过主键删除数据
     *
     * @param jicengyljgdmls 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String jicengyljgdmls) {
        return this.bzkBzTabJicengyljgdyDao.deleteById(jicengyljgdmls) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabJicengyljgdyDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabJicengyljgdy> page(PageForm<BzkBzTabJicengyljgdy> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabJicengyljgdy> entityList = this.bzkBzTabJicengyljgdyDao.queryPageBzkBzTabJicengyljgdyList(pq);
        Page<BzkBzTabJicengyljgdy> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}