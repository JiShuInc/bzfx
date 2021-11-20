package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.JkApiUser;
import com.cardinal.tech.bzfx.dao.JkApiUserDao;
import com.cardinal.tech.bzfx.service.JkApiUserService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (JkApiUser)表服务实现类
 *
 * @author makejava
 * @since 2021-11-20 19:22:42
 */
@RequiredArgsConstructor
@Service("jkApiUserService")
public class JkApiUserServiceImpl implements JkApiUserService {

    private final JkApiUserDao jkApiUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public JkApiUser queryById(Integer id) {
        return this.jkApiUserDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<JkApiUser> queryAllByLimit(int offset, int limit) {
        return this.jkApiUserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param jkApiUser 实例对象
     * @return 实例对象
     */
    @Override
    public JkApiUser insert(JkApiUser jkApiUser) {
        this.jkApiUserDao.insert(jkApiUser);
        return jkApiUser;
    }

    /**
     * 修改数据
     *
     * @param jkApiUser 实例对象
     * @return 实例对象
     */
    @Override
    public JkApiUser update(JkApiUser jkApiUser) {
        this.jkApiUserDao.update(jkApiUser);
        return this.queryById(jkApiUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.jkApiUserDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.jkApiUserDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<JkApiUser> page(PageForm<JkApiUser> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<JkApiUser> entityList = this.jkApiUserDao.queryPageJkApiUserList(pq);
        Page<JkApiUser> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }
}