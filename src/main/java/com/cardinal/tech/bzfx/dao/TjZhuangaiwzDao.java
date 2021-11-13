package com.cardinal.tech.bzfx.dao;

import com.cardinal.tech.bzfx.entity.TjZhuangaiwz;
import com.cardinal.tech.bzfx.bean.dbo.page.*;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * 军官和文职干部互改记录表(TjZhuangaiwz)表数据库访问层
 *
 * @author cadinal.tech
 * @since 2021-11-13 19:28:47
 */
public interface TjZhuangaiwzDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TjZhuangaiwz queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TjZhuangaiwz> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tjZhuangaiwz 实例对象
     * @return 对象列表
     */
    List<TjZhuangaiwz> queryAll(TjZhuangaiwz tjZhuangaiwz);

    /**
     * 新增数据
     *
     * @param tjZhuangaiwz 实例对象
     * @return 影响行数
     */
    int insert(TjZhuangaiwz tjZhuangaiwz);

    /**
     * 修改数据
     *
     * @param tjZhuangaiwz 实例对象
     * @return 影响行数
     */
    int update(TjZhuangaiwz tjZhuangaiwz);

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

     List<TjZhuangaiwz> queryPageTjZhuangaiwzList(PageQuery pq);
}