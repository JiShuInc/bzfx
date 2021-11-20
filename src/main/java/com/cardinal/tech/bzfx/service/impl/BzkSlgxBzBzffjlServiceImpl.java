package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkSlgxBzBzffjl;
import com.cardinal.tech.bzfx.dao.BzkSlgxBzBzffjlDao;
import com.cardinal.tech.bzfx.service.BzkSlgxBzBzffjlService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 被装发放记录(BzkSlgxBzBzffjl)表服务实现类
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
@RequiredArgsConstructor
@Service("bzkSlgxBzBzffjlService")
public class BzkSlgxBzBzffjlServiceImpl implements BzkSlgxBzBzffjlService {

    private final BzkSlgxBzBzffjlDao bzkSlgxBzBzffjlDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkSlgxBzBzffjl queryById(String id) {
        return this.bzkSlgxBzBzffjlDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkSlgxBzBzffjl> queryAllByLimit(int offset, int limit) {
        return this.bzkSlgxBzBzffjlDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkSlgxBzBzffjl 实例对象
     * @return 实例对象
     */
    @Override
    public BzkSlgxBzBzffjl insert(BzkSlgxBzBzffjl bzkSlgxBzBzffjl) {
        this.bzkSlgxBzBzffjlDao.insert(bzkSlgxBzBzffjl);
        return bzkSlgxBzBzffjl;
    }

    /**
     * 修改数据
     *
     * @param bzkSlgxBzBzffjl 实例对象
     * @return 实例对象
     */
    @Override
    public BzkSlgxBzBzffjl update(BzkSlgxBzBzffjl bzkSlgxBzBzffjl) {
        this.bzkSlgxBzBzffjlDao.update(bzkSlgxBzBzffjl);
        return this.queryById(bzkSlgxBzBzffjl.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkSlgxBzBzffjlDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkSlgxBzBzffjlDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkSlgxBzBzffjl> page(PageForm<BzkSlgxBzBzffjl> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkSlgxBzBzffjl> entityList = this.bzkSlgxBzBzffjlDao.queryPageBzkSlgxBzBzffjlList(pq);
        Page<BzkSlgxBzBzffjl> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}