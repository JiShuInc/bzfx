package com.cardinal.tech.bzfx.dao;

import com.cardinal.tech.bzfx.entity.TjTongjifenxiSpecial;
import com.cardinal.tech.bzfx.bean.dbo.page.*;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * 专项任务统计分析表(TjTongjifenxiSpecial)表数据库访问层
 *
 * @author makejava
 * @since 2021-12-04 19:29:47
 */
public interface TjTongjifenxiSpecialDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TjTongjifenxiSpecial queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TjTongjifenxiSpecial> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tjTongjifenxiSpecial 实例对象
     * @return 对象列表
     */
    List<TjTongjifenxiSpecial> queryAll(TjTongjifenxiSpecial tjTongjifenxiSpecial);

    /**
     * 新增数据
     *
     * @param tjTongjifenxiSpecial 实例对象
     * @return 影响行数
     */
    int insert(TjTongjifenxiSpecial tjTongjifenxiSpecial);

    /**
     * 新增数据
     *
     * @param tjTongjifenxiSpecial 实例对象
     * @return 影响行数
     */
    int insertIgnore(TjTongjifenxiSpecial tjTongjifenxiSpecial);

    /**
     * 修改数据
     *
     * @param tjTongjifenxiSpecial 实例对象
     * @return 影响行数
     */
    int update(TjTongjifenxiSpecial tjTongjifenxiSpecial);

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

     List<TjTongjifenxiSpecial> queryPageTjTongjifenxiSpecialList(PageQuery pq);
}