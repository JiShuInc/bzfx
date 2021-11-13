package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.entity.TjWenjian;
import com.cardinal.tech.bzfx.dao.TjWenjianDao;
import com.cardinal.tech.bzfx.service.TjWenjianService;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.net.http.HttpHeaders;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 上传文件表(TjWenjian)表服务实现类
 *
 * @author cadinal.tech
 * @since 2021-11-13 21:10:08
 */
@RequiredArgsConstructor
@Service("tjWenjianService")
public class TjWenjianServiceImpl implements TjWenjianService {

    private final TjWenjianDao tjWenjianDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TjWenjian queryById(Long id) {
        return this.tjWenjianDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TjWenjian> queryAllByLimit(int offset, int limit) {
        return this.tjWenjianDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tjWenjian 实例对象
     * @return 实例对象
     */
    @Override
    public TjWenjian insert(TjWenjian tjWenjian) {
        this.tjWenjianDao.insert(tjWenjian);
        return tjWenjian;
    }

    /**
     * 修改数据
     *
     * @param tjWenjian 实例对象
     * @return 实例对象
     */
    @Override
    public TjWenjian update(TjWenjian tjWenjian) {
        this.tjWenjianDao.update(tjWenjian);
        return this.queryById(tjWenjian.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tjWenjianDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.tjWenjianDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<TjWenjian> page(PageForm<TjWenjian> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<TjWenjian> entityList = this.tjWenjianDao.queryPageTjWenjianList(pq);
        Page<TjWenjian> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }


    @Override
    public TjWenjian upload(MultipartFile file) {
        TjWenjian wenjian = new TjWenjian();
        wenjian.setName(file.getOriginalFilename());
        wenjian.setCreatAt(new Date());
        wenjian.setPath("");
        this.tjWenjianDao.insert(wenjian);

        try {
            wenjian.setPath(savefile(file,wenjian.getId().toString()));
            tjWenjianDao.update(wenjian);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wenjian;
    }



    @Override
    public Void download(Long id, HttpServletResponse response) {
        InputStream stream = null;
        try {
            TjWenjian wenjian = this.tjWenjianDao.queryById(id);
            File file = new File(wenjian.getPath());
            if (null == file || !file.exists()) {
                throw new IllegalArgumentException("文件不存在");
            } else {
                stream = new FileInputStream(file);
//                response.addHeader("Content-Type", "application/octet-stream");
//                response.addHeader("Content-Disposition", "attachment;filename=" + wenjian.getName());
                response.setContentType("application/force-download");
                response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(wenjian.getName(), "UTF-8"));

                response.setContentLength((int) file.length());
                IOUtils.copy(stream, response.getOutputStream());
                response.flushBuffer();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("文件不存在");

        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("文件处理异常");
        } finally {
            if (null != stream) {
                try {
                    stream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    private String savefile(MultipartFile file,String fileName) throws IOException {

         String filePath = this.getClass().getClassLoader().getResource("").getPath() +"/temp/" + fileName;
         File desFile = new File(filePath);
        if(!desFile.getParentFile().exists()){
            desFile.mkdirs();
        }
        file.transferTo(desFile);
        return desFile.getCanonicalPath();
    }
}