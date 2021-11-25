package com.cardinal.tech.bzfx.dao;

import com.cardinal.tech.bzfx.entity.BzkBzTabDanweizt;
import com.cardinal.tech.bzfx.bean.dbo.page.*;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * 单位状态(BzkBzTabDanweizt)表数据库访问层
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
public interface BzkBzTabDanweiztDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BzkBzTabDanweizt queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BzkBzTabDanweizt> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param bzkBzTabDanweizt 实例对象
     * @return 对象列表
     */
    List<BzkBzTabDanweizt> queryAll(BzkBzTabDanweizt bzkBzTabDanweizt);

    /**
     * 新增数据
     *
     * @param bzkBzTabDanweizt 实例对象
     * @return 影响行数
     */
    int insert(BzkBzTabDanweizt bzkBzTabDanweizt);

    /**
     * 修改数据
     *
     * @param bzkBzTabDanweizt 实例对象
     * @return 影响行数
     */
    int update(BzkBzTabDanweizt bzkBzTabDanweizt);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

    /**
     * 通过字段进行分组统计
     *
     * @param field 主键
     * @return 统计详情
     */
    List<Map<String,Integer>> groupBy(String field);

     List<BzkBzTabDanweizt> queryPageBzkBzTabDanweiztList(PageQuery pq);
}