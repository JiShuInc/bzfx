package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.dao.SlSyncLogsDao;
import com.cardinal.tech.bzfx.entity.RhTaskDb;
import com.cardinal.tech.bzfx.dao.RhTaskDbDao;
import com.cardinal.tech.bzfx.entity.SlSyncLogs;
import com.cardinal.tech.bzfx.enums.biz.SyncResultEnum;
import com.cardinal.tech.bzfx.enums.biz.SyncStateEnum;
import com.cardinal.tech.bzfx.etl.EtlUtil;
import com.cardinal.tech.bzfx.service.RhTaskDbService;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * 任务数据-数据库(RhTaskDb)表服务实现类
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:37
 */
@RequiredArgsConstructor
@Service("rhTaskDbService")
public class RhTaskDbServiceImpl implements RhTaskDbService {

    private final RhTaskDbDao rhTaskDbDao;
    private final SlSyncLogsDao slSyncLogsDao;
    private final EtlUtil etlUtil;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public RhTaskDb queryById(Long id) {
        return this.rhTaskDbDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<RhTaskDb> queryAllByLimit(int offset, int limit) {
        return this.rhTaskDbDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param rhTaskDb 实例对象
     * @return 实例对象
     */
    @Override
    public RhTaskDb insert(RhTaskDb rhTaskDb) {
        this.rhTaskDbDao.insert(rhTaskDb);
        return rhTaskDb;
    }

    /**
     * 修改数据
     *
     * @param rhTaskDb 实例对象
     * @return 实例对象
     */
    @Override
    public RhTaskDb update(RhTaskDb rhTaskDb) {
        this.rhTaskDbDao.update(rhTaskDb);
        return this.queryById(rhTaskDb.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.rhTaskDbDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.rhTaskDbDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<RhTaskDb> page(PageForm<RhTaskDb> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<RhTaskDb> entityList = this.rhTaskDbDao.queryPageRhTaskDbList(pq);
        Page<RhTaskDb> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
        p.setData(entityList);
        return p;
    }

    /**
     * 同步数据
     *
     * @param taskId 字段名
     * @return
     */
    @Override
    public boolean syncData(Long taskId) {
        RhTaskDb rhTaskDb = new RhTaskDb();
        rhTaskDb.setTaskId(taskId);
        List<RhTaskDb> rhTaskDbs = this.rhTaskDbDao.queryAll(rhTaskDb);
        long cont = rhTaskDbs.stream().filter(e-> Objects.nonNull(e.getState()) && e.getState().equals(SyncStateEnum.SYNC_PROGRESS.value())).count();
        if (cont>0){ return false; }
        syncData(rhTaskDbs);
        return true;
    }

    @Async
    void syncData(List<RhTaskDb> rhTaskDbs) {
        for (RhTaskDb db:rhTaskDbs){
            long count = 0;
            Date syncAt = new Date();
            Date syncEnd = null;
            Integer result = SyncResultEnum.SYNC_SUCCESS.value();
            String remark = SyncResultEnum.SYNC_SUCCESS.desc();
            try {
                db.setState(SyncStateEnum.SYNC_PROGRESS.value());
                db.setSyncAt(DateFormatUtils.format(syncAt,"yyyy-MM-dd HH:mm:ss"));
                this.rhTaskDbDao.update(db);
                count = etlUtil.syncData(db.getDbHost(),db.getDbName(),db.getDbPasswd());
                db.setState(SyncStateEnum.SYNC_FINISHED.value());
                db.setResult(result);
                syncEnd = new Date();
                db.setSyncEnd(DateFormatUtils.format(syncEnd,"yyyy-MM-dd HH:mm:ss"));
                this.rhTaskDbDao.update(db);
            }catch (Exception e){
                e.printStackTrace();
                remark = e.getMessage();
                db.setState(SyncStateEnum.SYNC_FINISHED.value());
                result = SyncResultEnum.SYNC_FAIL.value();
                db.setResult(result);
                syncEnd = new Date();
                db.setSyncEnd(DateFormatUtils.format(syncEnd,"yyyy-MM-dd HH:mm:ss"));
                this.rhTaskDbDao.update(db);
            }finally {
                SlSyncLogs slSyncLogs = new SlSyncLogs();
                slSyncLogs.setCreatAt(new Date());
                slSyncLogs.setTaskDbId(db.getId().intValue());
                slSyncLogs.setDataTotal(count);
                slSyncLogs.setDbHost(db.getDbHost());
                slSyncLogs.setSyncAt(syncAt);
                slSyncLogs.setSyncEnd(syncEnd);
                slSyncLogs.setResult(result);
                slSyncLogs.setRemark(remark);
                slSyncLogs.setCreatAt(new Date());
                slSyncLogsDao.insert(slSyncLogs);
            }
        }
    }
}