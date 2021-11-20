package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkTabDanweibclrxx;
import com.cardinal.tech.bzfx.dao.BzkTabDanweibclrxxDao;
import com.cardinal.tech.bzfx.service.BzkTabDanweibclrxxService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 单位补充录入信息(BzkTabDanweibclrxx)表服务实现类
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
@RequiredArgsConstructor
@Service("bzkTabDanweibclrxxService")
public class BzkTabDanweibclrxxServiceImpl implements BzkTabDanweibclrxxService {

    private final BzkTabDanweibclrxxDao bzkTabDanweibclrxxDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkTabDanweibclrxx queryById(String id) {
        return this.bzkTabDanweibclrxxDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkTabDanweibclrxx> queryAllByLimit(int offset, int limit) {
        return this.bzkTabDanweibclrxxDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkTabDanweibclrxx 实例对象
     * @return 实例对象
     */
    @Override
    public BzkTabDanweibclrxx insert(BzkTabDanweibclrxx bzkTabDanweibclrxx) {
        this.bzkTabDanweibclrxxDao.insert(bzkTabDanweibclrxx);
        return bzkTabDanweibclrxx;
    }

    /**
     * 修改数据
     *
     * @param bzkTabDanweibclrxx 实例对象
     * @return 实例对象
     */
    @Override
    public BzkTabDanweibclrxx update(BzkTabDanweibclrxx bzkTabDanweibclrxx) {
        this.bzkTabDanweibclrxxDao.update(bzkTabDanweibclrxx);
        return this.queryById(bzkTabDanweibclrxx.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkTabDanweibclrxxDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkTabDanweibclrxxDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkTabDanweibclrxx> page(PageForm<BzkTabDanweibclrxx> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkTabDanweibclrxx> entityList = this.bzkTabDanweibclrxxDao.queryPageBzkTabDanweibclrxxList(pq);
        Page<BzkTabDanweibclrxx> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}