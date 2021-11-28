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
import org.springframework.beans.BeanUtils;
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

    private final SqlSessionTemplate sqlSessionTemplate;

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
        RhTaskFile rhTaskFile = new RhTaskFile();
        rhTaskFile.setTaskId(taskId);
        List<RhTaskFile> rhTaskFiles = this.rhTaskFileDao.queryAll(rhTaskFile);
        if (!rhTaskFiles.isEmpty()){
            ggLogsUtil.syncRecord("【taskId:"+taskId+"】task_file total ["+rhTaskFiles.size()+"]");
            syncData(taskId,rhTaskFiles);
        }
        return true;
    }

    @Override
    @Async
    public void syncData(String tableName, String url) {
        try {
            ggLogsUtil.syncRecord("【tableName:"+tableName+"】filePatch ["+url+"]",0);
            this.batchProcessing(tableName,url,null);
            etlUtil.callTongjifenxi();
        }catch (Exception e){
            e.printStackTrace();
            ggLogsUtil.syncRecord("【tableName:"+tableName+"】sync data fail",0);
        }
    }

    @Async
    void syncData(Long taskId, List<RhTaskFile> rhTaskFiles) {
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
        etlUtil.callTongjifenxi();
    }

    private long batchProcessing(RhTaskFile file) throws FileNotFoundException {

        return batchProcessing(file.getTableName(),file.getUrl(),file.getTaskId());
    }

    private long batchProcessing(String tableName, String filePath, Long taskId) throws FileNotFoundException {
        long count = 0;
        int batchCount = 10000;
        SqlSession sqlSession = sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH,false);
        CsvToBean csvToBean = null;
        Iterator iterator = null;
        String message = (Objects.nonNull(taskId)?"【taskId:"+taskId+"】":"")+"【tableName:"+tableName+"】sync data total ["+count+"]";
        Integer module = Objects.nonNull(taskId)?1:0;
        tableName = tableName.toUpperCase();
        switch (tableName){
            case "BZK_TAB_DANWEIJBXX":
                csvToBean = etlUtil.parseCsvToBean(BzkTabDanweijbxx.class,filePath,',',1);
                iterator = csvToBean.iterator();
                BzkTabDanweijbxxDao bzkTabDanweijbxxDao = sqlSession.getMapper(BzkTabDanweijbxxDao.class);
                while (iterator.hasNext()){
                    BzkTabDanweijbxx bzkTabDanweijbxx = (BzkTabDanweijbxx) iterator.next();
                    bzkTabDanweijbxxDao.insertIgnore(bzkTabDanweijbxx);
                    if ((count % batchCount) == 0) {
                        sqlSession.commit();
                    }
                    count++;
                }
                break;
            case "BZK_SLGX_BZ_BZDAXX":
                csvToBean = etlUtil.parseCsvToBean(BzkSlgxBzBzdaxx.class,filePath,',',1);
                iterator = csvToBean.iterator();
                BzkSlgxBzBzdaxxDao bzkSlgxBzBzdaxxDao = sqlSession.getMapper(BzkSlgxBzBzdaxxDao.class);
                while (iterator.hasNext()){
                    BzkSlgxBzBzdaxx bzkSlgxBzBzdaxx = (BzkSlgxBzBzdaxx) iterator.next();
                    bzkSlgxBzBzdaxxDao.insertIgnore(bzkSlgxBzBzdaxx);
                    if ((count % batchCount) == 0) {
                        sqlSession.commit();
                    }
                    count++;
                };
                break;
            case "BZK_SLGX_BZ_BZFFJL":
                csvToBean = etlUtil.parseCsvToBean(BzkSlgxBzBzffjl.class,filePath,',',1);
                iterator = csvToBean.iterator();
                BzkSlgxBzBzffjlDao bzkSlgxBzBzffjlDao = sqlSession.getMapper(BzkSlgxBzBzffjlDao.class);
                while (iterator.hasNext()){
                    BzkSlgxBzBzffjl bzkSlgxBzBzffjl = (BzkSlgxBzBzffjl) iterator.next();
                    bzkSlgxBzBzffjlDao.insertIgnore(bzkSlgxBzBzffjl);
                    if ((count % batchCount) == 0) {
                        sqlSession.commit();
                    }
                    count++;
                };
                break;
            case "BZK_SLGX_CW_CWBZSJ":
                csvToBean = etlUtil.parseCsvToBean(BzkSlgxCwCwbzsj.class,filePath,',',1);
                iterator = csvToBean.iterator();
                BzkSlgxCwCwbzsjDao bzkSlgxCwCwbzsjDao = sqlSession.getMapper(BzkSlgxCwCwbzsjDao.class);
                while (iterator.hasNext()){
                    BzkSlgxCwCwbzsj bzkSlgxCwCwbzsj = (BzkSlgxCwCwbzsj) iterator.next();
                    bzkSlgxCwCwbzsjDao.insertIgnore(bzkSlgxCwCwbzsj);
                    if ((count % batchCount) == 0) {
                        sqlSession.commit();
                    }
                    count++;
                };
                break;
            case "BZK_SLGX_YF_RYZFQK":
                csvToBean = etlUtil.parseCsvToBean(BzkSlgxYfRyzfqk.class,filePath,',',1);
                iterator = csvToBean.iterator();
                BzkSlgxYfRyzfqkDao bzkSlgxYfRyzfqkDao = sqlSession.getMapper(BzkSlgxYfRyzfqkDao.class);
                while (iterator.hasNext()){
                    BzkSlgxYfRyzfqk bzkSlgxYfRyzfqk = (BzkSlgxYfRyzfqk) iterator.next();
                    bzkSlgxYfRyzfqkDao.insertIgnore(bzkSlgxYfRyzfqk);
                    if ((count % batchCount) == 0) {
                        sqlSession.commit();
                    }
                    count++;
                };
                break;
            case "BZK_TAB_DANWEIBCLRXX":
                csvToBean = etlUtil.parseCsvToBean(BzkTabDanweibclrxx.class,filePath,',',1);
                iterator = csvToBean.iterator();
                BzkTabDanweibclrxxDao bzkTabDanweibclrxxDao = sqlSession.getMapper(BzkTabDanweibclrxxDao.class);
                while (iterator.hasNext()){
                    BzkTabDanweibclrxx bzkTabDanweibclrxx = (BzkTabDanweibclrxx) iterator.next();
                    bzkTabDanweibclrxxDao.insertIgnore(bzkTabDanweibclrxx);
                    if ((count % batchCount) == 0) {
                        sqlSession.commit();
                    }
                    count++;
                };
                break;
            case "BZK_TAB_RENYUANJBXX":
                csvToBean = etlUtil.parseCsvToBean(BzkTabRenyuanjbxx.class,filePath,',',1);
                iterator = csvToBean.iterator();
                BzkTabRenyuanjbxxDao bzkTabRenyuanjbxxDao = sqlSession.getMapper(BzkTabRenyuanjbxxDao.class);
                while (iterator.hasNext()){
                    BzkTabRenyuanjbxx bzkTabRenyuanjbxx = (BzkTabRenyuanjbxx) iterator.next();
                    bzkTabRenyuanjbxxDao.insertIgnore(bzkTabRenyuanjbxx);
                    if ((count % batchCount) == 0) {
                        sqlSession.commit();
                    }
                    count++;
                };
                break;
            case "BZK_TAB_BAOZHANGKJBXX":
                csvToBean = etlUtil.parseCsvToBean(BzkTabBaozhangkjbxx.class,filePath,',',1);
                iterator = csvToBean.iterator();
                BzkTabBaozhangkjbxxDao bzkTabBaozhangkjbxxDao = sqlSession.getMapper(BzkTabBaozhangkjbxxDao.class);
                while (iterator.hasNext()){
                    BzkTabBaozhangkjbxx bzkTabBaozhangkjbxx = (BzkTabBaozhangkjbxx) iterator.next();
                    bzkTabBaozhangkjbxxDao.insertIgnore(bzkTabBaozhangkjbxx);
                    if ((count % batchCount) == 0) {
                        sqlSession.commit();
                    }
                    count++;
                };
                break;
            case "TASK_BZK_TAB_DANWEIJBXX":
                csvToBean = etlUtil.parseCsvToBean(BzkTabDanweijbxx.class,filePath,',',1);
                iterator = csvToBean.iterator();
                TaskBzkTabDanweijbxxDao taskBzkTabDanweijbxxDao = sqlSession.getMapper(TaskBzkTabDanweijbxxDao.class);
                while (iterator.hasNext()){
                    BzkTabDanweijbxx bzkTabDanweijbxx = (BzkTabDanweijbxx) iterator.next();
                    TaskBzkTabDanweijbxx taskBzkTabDanweijbxx = new TaskBzkTabDanweijbxx();
                    BeanUtils.copyProperties(bzkTabDanweijbxx,taskBzkTabDanweijbxx);
                    taskBzkTabDanweijbxx.setTaskid(taskId);
                    taskBzkTabDanweijbxxDao.insertIgnore(taskBzkTabDanweijbxx);
                    if ((count % batchCount) == 0) {
                        sqlSession.commit();
                    }
                    count++;
                }
                break;
            case "TASK_BZK_SLGX_BZ_BZDAXX":
                csvToBean = etlUtil.parseCsvToBean(TaskBzkSlgxBzBzdaxx.class,filePath,',',1);
                iterator = csvToBean.iterator();
                TaskBzkSlgxBzBzdaxxDao taskBzkSlgxBzBzdaxxDao = sqlSession.getMapper(TaskBzkSlgxBzBzdaxxDao.class);
                while (iterator.hasNext()){
                    BzkSlgxBzBzdaxx bzkSlgxBzBzdaxx = (BzkSlgxBzBzdaxx) iterator.next();
                    TaskBzkSlgxBzBzdaxx taskBzkSlgxBzBzdaxx = new TaskBzkSlgxBzBzdaxx();
                    BeanUtils.copyProperties(bzkSlgxBzBzdaxx,taskBzkSlgxBzBzdaxx);
                    taskBzkSlgxBzBzdaxx.setTaskid(taskId);
                    taskBzkSlgxBzBzdaxxDao.insertIgnore(taskBzkSlgxBzBzdaxx);
                    if ((count % batchCount) == 0) {
                        sqlSession.commit();
                    }
                    count++;
                };
                break;
            case "TASK_BZK_SLGX_BZ_BZFFJL":
                csvToBean = etlUtil.parseCsvToBean(BzkSlgxBzBzffjl.class,filePath,',',1);
                iterator = csvToBean.iterator();
                TaskBzkSlgxBzBzffjlDao taskBzkSlgxBzBzffjlDao = sqlSession.getMapper(TaskBzkSlgxBzBzffjlDao.class);
                while (iterator.hasNext()){
                    BzkSlgxBzBzffjl bzkSlgxBzBzffjl = (BzkSlgxBzBzffjl) iterator.next();
                    TaskBzkSlgxBzBzffjl taskBzkSlgxBzBzffjl = new TaskBzkSlgxBzBzffjl();
                    BeanUtils.copyProperties(bzkSlgxBzBzffjl,taskBzkSlgxBzBzffjl);
                    taskBzkSlgxBzBzffjl.setTaskid(taskId);
                    taskBzkSlgxBzBzffjlDao.insertIgnore(taskBzkSlgxBzBzffjl);
                    if ((count % batchCount) == 0) {
                        sqlSession.commit();
                    }
                    count++;
                };
                break;
            case "TASK_BZK_SLGX_CW_CWBZSJ":
                csvToBean = etlUtil.parseCsvToBean(BzkSlgxCwCwbzsj.class,filePath,',',1);
                iterator = csvToBean.iterator();
                TaskBzkSlgxCwCwbzsjDao taskBzkSlgxCwCwbzsjDao = sqlSession.getMapper(TaskBzkSlgxCwCwbzsjDao.class);
                while (iterator.hasNext()){
                    BzkSlgxCwCwbzsj bzkSlgxCwCwbzsj = (BzkSlgxCwCwbzsj) iterator.next();
                    TaskBzkSlgxCwCwbzsj taskBzkSlgxCwCwbzsj = new TaskBzkSlgxCwCwbzsj();
                    BeanUtils.copyProperties(bzkSlgxCwCwbzsj,taskBzkSlgxCwCwbzsj);
                    taskBzkSlgxCwCwbzsj.setTaskid(taskId);
                    taskBzkSlgxCwCwbzsjDao.insertIgnore(taskBzkSlgxCwCwbzsj);
                    if ((count % batchCount) == 0) {
                        sqlSession.commit();
                    }
                    count++;
                };
                break;
            case "TASK_BZK_SLGX_YF_RYZFQK":
                csvToBean = etlUtil.parseCsvToBean(BzkSlgxYfRyzfqk.class,filePath,',',1);
                iterator = csvToBean.iterator();
                TaskBzkSlgxYfRyzfqkDao taskBzkSlgxYfRyzfqkDao = sqlSession.getMapper(TaskBzkSlgxYfRyzfqkDao.class);
                while (iterator.hasNext()){
                    BzkSlgxYfRyzfqk bzkSlgxYfRyzfqk = (BzkSlgxYfRyzfqk) iterator.next();
                    TaskBzkSlgxYfRyzfqk taskBzkSlgxYfRyzfqk = new TaskBzkSlgxYfRyzfqk();
                    BeanUtils.copyProperties(bzkSlgxYfRyzfqk,taskBzkSlgxYfRyzfqk);
                    taskBzkSlgxYfRyzfqk.setTaskid(taskId);
                    taskBzkSlgxYfRyzfqkDao.insertIgnore(taskBzkSlgxYfRyzfqk);
                    if ((count % batchCount) == 0) {
                        sqlSession.commit();
                    }
                    count++;
                };
                break;
            case "TASK_BZK_TAB_DANWEIBCLRXX":
                csvToBean = etlUtil.parseCsvToBean(BzkTabDanweibclrxx.class,filePath,',',1);
                iterator = csvToBean.iterator();
                TaskBzkTabDanweibclrxxDao taskBzkTabDanweibclrxxDao = sqlSession.getMapper(TaskBzkTabDanweibclrxxDao.class);
                while (iterator.hasNext()){
                    BzkTabDanweibclrxx bzkTabDanweibclrxx = (BzkTabDanweibclrxx) iterator.next();
                    TaskBzkTabDanweibclrxx taskBzkTabDanweibclrxx = new TaskBzkTabDanweibclrxx();
                    BeanUtils.copyProperties(bzkTabDanweibclrxx,taskBzkTabDanweibclrxx);
                    taskBzkTabDanweibclrxx.setTaskid(taskId);
                    taskBzkTabDanweibclrxxDao.insertIgnore(taskBzkTabDanweibclrxx);
                    if ((count % batchCount) == 0) {
                        sqlSession.commit();
                    }
                    count++;
                };
                break;
            case "TASK_BZK_TAB_RENYUANJBXX":
                csvToBean = etlUtil.parseCsvToBean(BzkTabRenyuanjbxx.class,filePath,',',1);
                iterator = csvToBean.iterator();
                TaskBzkTabRenyuanjbxxDao taskBzkTabRenyuanjbxxDao = sqlSession.getMapper(TaskBzkTabRenyuanjbxxDao.class);
                while (iterator.hasNext()){
                    BzkTabRenyuanjbxx bzkTabRenyuanjbxx = (BzkTabRenyuanjbxx) iterator.next();
                    TaskBzkTabRenyuanjbxx taskBzkTabRenyuanjbxx = new TaskBzkTabRenyuanjbxx();
                    BeanUtils.copyProperties(bzkTabRenyuanjbxx,taskBzkTabRenyuanjbxx);
                    taskBzkTabRenyuanjbxx.setTaskid(taskId);
                    taskBzkTabRenyuanjbxxDao.insertIgnore(taskBzkTabRenyuanjbxx);
                    if ((count % batchCount) == 0) {
                        sqlSession.commit();
                    }
                    count++;
                };
                break;
            case "TASK_BZK_TAB_BAOZHANGKJBXX":
                csvToBean = etlUtil.parseCsvToBean(BzkTabBaozhangkjbxx.class,filePath,',',1);
                iterator = csvToBean.iterator();
                TaskBzkTabBaozhangkjbxxDao taskBzkTabBaozhangkjbxxDao = sqlSession.getMapper(TaskBzkTabBaozhangkjbxxDao.class);
                while (iterator.hasNext()){
                    BzkTabBaozhangkjbxx bzkTabBaozhangkjbxx = (BzkTabBaozhangkjbxx) iterator.next();
                    TaskBzkTabBaozhangkjbxx taskBzkTabBaozhangkjbxx = new TaskBzkTabBaozhangkjbxx();
                    BeanUtils.copyProperties(bzkTabBaozhangkjbxx,taskBzkTabBaozhangkjbxx);
                    taskBzkTabBaozhangkjbxx.setTaskid(taskId);
                    taskBzkTabBaozhangkjbxxDao.insertIgnore(taskBzkTabBaozhangkjbxx);
                    if ((count % batchCount) == 0) {
                        sqlSession.commit();
                    }
                    count++;
                };
                break;
            default:
                break;
        }
        if ((count % batchCount) != 0) {
            sqlSession.commit();
        }
        ggLogsUtil.syncRecord(message,module);
        return count;
    }
}