package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabZhuxiaoyy;
import com.cardinal.tech.bzfx.dao.BzkBzTabZhuxiaoyyDao;
import com.cardinal.tech.bzfx.service.BzkBzTabZhuxiaoyyService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 注销原因(BzkBzTabZhuxiaoyy)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:59
 */
@RequiredArgsConstructor
@Service("bzkBzTabZhuxiaoyyService")
public class BzkBzTabZhuxiaoyyServiceImpl implements BzkBzTabZhuxiaoyyService {

    private final BzkBzTabZhuxiaoyyDao bzkBzTabZhuxiaoyyDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabZhuxiaoyy queryById(String id) {
        return this.bzkBzTabZhuxiaoyyDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabZhuxiaoyy> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabZhuxiaoyyDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabZhuxiaoyy 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabZhuxiaoyy insert(BzkBzTabZhuxiaoyy bzkBzTabZhuxiaoyy) {
        this.bzkBzTabZhuxiaoyyDao.insert(bzkBzTabZhuxiaoyy);
        return bzkBzTabZhuxiaoyy;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabZhuxiaoyy 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabZhuxiaoyy update(BzkBzTabZhuxiaoyy bzkBzTabZhuxiaoyy) {
        this.bzkBzTabZhuxiaoyyDao.update(bzkBzTabZhuxiaoyy);
        return this.queryById(bzkBzTabZhuxiaoyy.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabZhuxiaoyyDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabZhuxiaoyyDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabZhuxiaoyy> page(PageForm<BzkBzTabZhuxiaoyy> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabZhuxiaoyy> entityList = this.bzkBzTabZhuxiaoyyDao.queryPageBzkBzTabZhuxiaoyyList(pq);
        Page<BzkBzTabZhuxiaoyy> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}