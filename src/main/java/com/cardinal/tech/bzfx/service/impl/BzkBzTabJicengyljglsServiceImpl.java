package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabJicengyljgls;
import com.cardinal.tech.bzfx.dao.BzkBzTabJicengyljglsDao;
import com.cardinal.tech.bzfx.service.BzkBzTabJicengyljglsService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 体系医院历史表(BzkBzTabJicengyljgls)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@Service("bzkBzTabJicengyljglsService")
public class BzkBzTabJicengyljglsServiceImpl implements BzkBzTabJicengyljglsService {

    private final BzkBzTabJicengyljglsDao bzkBzTabJicengyljglsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabJicengyljgls queryById(String id) {
        return this.bzkBzTabJicengyljglsDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabJicengyljgls> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabJicengyljglsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabJicengyljgls 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabJicengyljgls insert(BzkBzTabJicengyljgls bzkBzTabJicengyljgls) {
        this.bzkBzTabJicengyljglsDao.insert(bzkBzTabJicengyljgls);
        return bzkBzTabJicengyljgls;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabJicengyljgls 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabJicengyljgls update(BzkBzTabJicengyljgls bzkBzTabJicengyljgls) {
        this.bzkBzTabJicengyljglsDao.update(bzkBzTabJicengyljgls);
        return this.queryById(bzkBzTabJicengyljgls.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabJicengyljglsDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabJicengyljglsDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabJicengyljgls> page(PageForm<BzkBzTabJicengyljgls> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabJicengyljgls> entityList = this.bzkBzTabJicengyljglsDao.queryPageBzkBzTabJicengyljglsList(pq);
        Page<BzkBzTabJicengyljgls> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}