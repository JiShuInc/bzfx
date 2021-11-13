package com.cardinal.tech.bzfx.dao;

import com.cardinal.tech.bzfx.entity.SlNetDisk;
import com.cardinal.tech.bzfx.bean.dbo.page.*;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * 文档资料(SlNetDisk)表数据库访问层
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:37
 */
public interface SlNetDiskDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SlNetDisk queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SlNetDisk> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param slNetDisk 实例对象
     * @return 对象列表
     */
    List<SlNetDisk> queryAll(SlNetDisk slNetDisk);

    /**
     * 新增数据
     *
     * @param slNetDisk 实例对象
     * @return 影响行数
     */
    int insert(SlNetDisk slNetDisk);

    /**
     * 修改数据
     *
     * @param slNetDisk 实例对象
     * @return 影响行数
     */
    int update(SlNetDisk slNetDisk);

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

     List<SlNetDisk> queryPageSlNetDiskList(PageQuery pq);
}