package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.JkApi;
import com.cardinal.tech.bzfx.dao.JkApiDao;
import com.cardinal.tech.bzfx.service.JkApiService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 接口(JkApi)表服务实现类
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:37
 */
@RequiredArgsConstructor
@Service("jkApiService")
public class JkApiServiceImpl implements JkApiService {

    private final JkApiDao jkApiDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public JkApi queryById(Long id) {
        return this.jkApiDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<JkApi> queryAllByLimit(int offset, int limit) {
        return this.jkApiDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param jkApi 实例对象
     * @return 实例对象
     */
    @Override
    public JkApi insert(JkApi jkApi) {
        this.jkApiDao.insert(jkApi);
        return jkApi;
    }

    /**
     * 修改数据
     *
     * @param jkApi 实例对象
     * @return 实例对象
     */
    @Override
    public JkApi update(JkApi jkApi) {
        this.jkApiDao.update(jkApi);
        return this.queryById(jkApi.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.jkApiDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.jkApiDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<JkApi> page(PageForm<JkApi> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<JkApi> entityList = this.jkApiDao.queryPageJkApiList(pq);
        Page<JkApi> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}