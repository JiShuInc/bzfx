package .service.impl;

import .bean.bo.*;
import .bean.dbo.page.PageQuery;
import .entity.TjWenjian;
import .dao.TjWenjianDao;
import .service.TjWenjianService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 上传文件表(TjWenjian)表服务实现类
 *
 * @author cadinal.tech
 * @since 2021-11-13 21:01:51
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
}