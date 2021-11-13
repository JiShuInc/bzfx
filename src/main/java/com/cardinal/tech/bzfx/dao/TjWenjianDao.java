package com.cardinal.tech.bzfx.dao;

import com.cardinal.tech.bzfx.entity.TjWenjian;
import com.cardinal.tech.bzfx.bean.dbo.page.*;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * 上传文件表(TjWenjian)表数据库访问层
 *
 * @author cadinal.tech
 * @since 2021-11-13 21:10:08
 */
public interface TjWenjianDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TjWenjian queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TjWenjian> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tjWenjian 实例对象
     * @return 对象列表
     */
    List<TjWenjian> queryAll(TjWenjian tjWenjian);

    /**
     * 新增数据
     *
     * @param tjWenjian 实例对象
     * @return 影响行数
     */
    int insert(TjWenjian tjWenjian);

    /**
     * 修改数据
     *
     * @param tjWenjian 实例对象
     * @return 影响行数
     */
    int update(TjWenjian tjWenjian);

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

     List<TjWenjian> queryPageTjWenjianList(PageQuery pq);
}