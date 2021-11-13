package com.cardinal.tech.bzfx.service;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.entity.TjWenjian;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * 上传文件表(TjWenjian)表服务接口
 *
 * @author cadinal.tech
 * @since 2021-11-13 21:10:08
 */
public interface TjWenjianService {

        /**
         * 通过ID查询单条数据
         *
         * @param id 主键
         * @return 实例对象
         */
        TjWenjian queryById(Long id);
        /**
         * 下载文件
         *
         */
        Void download(Long id, HttpServletResponse response);

        /**
         * 查询多条数据
         *
         * @param offset 查询起始位置
         * @param limit 查询条数
         * @return 对象列表
         */
        List<TjWenjian> queryAllByLimit(int offset, int limit);

        /**
         * 新增数据
         *
         * @param tjWenjian 实例对象
         * @return 实例对象
         */
        TjWenjian insert(TjWenjian tjWenjian);

        /**
         * 上传文件
         *
         */
        TjWenjian upload(MultipartFile file);

        /**
         * 修改数据
         *
         * @param tjWenjian 实例对象
         * @return 实例对象
         */
        TjWenjian update(TjWenjian tjWenjian);

        /**
         * 通过主键删除数据
         *
         * @param id 主键
         * @return 是否成功
         */
        boolean deleteById(Long id);

        /**
         * 通过字段统计
         *
         * @param field 字段名
         * @return 统计结果
         */
        List<Map<String,Integer>> groupBy(String field);

        /**
         *  分页查询
         *
         * @param userQueryForm 查询对象
         * @return 分页结果
         */
        Page<TjWenjian> page(PageForm<TjWenjian> userQueryForm);

}