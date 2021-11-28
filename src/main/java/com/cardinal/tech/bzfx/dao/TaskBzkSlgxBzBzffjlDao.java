package com.cardinal.tech.bzfx.dao;

import com.cardinal.tech.bzfx.entity.TaskBzkSlgxBzBzffjl;
import com.cardinal.tech.bzfx.bean.dbo.page.*;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * 被装发放记录(TaskBzkSlgxBzBzffjl)表数据库访问层
 *
 * @author makejava
 * @since 2021-11-28 12:40:57
 */
public interface TaskBzkSlgxBzBzffjlDao {

    /**
     * 通过ID查询单条数据
     *
     * @param taskid 主键
     * @return 实例对象
     */
    TaskBzkSlgxBzBzffjl queryById(Long taskid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TaskBzkSlgxBzBzffjl> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param taskBzkSlgxBzBzffjl 实例对象
     * @return 对象列表
     */
    List<TaskBzkSlgxBzBzffjl> queryAll(TaskBzkSlgxBzBzffjl taskBzkSlgxBzBzffjl);

    /**
     * 新增数据
     *
     * @param taskBzkSlgxBzBzffjl 实例对象
     * @return 影响行数
     */
    int insert(TaskBzkSlgxBzBzffjl taskBzkSlgxBzBzffjl);

    /**
     * 新增数据
     *
     * @param taskBzkSlgxBzBzffjl 实例对象
     * @return 影响行数
     */
    int insertIgnore(TaskBzkSlgxBzBzffjl taskBzkSlgxBzBzffjl);

    /**
     * 修改数据
     *
     * @param taskBzkSlgxBzBzffjl 实例对象
     * @return 影响行数
     */
    int update(TaskBzkSlgxBzBzffjl taskBzkSlgxBzBzffjl);

    /**
     * 通过主键删除数据
     *
     * @param taskid 主键
     * @return 影响行数
     */
    int deleteById(Long taskid);

    /**
     * 通过字段进行分组统计
     *
     * @param field 主键
     * @return 统计详情
     */
    List<Map<String,Integer>> groupBy(String field);

     List<TaskBzkSlgxBzBzffjl> queryPageTaskBzkSlgxBzBzffjlList(PageQuery pq);
}