package com.cardinal.tech.bzfx.dao;

import com.cardinal.tech.bzfx.bean.bo.JcSpecialRyPageForm;
import com.cardinal.tech.bzfx.bean.bo.RYQuery;
import com.cardinal.tech.bzfx.entity.BzkTabRenyuanjbxx;
import com.cardinal.tech.bzfx.entity.JcSpecialRy;
import com.cardinal.tech.bzfx.bean.dbo.page.*;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * 专项任务人员(JcSpecialRy)表数据库访问层
 *
 * @author makejava
 * @since 2021-11-20 18:42:52
 */
public interface JcSpecialRyDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    JcSpecialRy queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<JcSpecialRy> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param jcSpecialRy 实例对象
     * @return 对象列表
     */
    List<JcSpecialRy> queryAll(JcSpecialRy jcSpecialRy);

    /**
     * 新增数据
     *
     * @param jcSpecialRy 实例对象
     * @return 影响行数
     */
    int insert(JcSpecialRy jcSpecialRy);

    /**
     * 修改数据
     *
     * @param jcSpecialRy 实例对象
     * @return 影响行数
     */
    int update(JcSpecialRy jcSpecialRy);

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

     List<JcSpecialRy> queryPageJcSpecialRyList(PageQuery pq);

    int addRyToRw(@Param("sid") Long sid,@Param("query") RYQuery query);

    int deleteBySId(@Param("sid")Long sid, @Param("rid") String rid);

    List<BzkTabRenyuanjbxx> queryBySid(@Param("sid") Long sid);

    List<BzkTabRenyuanjbxx> queryPageJcSpecialRyxxList(PageQuery pq);
}