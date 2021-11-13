package com.cardinal.tech.bzfx.dao;

import com.cardinal.tech.bzfx.entity.TjDanweixx;
import com.cardinal.tech.bzfx.bean.dbo.page.*;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * 单位信息表(TjDanweixx)表数据库访问层
 *
 * @author cadinal.tech
 * @since 2021-11-13 19:28:47
 */
public interface TjDanweixxDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TjDanweixx queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TjDanweixx> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tjDanweixx 实例对象
     * @return 对象列表
     */
    List<TjDanweixx> queryAll(TjDanweixx tjDanweixx);

    /**
     * 新增数据
     *
     * @param tjDanweixx 实例对象
     * @return 影响行数
     */
    int insert(TjDanweixx tjDanweixx);

    /**
     * 修改数据
     *
     * @param tjDanweixx 实例对象
     * @return 影响行数
     */
    int update(TjDanweixx tjDanweixx);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

    /**
     * 通过字段进行分组统计
     *
     * @param field 主键
     * @return 统计详情
     */
    List<Map<String,Integer>> groupBy(String field);

     List<TjDanweixx> queryPageTjDanweixxList(PageQuery pq);
}