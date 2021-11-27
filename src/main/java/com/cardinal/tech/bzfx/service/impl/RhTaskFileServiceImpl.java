package com.cardinal.tech.bzfx.service.impl;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import com.cardinal.tech.bzfx.dao.*;
import com.cardinal.tech.bzfx.entity.*;
import com.cardinal.tech.bzfx.enums.biz.SyncResultEnum;
import com.cardinal.tech.bzfx.enums.biz.SyncStateEnum;
import com.cardinal.tech.bzfx.etl.EtlUtil;
import com.cardinal.tech.bzfx.service.RhTaskFileService;
import com.cardinal.tech.bzfx.util.GgLogsUtil;
import com.opencsv.bean.CsvToBean;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.io.FileNotFoundException;
import java.util.*;

/**
 * 任务数据-文件(RhTaskFile)表服务实现类
 *
 * @author cadinal.tech
 * @since 2021-11-14 14:09:12
 */
@RequiredArgsConstructor
@Service("rhTaskFileService")
@Slf4j
public class RhTaskFileServiceImpl implements RhTaskFileService {

    private final RhTaskFileDao rhTaskFileDao;
    private final RhTaskDao rhTaskDao;

    private final SlSyncLogsDao slSyncLogsDao;

    private final EtlUtil etlUtil;

    private SqlSessionTemplate sqlSessionTemplate;

    private final GgLogsUtil ggLogsUtil;
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public RhTaskFile queryById(Long id) {
        return this.rhTaskFileDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<RhTaskFile> queryAllByLimit(int offset, int limit) {
        return this.rhTaskFileDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param rhTaskFile 实例对象
     * @return 实例对象
     */
    @Override
    public RhTaskFile insert(RhTaskFile rhTaskFile) {
        this.rhTaskFileDao.insert(rhTaskFile);
        return rhTaskFile;
    }

    /**
     * 修改数据
     *
     * @param rhTaskFile 实例对象
     * @return 实例对象
     */
    @Override
    public RhTaskFile update(RhTaskFile rhTaskFile) {
        this.rhTaskFileDao.update(rhTaskFile);
        return this.queryById(rhTaskFile.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.rhTaskFileDao.deleteById(id) > 0;
    }

    /**
     * 通过字段进行数据统计
     *
     * @param field 字段名
     * @return 统计结果
     */
    @Override
    public List<Map<String,Integer>> groupBy(String field) {
        return this.rhTaskFileDao.groupBy(field);
    }

    /**
     *  分页查询
     *
     * @param userQueryForm 查询对象
     * @return 分页结果
     */
     @Override
     public Page<RhTaskFile> page(PageForm<RhTaskFile> userQueryForm){
        var pq = new PageQuery<>(userQueryForm);
        List<RhTaskFile> entityList = this.rhTaskFileDao.queryPageRhTaskFileList(pq);
        Page<RhTaskFile> p = new Page<>(pq.getTotalCount(), pq.getMax(), pq.getCurrentPage());
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
        RhTask rhTask = rhTaskDao.queryById(taskId);
        if (Objects.nonNull(rhTask.getDbState()) && rhTask.getDbState().equals(SyncStateEnum.SYNC_PROGRESS.value())){
            log.info("rh_task state 状态为同步中");
            return false;
        }
        ggLogsUtil.syncRecord("【taskId:"+taskId+"】sync task start");
        rhTask.setDbState(SyncStateEnum.SYNC_PROGRESS.value());
        rhTaskDao.update(rhTask);
        ggLogsUtil.syncRecord("【taskId:"+taskId+"】task state ["+SyncStateEnum.SYNC_PROGRESS.desc()+"]");
        RhTaskFile rhTaskFile = new RhTaskFile();
        rhTaskFile.setTaskId(taskId);
        List<RhTaskFile> rhTaskFiles = this.rhTaskFileDao.queryAll(rhTaskFile);
        ggLogsUtil.syncRecord("【taskId:"+taskId+"】task_file total ["+rhTaskFiles.size()+"]");
        syncData(taskId,rhTaskFiles);
        return true;
    }

    @Async
    void syncData(Long taskId, List<RhTaskFile> rhTaskFiles) {
        etlUtil.truncateTable();
        for (RhTaskFile file:rhTaskFiles){
            ggLogsUtil.syncRecord("【taskId:"+taskId+"】sync task_file start["+file.getFilename()+"]");
            long count = 0;
            Date syncAt = new Date();
            Date syncEnd = null;
            Integer result = SyncResultEnum.SYNC_SUCCESS.value();
            String remark = SyncResultEnum.SYNC_SUCCESS.desc();
            try {
                file.setState(SyncStateEnum.SYNC_PROGRESS.value());
                file.setSyncAt(syncAt);
                this.rhTaskFileDao.update(file);

                ggLogsUtil.syncRecord("【taskId:"+taskId+"】task_file ["+file.getFilename()+"] task_file state ["+SyncStateEnum.SYNC_PROGRESS.desc()+"]");

                count = this.batchProcessing(file);

                file.setState(SyncStateEnum.SYNC_FINISHED.value());
                file.setResult(result);
                syncEnd = new Date();
                file.setSyncEnd(syncEnd);
                this.rhTaskFileDao.update(file);
                ggLogsUtil.syncRecord("【taskId:"+taskId+"】task_file ["+file.getFilename()+"] task_file sync data total ["+count+"]");
            }catch (Exception e){
                e.printStackTrace();
                remark = e.getMessage();
                file.setState(SyncStateEnum.SYNC_FINISHED.value());
                result = SyncResultEnum.SYNC_FAIL.value();
                file.setResult(result);
                syncEnd = new Date();
                file.setSyncEnd(syncEnd);
                this.rhTaskFileDao.update(file);

                ggLogsUtil.syncRecord("【taskId:"+taskId+"】task_file ["+file.getFilename()+"] update task_file state ["+SyncStateEnum.SYNC_FINISHED.desc()+"] [result "+SyncResultEnum.SYNC_FAIL.desc()+"]");
            }finally {
                SlSyncLogs slSyncLogs = new SlSyncLogs();
                slSyncLogs.setCreatAt(new Date());
                slSyncLogs.setTaskDbId(file.getId().intValue());
                slSyncLogs.setDataTotal(count);
                slSyncLogs.setDbHost(file.getTableName());
                slSyncLogs.setSyncAt(syncAt);
                slSyncLogs.setSyncEnd(syncEnd);
                slSyncLogs.setResult(result);
                slSyncLogs.setRemark(remark);
                slSyncLogs.setCreatAt(new Date());
                slSyncLogsDao.insert(slSyncLogs);
            }
        }

        RhTask rhTask = rhTaskDao.queryById(taskId);
        rhTask.setDbState(SyncStateEnum.SYNC_FINISHED.value());
        rhTaskDao.update(rhTask);
    }

    private long batchProcessing(RhTaskFile file) throws FileNotFoundException {
        String filePath = String.format("%s%s%s",file.getUrl(),"/",file.getFilename());
        long count = 0;
        int batchCount = 10000;
        SqlSession sqlSession = sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH,false);
        if (file.getTableName().equals("BZK_TAB_DANWEIJBXX")){
            CsvToBean csvToBean = etlUtil.parseCsvToBean(BzkTabDanweijbxx.class,filePath,',',1);
            Iterator iterator = csvToBean.iterator();
            BzkTabDanweijbxxDao bzkTabDanweijbxxDao = sqlSession.getMapper(BzkTabDanweijbxxDao.class);
            while (iterator.hasNext()){
                BzkTabDanweijbxx bzkTabDanweijbxx = (BzkTabDanweijbxx) iterator.next();
                bzkTabDanweijbxxDao.insert(bzkTabDanweijbxx);
                if ((count % batchCount) == 0) {
                    sqlSession.commit();
                }
                count++;
            }
        }else if (file.getTableName().equals("BZK_SLGX_BZ_BZDAXX")){
            CsvToBean csvToBean = etlUtil.parseCsvToBean(BzkSlgxBzBzdaxx.class,filePath,',',1);
            Iterator iterator = csvToBean.iterator();
            BzkSlgxBzBzdaxxDao bzkSlgxBzBzdaxxDao = sqlSession.getMapper(BzkSlgxBzBzdaxxDao.class);
            while (iterator.hasNext()){
                BzkSlgxBzBzdaxx bzkSlgxBzBzdaxx = (BzkSlgxBzBzdaxx) iterator.next();
                bzkSlgxBzBzdaxxDao.insert(bzkSlgxBzBzdaxx);
                if ((count % batchCount) == 0) {
                    sqlSession.commit();
                }
                count++;
            };
        }else if (file.getTableName().equals("BZK_SLGX_BZ_BZFFJL")){
            CsvToBean csvToBean  = etlUtil.parseCsvToBean(BzkSlgxBzBzffjl.class,filePath,',',1);
            Iterator iterator = csvToBean.iterator();
            BzkSlgxBzBzffjlDao bzkSlgxBzBzffjlDao = sqlSession.getMapper(BzkSlgxBzBzffjlDao.class);
            while (iterator.hasNext()){
                BzkSlgxBzBzffjl bzkSlgxBzBzffjl = (BzkSlgxBzBzffjl) iterator.next();
                bzkSlgxBzBzffjlDao.insert(bzkSlgxBzBzffjl);
                if ((count % batchCount) == 0) {
                    sqlSession.commit();
                }
                count++;
            };
        }else if (file.getTableName().equals("BZK_SLGX_CW_CWBZSJ")){
            CsvToBean csvToBean = etlUtil.parseCsvToBean(BzkSlgxCwCwbzsj.class,filePath,',',1);
            Iterator iterator = csvToBean.iterator();
            BzkSlgxCwCwbzsjDao bzkSlgxCwCwbzsjDao = sqlSession.getMapper(BzkSlgxCwCwbzsjDao.class);
            while (iterator.hasNext()){
                BzkSlgxCwCwbzsj bzkSlgxCwCwbzsj = (BzkSlgxCwCwbzsj) iterator.next();
                bzkSlgxCwCwbzsjDao.insert(bzkSlgxCwCwbzsj);
                if ((count % batchCount) == 0) {
                    sqlSession.commit();
                }
                count++;
            };
        }else if (file.getTableName().equals("BZK_SLGX_YF_RYZFQK")){
            CsvToBean csvToBean = etlUtil.parseCsvToBean(BzkSlgxYfRyzfqk.class,filePath,',',1);
            Iterator iterator = csvToBean.iterator();
            BzkSlgxYfRyzfqkDao bzkSlgxYfRyzfqkDao = sqlSession.getMapper(BzkSlgxYfRyzfqkDao.class);
            while (iterator.hasNext()){
                BzkSlgxYfRyzfqk bzkSlgxYfRyzfqk = (BzkSlgxYfRyzfqk) iterator.next();
                bzkSlgxYfRyzfqkDao.insert(bzkSlgxYfRyzfqk);
                if ((count % batchCount) == 0) {
                    sqlSession.commit();
                }
                count++;
            };
        }else if (file.getTableName().equals("BZK_TAB_DANWEIBCLRXX")){
            CsvToBean csvToBean = etlUtil.parseCsvToBean(BzkTabDanweibclrxx.class,filePath,',',1);
            Iterator iterator = csvToBean.iterator();
            BzkTabDanweibclrxxDao bzkTabDanweibclrxxDao = sqlSession.getMapper(BzkTabDanweibclrxxDao.class);
            while (iterator.hasNext()){
                BzkTabDanweibclrxx bzkTabDanweibclrxx = (BzkTabDanweibclrxx) iterator.next();
                bzkTabDanweibclrxxDao.insert(bzkTabDanweibclrxx);
                if ((count % batchCount) == 0) {
                    sqlSession.commit();
                }
                count++;
            };
        }else if (file.getTableName().equals("BZK_TAB_RENYUANJBXX")){
            CsvToBean csvToBean = etlUtil.parseCsvToBean(BzkTabRenyuanjbxx.class,filePath,',',1);
            Iterator iterator = csvToBean.iterator();
            BzkTabRenyuanjbxxDao bzkTabRenyuanjbxxDao = sqlSession.getMapper(BzkTabRenyuanjbxxDao.class);
            while (iterator.hasNext()){
                BzkTabRenyuanjbxx bzkTabRenyuanjbxx = (BzkTabRenyuanjbxx) iterator.next();
                bzkTabRenyuanjbxxDao.insert(bzkTabRenyuanjbxx);
                if ((count % batchCount) == 0) {
                    sqlSession.commit();
                }
                count++;
            };
        }else if (file.getTableName().equals("BZK_TAB_BAOZHANGKJBXX")){
            CsvToBean csvToBean = etlUtil.parseCsvToBean(BzkTabBaozhangkjbxx.class,filePath,',',1);
            Iterator iterator = csvToBean.iterator();
            BzkTabBaozhangkjbxxDao bzkTabBaozhangkjbxxDao = sqlSession.getMapper(BzkTabBaozhangkjbxxDao.class);
            while (iterator.hasNext()){
                BzkTabBaozhangkjbxx bzkTabBaozhangkjbxx = (BzkTabBaozhangkjbxx) iterator.next();
                bzkTabBaozhangkjbxxDao.insert(bzkTabBaozhangkjbxx);
                if ((count % batchCount) == 0) {
                    sqlSession.commit();
                }
                count++;
            };
        }
        return count;
    }
}