package com.cardinal.tech.bzfx.service.impl;

import com.alibaba.fastjson.JSON;
import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.dao.GgLogsDao;
import com.cardinal.tech.bzfx.dao.RhTaskDao;
import com.cardinal.tech.bzfx.dao.SlSyncLogsDao;
import com.cardinal.tech.bzfx.entity.RhTask;
import com.cardinal.tech.bzfx.entity.RhTaskDb;
import com.cardinal.tech.bzfx.dao.RhTaskDbDao;
import com.cardinal.tech.bzfx.entity.SlSyncLogs;
import com.cardinal.tech.bzfx.enums.biz.SyncResultEnum;
import com.cardinal.tech.bzfx.enums.biz.SyncStateEnum;
import com.cardinal.tech.bzfx.etl.EtlUtil;
import com.cardinal.tech.bzfx.service.RhTaskDbService;
import com.cardinal.tech.bzfx.service.RhTaskFileService;
import com.cardinal.tech.bzfx.util.GgLogsUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

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
@Slf4j
public class RhTaskDbServiceImpl implements RhTaskDbService {

    private final RhTaskDbDao rhTaskDbDao;
    private final RhTaskDao rhTaskDao;
    private final SlSyncLogsDao slSyncLogsDao;
    private final EtlUtil etlUtil;
    private final GgLogsUtil ggLogsUtil;
    private final RhTaskFileService rhTaskFileService;

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
        log.info("taskId id: {}",taskId);
        RhTask rhTask = rhTaskDao.queryById(taskId);
        if (Objects.nonNull(rhTask.getDbState()) && rhTask.getDbState().equals(SyncStateEnum.SYNC_PROGRESS.value())){
            log.info("rh_task state 状态为同步中");
            return false;
        }

        ggLogsUtil.syncRecord("【taskId:"+taskId+"】sync task start");
        rhTask.setDbState(SyncStateEnum.SYNC_PROGRESS.value());
        rhTaskDao.update(rhTask);
        ggLogsUtil.syncRecord("【taskId:"+taskId+"】task state ["+SyncStateEnum.SYNC_PROGRESS.desc()+"]");

        RhTaskDb rhTaskDb = new RhTaskDb();
        rhTaskDb.setTaskId(taskId);
        List<RhTaskDb> rhTaskDbs = this.rhTaskDbDao.queryAll(rhTaskDb);
        ggLogsUtil.syncRecord("【taskId:"+taskId+"】task_db total ["+rhTaskDbs.size()+"]");

        syncData(taskId,rhTaskDbs);
        return true;
    }

    @Override
    @Async
    public void statistics() {
        etlUtil.callTongjifenxi();
    }

    @Override
    public Boolean isConnection(Long id) {
        RhTaskDb rhTaskDb = rhTaskDbDao.queryById(id);
        if (Objects.isNull(rhTaskDb)){
            return false;
        }
        return etlUtil.testConnection(rhTaskDb.getDbHost(),rhTaskDb.getDbPort(),rhTaskDb.getDbServe(),rhTaskDb.getDbName(),rhTaskDb.getDbPasswd());
    }

    @Async
    public void syncData(Long taskId, List<RhTaskDb> rhTaskDbs) {
        etlUtil.truncateTable(taskId);
        for (RhTaskDb db:rhTaskDbs){
            ggLogsUtil.syncRecord("【taskId:"+taskId+"】sync task_db start["+db.getDbHost()+":"+db.getDbPort()+":"+db.getDbServe()+"]");
            long count = 0;
            Date syncAt = new Date();
            Date syncEnd = null;
            Integer result = SyncResultEnum.SYNC_SUCCESS.value();
            String remark = SyncResultEnum.SYNC_SUCCESS.desc();
            try {
                db.setState(SyncStateEnum.SYNC_PROGRESS.value());
                db.setSyncAt(syncAt);
                this.rhTaskDbDao.update(db);

                ggLogsUtil.syncRecord("【taskId:"+taskId+"】task_db ["+db.getDbHost()+":"+db.getDbPort()+":"+db.getDbServe()+"] task_db state ["+SyncStateEnum.SYNC_PROGRESS.desc()+"]");

                count = etlUtil.syncData(taskId,db.getDbHost(),db.getDbPort(),db.getDbServe(),db.getDbName(),db.getDbPasswd());
                db.setState(SyncStateEnum.SYNC_FINISHED.value());
                db.setResult(result);
                syncEnd = new Date();
                db.setSyncEnd(syncEnd);
                this.rhTaskDbDao.update(db);
                ggLogsUtil.syncRecord("【taskId:"+taskId+"】task_db ["+db.getDbHost()+":"+db.getDbPort()+":"+db.getDbServe()+"] task_db sync data total ["+count+"]");
            }catch (Exception e){
                e.printStackTrace();

                remark = e.getMessage();
                db.setState(SyncStateEnum.SYNC_FINISHED.value());
                result = SyncResultEnum.SYNC_FAIL.value();
                db.setResult(result);
                syncEnd = new Date();
                db.setSyncEnd(syncEnd);
                this.rhTaskDbDao.update(db);

                ggLogsUtil.syncRecord("【taskId:"+taskId+"】task_db ["+db.getDbHost()+":"+db.getDbPort()+":"+db.getDbServe()+"] update task_db state ["+SyncStateEnum.SYNC_FINISHED.desc()+"] [result "+SyncResultEnum.SYNC_FAIL.desc()+"]");
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

        rhTaskFileService.syncData(taskId);

        if (taskId.intValue() == 1){
            ggLogsUtil.syncRecord("【taskId:"+taskId+" call proc_tongjifenxi_insert()");
            this.statistics();
        }
        RhTask rhTask = rhTaskDao.queryById(taskId);
        rhTask.setDbState(SyncStateEnum.SYNC_FINISHED.value());
        rhTaskDao.update(rhTask);
        ggLogsUtil.syncRecord("【taskId:"+taskId+" sync task state ["+SyncStateEnum.SYNC_FINISHED.desc()+"]");

    }
}