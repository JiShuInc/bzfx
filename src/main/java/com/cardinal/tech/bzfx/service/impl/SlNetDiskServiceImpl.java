package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.SlNetDisk;
import com.cardinal.tech.bzfx.dao.SlNetDiskDao;
import com.cardinal.tech.bzfx.service.SlNetDiskService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 文档资料(SlNetDisk)表服务实现类
 *
 * @author cadinal.tech
 * @since 2021-11-13 01:33:38
 */
@RequiredArgsConstructor
@Service("slNetDiskService")
public class SlNetDiskServiceImpl implements SlNetDiskService {

    private final SlNetDiskDao slNetDiskDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SlNetDisk queryById(Long id) {
        return this.slNetDiskDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SlNetDisk> queryAllByLimit(int offset, int limit) {
        return this.slNetDiskDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param slNetDisk 实例对象
     * @return 实例对象
     */
    @Override
    public SlNetDisk insert(SlNetDisk slNetDisk) {
        this.slNetDiskDao.insert(slNetDisk);
        return slNetDisk;
    }

    /**
     * 修改数据
     *
     * @param slNetDisk 实例对象
     * @return 实例对象
     */
    @Override
    public SlNetDisk update(SlNetDisk slNetDisk) {
        this.slNetDiskDao.update(slNetDisk);
        return this.queryById(slNetDisk.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.slNetDiskDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.slNetDiskDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<SlNetDisk> page(PageForm<SlNetDisk> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<SlNetDisk> entityList = this.slNetDiskDao.queryPageSlNetDiskList(pq);
        Page<SlNetDisk> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}