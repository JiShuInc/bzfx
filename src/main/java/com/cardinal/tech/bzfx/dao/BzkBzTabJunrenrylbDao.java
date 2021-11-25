package com.cardinal.tech.bzfx.dao;

import com.cardinal.tech.bzfx.entity.BzkBzTabJunrenrylb;
import com.cardinal.tech.bzfx.bean.dbo.page.*;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * 军人人员类别(BzkBzTabJunrenrylb)表数据库访问层
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
public interface BzkBzTabJunrenrylbDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BzkBzTabJunrenrylb queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BzkBzTabJunrenrylb> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param bzkBzTabJunrenrylb 实例对象
     * @return 对象列表
     */
    List<BzkBzTabJunrenrylb> queryAll(BzkBzTabJunrenrylb bzkBzTabJunrenrylb);

    /**
     * 新增数据
     *
     * @param bzkBzTabJunrenrylb 实例对象
     * @return 影响行数
     */
    int insert(BzkBzTabJunrenrylb bzkBzTabJunrenrylb);

    /**
     * 修改数据
     *
     * @param bzkBzTabJunrenrylb 实例对象
     * @return 影响行数
     */
    int update(BzkBzTabJunrenrylb bzkBzTabJunrenrylb);

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

     List<BzkBzTabJunrenrylb> queryPageBzkBzTabJunrenrylbList(PageQuery pq);
}