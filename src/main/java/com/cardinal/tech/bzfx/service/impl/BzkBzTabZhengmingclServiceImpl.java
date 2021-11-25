package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabZhengmingcl;
import com.cardinal.tech.bzfx.dao.BzkBzTabZhengmingclDao;
import com.cardinal.tech.bzfx.service.BzkBzTabZhengmingclService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 证明材料(BzkBzTabZhengmingcl)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@Service("bzkBzTabZhengmingclService")
public class BzkBzTabZhengmingclServiceImpl implements BzkBzTabZhengmingclService {

    private final BzkBzTabZhengmingclDao bzkBzTabZhengmingclDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabZhengmingcl queryById(String id) {
        return this.bzkBzTabZhengmingclDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabZhengmingcl> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabZhengmingclDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabZhengmingcl 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabZhengmingcl insert(BzkBzTabZhengmingcl bzkBzTabZhengmingcl) {
        this.bzkBzTabZhengmingclDao.insert(bzkBzTabZhengmingcl);
        return bzkBzTabZhengmingcl;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabZhengmingcl 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabZhengmingcl update(BzkBzTabZhengmingcl bzkBzTabZhengmingcl) {
        this.bzkBzTabZhengmingclDao.update(bzkBzTabZhengmingcl);
        return this.queryById(bzkBzTabZhengmingcl.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabZhengmingclDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabZhengmingclDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabZhengmingcl> page(PageForm<BzkBzTabZhengmingcl> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabZhengmingcl> entityList = this.bzkBzTabZhengmingclDao.queryPageBzkBzTabZhengmingclList(pq);
        Page<BzkBzTabZhengmingcl> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}