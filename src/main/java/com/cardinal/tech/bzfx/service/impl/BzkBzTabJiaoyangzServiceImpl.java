package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabJiaoyangz;
import com.cardinal.tech.bzfx.dao.BzkBzTabJiaoyangzDao;
import com.cardinal.tech.bzfx.service.BzkBzTabJiaoyangzService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 质量分析校验规则字典表(BzkBzTabJiaoyangz)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@Service("bzkBzTabJiaoyangzService")
public class BzkBzTabJiaoyangzServiceImpl implements BzkBzTabJiaoyangzService {

    private final BzkBzTabJiaoyangzDao bzkBzTabJiaoyangzDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabJiaoyangz queryById(String id) {
        return this.bzkBzTabJiaoyangzDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabJiaoyangz> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabJiaoyangzDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabJiaoyangz 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabJiaoyangz insert(BzkBzTabJiaoyangz bzkBzTabJiaoyangz) {
        this.bzkBzTabJiaoyangzDao.insert(bzkBzTabJiaoyangz);
        return bzkBzTabJiaoyangz;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabJiaoyangz 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabJiaoyangz update(BzkBzTabJiaoyangz bzkBzTabJiaoyangz) {
        this.bzkBzTabJiaoyangzDao.update(bzkBzTabJiaoyangz);
        return this.queryById(bzkBzTabJiaoyangz.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabJiaoyangzDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabJiaoyangzDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabJiaoyangz> page(PageForm<BzkBzTabJiaoyangz> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabJiaoyangz> entityList = this.bzkBzTabJiaoyangzDao.queryPageBzkBzTabJiaoyangzList(pq);
        Page<BzkBzTabJiaoyangz> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}