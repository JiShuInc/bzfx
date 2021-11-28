package com.cardinal.tech.bzfx.dao;

import com.cardinal.tech.bzfx.entity.TaskBzkSlgxYfRyzfqk;
import com.cardinal.tech.bzfx.bean.dbo.page.*;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * 人员住房情况(TaskBzkSlgxYfRyzfqk)表数据库访问层
 *
 * @author makejava
 * @since 2021-11-28 12:40:57
 */
public interface TaskBzkSlgxYfRyzfqkDao {

    /**
     * 通过ID查询单条数据
     *
     * @param taskid 主键
     * @return 实例对象
     */
    TaskBzkSlgxYfRyzfqk queryById(Long taskid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TaskBzkSlgxYfRyzfqk> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param taskBzkSlgxYfRyzfqk 实例对象
     * @return 对象列表
     */
    List<TaskBzkSlgxYfRyzfqk> queryAll(TaskBzkSlgxYfRyzfqk taskBzkSlgxYfRyzfqk);

    /**
     * 新增数据
     *
     * @param taskBzkSlgxYfRyzfqk 实例对象
     * @return 影响行数
     */
    int insert(TaskBzkSlgxYfRyzfqk taskBzkSlgxYfRyzfqk);

    /**
     * 新增数据
     *
     * @param taskBzkSlgxYfRyzfqk 实例对象
     * @return 影响行数
     */
    int insertIgnore(TaskBzkSlgxYfRyzfqk taskBzkSlgxYfRyzfqk);

    /**
     * 修改数据
     *
     * @param taskBzkSlgxYfRyzfqk 实例对象
     * @return 影响行数
     */
    int update(TaskBzkSlgxYfRyzfqk taskBzkSlgxYfRyzfqk);

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

     List<TaskBzkSlgxYfRyzfqk> queryPageTaskBzkSlgxYfRyzfqkList(PageQuery pq);
}