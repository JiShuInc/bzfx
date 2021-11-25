package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.BzkBzTabJicengyljg;
import com.cardinal.tech.bzfx.dao.BzkBzTabJicengyljgDao;
import com.cardinal.tech.bzfx.service.BzkBzTabJicengyljgService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 体系医院标准编码(BzkBzTabJicengyljg)表服务实现类
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@Service("bzkBzTabJicengyljgService")
public class BzkBzTabJicengyljgServiceImpl implements BzkBzTabJicengyljgService {

    private final BzkBzTabJicengyljgDao bzkBzTabJicengyljgDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BzkBzTabJicengyljg queryById(String id) {
        return this.bzkBzTabJicengyljgDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BzkBzTabJicengyljg> queryAllByLimit(int offset, int limit) {
        return this.bzkBzTabJicengyljgDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bzkBzTabJicengyljg 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabJicengyljg insert(BzkBzTabJicengyljg bzkBzTabJicengyljg) {
        this.bzkBzTabJicengyljgDao.insert(bzkBzTabJicengyljg);
        return bzkBzTabJicengyljg;
    }

    /**
     * 修改数据
     *
     * @param bzkBzTabJicengyljg 实例对象
     * @return 实例对象
     */
    @Override
    public BzkBzTabJicengyljg update(BzkBzTabJicengyljg bzkBzTabJicengyljg) {
        this.bzkBzTabJicengyljgDao.update(bzkBzTabJicengyljg);
        return this.queryById(bzkBzTabJicengyljg.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bzkBzTabJicengyljgDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.bzkBzTabJicengyljgDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<BzkBzTabJicengyljg> page(PageForm<BzkBzTabJicengyljg> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<BzkBzTabJicengyljg> entityList = this.bzkBzTabJicengyljgDao.queryPageBzkBzTabJicengyljgList(pq);
        Page<BzkBzTabJicengyljg> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}