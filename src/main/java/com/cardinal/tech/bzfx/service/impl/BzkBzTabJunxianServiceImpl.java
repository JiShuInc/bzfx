package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabJunxian;
import com.cardinal.tech.bzfx.dao.BzkBzTabJunxianDao;
import com.cardinal.tech.bzfx.service.BzkBzTabJunxianService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 军衔(BzkBzTabJunxian)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@Service("bzkBzTabJunxianService")
public class BzkBzTabJunxianServiceImpl implements BzkBzTabJunxianService {

    private final BzkBzTabJunxianDao bzkBzTabJunxianDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabJunxian queryById(String id) {
        return this.bzkBzTabJunxianDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabJunxian> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabJunxianDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabJunxian 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabJunxian insert(BzkBzTabJunxian bzkBzTabJunxian) {
        this.bzkBzTabJunxianDao.insert(bzkBzTabJunxian);
        return bzkBzTabJunxian;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabJunxian 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabJunxian update(BzkBzTabJunxian bzkBzTabJunxian) {
        this.bzkBzTabJunxianDao.update(bzkBzTabJunxian);
        return this.queryById(bzkBzTabJunxian.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabJunxianDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabJunxianDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabJunxian> page(PageForm<BzkBzTabJunxian> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabJunxian> entityList = this.bzkBzTabJunxianDao.queryPageBzkBzTabJunxianList(pq);
        Page<BzkBzTabJunxian> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}