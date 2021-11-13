package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.RhTaskFile;
import com.cardinal.tech.bzfx.dao.RhTaskFileDao;
import com.cardinal.tech.bzfx.service.RhTaskFileService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 任务数据-文件(RhTaskFile)表服务实现类
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:37
 */
@RequiredArgsConstructor
@Service("rhTaskFileService")
public class RhTaskFileServiceImpl implements RhTaskFileService {

    private final RhTaskFileDao rhTaskFileDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public RhTaskFile queryById(Long id) {
        return this.rhTaskFileDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<RhTaskFile> queryAllByLimit(int offset, int limit) {
        return this.rhTaskFileDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param rhTaskFile 实例对象
     * @return 实例对象
     */
    @Override
    public RhTaskFile insert(RhTaskFile rhTaskFile) {
        this.rhTaskFileDao.insert(rhTaskFile);
        return rhTaskFile;
    }

    /**
     * 修改数据
     *
     * @param rhTaskFile 实例对象
     * @return 实例对象
     */
    @Override
    public RhTaskFile update(RhTaskFile rhTaskFile) {
        this.rhTaskFileDao.update(rhTaskFile);
        return this.queryById(rhTaskFile.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.rhTaskFileDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.rhTaskFileDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<RhTaskFile> page(PageForm<RhTaskFile> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<RhTaskFile> entityList = this.rhTaskFileDao.queryPageRhTaskFileList(pq);
        Page<RhTaskFile> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}