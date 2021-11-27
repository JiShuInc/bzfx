package com.cardinal.tech.bzfx.etl;

import com.cardinal.tech.bzfx.entity.*;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * hua
 *
 * @description
 * @menu
 */
@Slf4j
@Component
public class EtlUtil {

    private List<String> coreTBNames = Arrays.asList("BZK_SLGX_BZ_BZDAXX", "BZK_SLGX_BZ_BZFFJL", "BZK_SLGX_CW_CWBZSJ", "BZK_SLGX_YF_RYZFQK", "BZK_TAB_DANWEIBCLRXX", "BZK_TAB_DANWEIJBXX", "BZK_TAB_RENYUANJBXX", "BZK_TAB_BAOZHANGKJBXX"); // 要同步的核心库表名
    @Autowired
    private DataSource dataSource;

    private final String oracleClassName = "oracle.jdbc.driver.OracleDriver";
    public long syncData(String host, Integer dbPort, String dbName, String username, String password) throws Exception {

        Connection oracleConnection = oracleConnection(host,dbPort,dbName,username,password);
        Connection mysqlConnection = dataSource.getConnection();
        long count = 0;
        for (String tableName:coreTBNames){
            count+=importTable(oracleConnection,mysqlConnection,tableName);
        }
        if (Objects.nonNull(oracleConnection)){
            oracleConnection.close();
        }
        return count;
    }

    public Connection oracleConnection(String dbHost, Integer dbPort, String dbName, String username, String password) throws Exception {
        String url="jdbc:oracle:thin:@"+dbHost+":"+dbPort+":"+dbName;
        Class.forName(oracleClassName);
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

//    public Connection mysqlConnection() throws Exception {
//        String className="com.mysql.cj.jdbc.Driver";
//        String url="jdbc:mysql://59.110.172.20:33060/bzfx?characterEncoding=utf8";
//        String username="root";
//        String password="Bzfx@2021";
//        Class.forName(className);
//        Connection connection = DriverManager.getConnection(url, username, password);
//        return connection;
//    }

    private String querySql(String tableName){
        if (tableName.equals("BZK_TAB_RENYUANJBXX")){
            return " select ID,JUNRENBZH,YILIAOKH,SHIBINGZCM,SHIBINGFZDJBHM,XINGMING,XINGBIE," +
                    " MINZU,JIGUAN,CHUSHENGDI,CHUSHENGRQ,XUEXING,RUWURQ,GONGZUORQ,LITUIXRQ," +
                    " GONGZUODWDM,GONGZUODWMC,BUBIE,BUMENID,ZHENGJIANBH,ZHENGJIANLX,RENYUANLB," +
                    " ZHULEIBIE,JUNZHONG,ZHIGONGSFLB,JIASHUSFLB,YOUFOUZP,ZHAOPIAN,WENHUACD,BIYEYX," +
                    " RUXUERQ,BIYERQ,BIYEZY,XUEWEI,ZHENGZHIMM,TIGANRQ,GAIXUANSGRQ,JUNXIANWZJ," +
                    " JUNXIANWZJ,XINGZHENGZW,XIANXINGZZWRQ,XINGZHENGZWDJ,XIANXINGZZWDJRQ," +
                    " ZHUANYEJSZW,ZHUANYEJSZWRQ,ZHUANYEJSDJ,ZHUANYEJSDJRQ,HOUQINGBZYLB," +
                    " JIGUANFDBS,JIASHUGZDW,HUNYINZK,PEIOUXM,PEIOUGZDW,SHIFOUYS,DUIYINGJRZGID," +
                    " DUIYINGJRXM,DUIYINGJRCSRQ,DUIYINGJRZJBH,DUIYINGJRBZH,JICENGYLJGID,JICENGYLJGMC," +
                    " SHIFOUFHYLJDYLJGTJ,JINGJIZK,LIANXIDH,GERENZT,YILEITGRYLB,ERLEITGRYLB,SANLEITGRYLB," +
                    " SILEITGRYLB,WULEITGRYLB,GENGXINBZ,SHANGBAOBZ,FENFABZ,SHENHEBZ,SHUJUSZDW,SHIFOUXG," +
                    " BEIZHU,SHUNXUM,RENYUANJBXXCJYJ,YINHANGDM,YUANID,YINHANGSZD,GANGWEIDJ,GANGWEIQK,ZHIGONGDJHM," +
                    " XZGXDWDM,XZGXDWMC,XZGXDDXH,CWGXDWDM,CWGXDWMC,CWGXDDXH,YLGXDWDM,YLGXDWMC,YLGXDDXH,BZGXDWDM," +
                    " BZGXDWMC,BZGXDDXH,YFGXDWDM,YFGXDWMC,YFGXDDXH,SUOZAIQHQ,SHENHEREN,XINGZHENGMLH,PIZHUNREN," +
                    " PIZHUNRQ,SHIFOUZXXY,GONGQINJNDJRQ,ZHAOPIANSFXG,BAOZHANGKH,KALEIXING,SHIFOUYZK,BUMENSHZT," +
                    " YILIAOZH,GONGZILZQD,SHIFOUJRJS,CAIJISBDW,XIAFABZ,YINHANGKH,ZAIZHIQK,SHIFOUZJDJY,SHIFOUXYSJPOBX " +
                    " from BZK_TAB_RENYUANJBXX ";
        }else if(tableName.equals("BZK_SLGX_BZ_BZDAXX")){
            return " select ID,XINGMING,JUNRENBZH,RENYUANLBM,ZHIWUDJM,JUNXIANDJM,JUNBINGZMC,SHENGAO," +
                    " XIONGWEI,YAOWEI,TOUWEI,JIAOCHANG,ZHIWEI,QIHOUQ,SHUJUSZDW,SHANGBAOBZ,DANWEIDM," +
                    " DAORUSJ,SUOSUDWDM,BUMENMC " +
                    " from BZK_SLGX_BZ_BZDAXX";
        }else if (tableName.equals("BZK_SLGX_BZ_BZFFJL")){
            return " select ID,FAFANGSJ,XINGMING,JUNRENBZH,PINZHONGM,ZHUOZHUANGHXM,JILIANGDW,SHULIANG," +
                    " QISUANND,SHUJUSZDW,SHANGBAOBZ,DANWEIDM,DAORUSJ,PINZHONG " +
                    " from BZK_SLGX_BZ_BZFFJL";
        }else if (tableName.equals("BZK_SLGX_CW_CWBZSJ")){
            return " select ID,FAFANGSJ,XINGMING,JUNRENBZH,ZHIWUGZ,JUNXIANGZ,JUNLINGGZ," +
                    " ZHIWUBT,QITAGZ,YINGFAGZ,SHIFAGZ,SHANGWANGBXYE,TUIYIYLBXYE,ZHUFANGBTYE," +
                    " ZHUFANGGJJYE,SHUJUSZDW,SHANGBAOBZ,DANWEIDM,DAORUSJ,GONGZUOJT," +
                    " SHENGHUOJT,KOUYB,KOUSB,QITAKF,DYZHUFANGBT,DYZHUFANGGJJ,KOUFAXJ,HUOBIBCLJYE " +
                    " from BZK_SLGX_CW_CWBZSJ";
        }else if(tableName.equals("BZK_SLGX_YF_RYZFQK")){
            return " select ID,XINGMING,JUNRENBZH,ZHUFANGSX,ZHUFANGDZ,GUANLIDW,JINZHUSJ," +
                    " ZUOLUOH,DONGHAO,FANGHAO,ZHUFANGXZM,HUXINGFLM,JIANZHUMJ,DANWEIDM," +
                    " DAORUSJ,SHANGBAOBZ,SHUJUSZDW,XUHAO " +
                    " from BZK_SLGX_YF_RYZFQK";
        }else if(tableName.equals("BZK_TAB_DANWEIBCLRXX")){
            return " select ID,DANWEIID,JUNGUANBZYE,WENZHIGBBZYE,BINGBZYE,ZHIGONGBZYE,FEIXIANYWZBZYE," +
                    " JIEFANGJZYYGBCS,JIEFANGJZYYPTCS,ZONGYIYGBCS,ZONGYIYPTCS,ZHONGXINYYGBCS,ZHONGXINYYPTCS," +
                    " DUISHUYYGBCS,DUISHUYYPTCS,FUSHUYYGBCS,FUSHUYYPTCS,MENZHENBYLCWS,SHILVYYYLCWS,LVTUANWSDYLCWS," +
                    " LIAOYANGYTQCWS,LIAOYANGYPTCWS,YILIAOSSTS,LIEBIANFQYHZDSCWS,GAOYUANBZZDCWS,BIANWAIZGS," +
                    " YOUGONGZJSS,WUGONGZJSS,YOUGONGZYSS,WUGONGZYSS,BANLIYLBGRYS,FAGEIYLBZRYS,YIGULXGBPOS," +
                    " YISHUHS,LAOJIAOPXRYS,JUNMASHU,JUNQUANSHU,SHUJUSZDW,SHIGUANBZYE,FEIXIANYGQBZYE,JUNGUANBZYEJG," +
                    " WENZHIGBBZYEJG,SHIGUANBZYEJG,BINGBZYEJG,ZHIGONGBZYEJG,FEIXIANYWZBZYEJG,FEIXIANYGQBZYEJG," +
                    " JUNGUANBZYEZF,WENZHIGBBZYEZF,SHIGUANBZYEZF,BINGBZYEZF,ZHIGONGBZYEZF,FEIXIANYWZBZYEZF," +
                    " FEIXIANYGQBZYEZF,CANGKURLBZS,YILIAOCWBZS,CHELIANGBZS,SHUYOUGXBZS,QINWUCTBZS,GONGCHENGJXBZS," +
                    " CANGKURLXYS,YILIAOCWXYS,CHELIANGXYS,SHUYOUGXXYS,QINWUCTXYS,GONGCHENGJXXYS,LUOTUOSHU," +
                    " XUEYUANBZYE,XUEYUANBZYEJG,XUEYUANBZYEZF " +
                    " from BZK_TAB_DANWEIBCLRXX";
        }else if(tableName.equals("BZK_TAB_DANWEIJBXX")){
            return " select ID,DANWEINM,DANWEIZT,DANWEIGYDM,DANWEILSDM,DANWEIMC,BUDUIDH,BUDUILB," +
                    " JIANZHILB,HOUQINBDLB,DANWEIJB,HOUQINJGJB,LISHUGX,ZHIHUIGX,GONGYINGXZDM," +
                    " ZHUDI,ZHUDIXCZ,YOUZHENGBM,TONGXINDZ,DIANHUAHM,CHUANZHENHM,ZHANQU,BAOZHANGQU," +
                    " JUNZHONG,BINGZHONG,QIHOUQU,LEIXING,SHUJUSZDW,SHANGBAOBZ,GENGXINBZ,FENFABZ," +
                    " SHENHEBZ,BEIZHU,HOUQINGYGX,LIANQINBZGX,CAIWUGY,BEIZHUANGGY,YOULIAOGY,JUNJIAOYSBZ," +
                    " JIJIANYFBZ,YINHANGSZD,YINHANGDM,JINGBANREN,LIANXIDIANHUA,BGWHRIQI,SHIFOUNGBK," +
                    " DANWEILX,LISHUCCM, XIAFABZ " +
                    " from BZK_TAB_DANWEIJBXX";
        }else if (tableName.equals("BZK_TAB_BAOZHANGKJBXX")){
            return " select ID,JUNRENID,BAOZHANGKH,ZHIKALX,ZHIKASJ,QIYONGSJ,SHIXIAOSJ,KAZHUANGTAI," +
                    " GENGXINBZ,SHANGBAOBZ,FENFABZ,SHENHEBZ,SHUJUSZDW,YUANID,SHIFOUDQK,HEIMDRQ," +
                    " HEIMDYY,KALEIXING,YINHANGDM,YINHANGKH,FAKADWDM " +
                    " from BZK_TAB_BAOZHANGKJBXX";
        }
        return null;
    }
    private long importTable(Connection connectOracle, Connection connectMysql,
                             String tableName) throws Exception {

        connectMysql.setAutoCommit(false);
        Statement stmt = null;
        PreparedStatement pstmt = null;
        int fs = 20000;
        // 计数器
        long count = 0;
        try {
            // 给PreparedStatement赋值,然后更新
            stmt = connectOracle.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);
            int maxRow=stmt.getMaxRows();
            fs=fs > maxRow?fs: maxRow;
            stmt.setFetchSize(fs);
            stmt.setFetchDirection(ResultSet.FETCH_FORWARD);
            ResultSet rs = stmt.executeQuery(querySql(tableName));
            ResultSetMetaData rsmd = rs.getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            // 设定多少条记录提交一次
            int batchCount = 10000;
            //执行清空表数据
            String insertSql = splicingSql(tableName,numberOfColumns,rsmd);
            pstmt = connectMysql.prepareStatement(insertSql);

            while (rs.next()) {
                pstmt.clearParameters();
                convertData(numberOfColumns,rsmd,pstmt,rs);
                pstmt.addBatch();
                // 输出统计信息
                count++;
                if ((count % batchCount) == 0) {
                    log.info("---------------正在更新数据库--------------------");
                    pstmt.executeBatch();
                    log.info(String.valueOf(count));
                }
            }
            if ((count % batchCount) != 0) {
                // 最后一次提交
                log.info("---------------最后一次更新数据库--------------------");
                pstmt.executeBatch();
                log.info("插入".concat(String.valueOf(count)).concat("条数据"));
            }
            // 提交事务，设置事务默认值
            connectMysql.commit();
            connectMysql.setAutoCommit(true);
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // 如果失败事务回滚
            connectMysql.rollback();
            throw e;
        } finally {
            if (stmt != null) {
                stmt.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
        }
        return count;
    }

    private void convertData(int numberOfColumns, ResultSetMetaData rsmd, PreparedStatement pstmt, ResultSet rs) throws SQLException {
        for (int i = 1; i <= numberOfColumns; i++) {
            if (rsmd.getColumnType(i) == Types.NUMERIC) {
                pstmt.setInt(i, rs.getInt(i));
            } else if (rsmd.getColumnType(i) == Types.DOUBLE) {
                pstmt.setDouble(i, rs.getDouble(i));
            } else if ((rsmd.getColumnType(i) == Types.VARCHAR) ||
                    (rsmd.getColumnType(i) == Types.CHAR)) {
                pstmt.setString(i, rs.getString(i));
            } else if (rsmd.getColumnType(i) == Types.DATE) {
                pstmt.setDate(i, rs.getDate(i));
            } else if (rsmd.getColumnType(i) == Types.TIMESTAMP) {
                pstmt.setTimestamp(i, rs.getTimestamp(i));
            } else {
                pstmt.setObject(i, rs.getObject(i));
            }
        }
    }

    private String splicingSql(String tableName, int numberOfColumns, ResultSetMetaData rsmd) throws SQLException {
        StringBuilder insertSql = new StringBuilder();
        insertSql.append("insert ignore into ").append(tableName).append("(");
        for (int i = 1; i < numberOfColumns+1; i++) {
            insertSql.append(rsmd.getColumnName(i)).append(",");
        }
        insertSql.deleteCharAt(insertSql.length() - 1);
        insertSql.append(")values(");
        for (int i = 1; i < numberOfColumns+1; i++) {
            insertSql.append("?,");
        }
        insertSql.deleteCharAt(insertSql.length() - 1);
        insertSql.append(")");
        log.info(insertSql.toString());
        return insertSql.toString();
    }

    public void truncateTable()  {

        Statement truncateState = null;
        try {
            Connection connectMysql = dataSource.getConnection();
            truncateState = connectMysql.createStatement();
            for (int i = 0; i < coreTBNames.size(); i++) {
                StringBuilder truncateSql = new StringBuilder();
                truncateSql.append("TRUNCATE TABLE ").append(coreTBNames.get(i));
                truncateState.execute(truncateSql.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (Objects.nonNull(truncateState)){
                try {
                    truncateState.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public <T> CsvToBean parseCsvToBean(Class<T> clazz, String fileName, char csvSeparator, int skipLineNum) throws FileNotFoundException {
        //获取列位置数组
        //HeaderColumnNameMappingStrategy<T> mapper = new HeaderColumnNameMappingStrategy<>();
        //mapper.setType(clazz);
       // List<T> parse;
        try {
            CsvToBean csvToBean = new CsvToBeanBuilder(new FileReader(fileName))
                    .withType(clazz)
                    .withSeparator(csvSeparator)
                    .withSkipLines(skipLineNum)
                    .build();
            return csvToBean;
        } catch (FileNotFoundException e) {
            log.error("【fileName：{}地址异常！】", fileName);
            throw e;
        }
    }


//    private String loadSql(String tableName){
//        if (tableName.equals("BZK_TAB_RENYUANJBXX")){
//            return " INTO TABLE BZK_TAB_RENYUANJBXX Terminated By ',' Enclosed By '\"' Escaped By '\"' Lines Terminated By '\\r\\n' " +
//                    " (ID,JUNRENBZH,YILIAOKH,SHIBINGZCM,SHIBINGFZDJBHM,XINGMING,XINGBIE," +
//                    " MINZU,JIGUAN,CHUSHENGDI,CHUSHENGRQ,XUEXING,RUWURQ,GONGZUORQ,LITUIXRQ," +
//                    " GONGZUODWDM,GONGZUODWMC,BUBIE,BUMENID,ZHENGJIANBH,ZHENGJIANLX,RENYUANLB," +
//                    " ZHULEIBIE,JUNZHONG,ZHIGONGSFLB,JIASHUSFLB,YOUFOUZP,ZHAOPIAN,WENHUACD,BIYEYX," +
//                    " RUXUERQ,BIYERQ,BIYEZY,XUEWEI,ZHENGZHIMM,TIGANRQ,GAIXUANSGRQ,JUNXIANWZJ," +
//                    " JUNXIANWZJ,XINGZHENGZW,XIANXINGZZWRQ,XINGZHENGZWDJ,XIANXINGZZWDJRQ," +
//                    " ZHUANYEJSZW,ZHUANYEJSZWRQ,ZHUANYEJSDJ,ZHUANYEJSDJRQ,HOUQINGBZYLB," +
//                    " JIGUANFDBS,JIASHUGZDW,HUNYINZK,PEIOUXM,PEIOUGZDW,SHIFOUYS,DUIYINGJRZGID," +
//                    " DUIYINGJRXM,DUIYINGJRCSRQ,DUIYINGJRZJBH,DUIYINGJRBZH,JICENGYLJGID,JICENGYLJGMC," +
//                    " SHIFOUFHYLJDYLJGTJ,JINGJIZK,LIANXIDH,GERENZT,YILEITGRYLB,ERLEITGRYLB,SANLEITGRYLB," +
//                    " SILEITGRYLB,WULEITGRYLB,GENGXINBZ,SHANGBAOBZ,FENFABZ,SHENHEBZ,SHUJUSZDW,SHIFOUXG," +
//                    " BEIZHU,SHUNXUM,RENYUANJBXXCJYJ,YINHANGDM,YUANID,YINHANGSZD,GANGWEIDJ,GANGWEIQK,ZHIGONGDJHM," +
//                    " XZGXDWDM,XZGXDWMC,XZGXDDXH,CWGXDWDM,CWGXDWMC,CWGXDDXH,YLGXDWDM,YLGXDWMC,YLGXDDXH,BZGXDWDM," +
//                    " BZGXDWMC,BZGXDDXH,YFGXDWDM,YFGXDWMC,YFGXDDXH,SUOZAIQHQ,SHENHEREN,XINGZHENGMLH,PIZHUNREN," +
//                    " PIZHUNRQ,SHIFOUZXXY,GONGQINJNDJRQ,ZHAOPIANSFXG,BAOZHANGKH,KALEIXING,SHIFOUYZK,BUMENSHZT," +
//                    " YILIAOZH,GONGZILZQD,SHIFOUJRJS,CAIJISBDW,XIAFABZ,YINHANGKH,ZAIZHIQK,SHIFOUZJDJY,SHIFOUXYSJPOBX) ";
//        }else if(tableName.equals("BZK_SLGX_BZ_BZDAXX")){
//            return " INTO TABLE BZK_SLGX_BZ_BZDAXX FIELDS TERMINATED BY ',' Enclosed By '\"' Escaped By '\"' Lines Terminated By '\\r\\n' " +
//                    " (ID,XINGMING,JUNRENBZH,RENYUANLBM,ZHIWUDJM,JUNXIANDJM,JUNBINGZMC,SHENGAO," +
//                    " XIONGWEI,YAOWEI,TOUWEI,JIAOCHANG,ZHIWEI,QIHOUQ,SHUJUSZDW,SHANGBAOBZ,DANWEIDM," +
//                    " DAORUSJ,SUOSUDWDM,BUMENMC) ";
//        }else if (tableName.equals("BZK_SLGX_BZ_BZFFJL")){
//            return " INTO TABLE BZK_SLGX_BZ_BZFFJL FIELDS TERMINATED BY ',' Enclosed By '\"' Escaped By '\"' Lines Terminated By '\\r\\n' " +
//                    " (ID,FAFANGSJ,XINGMING,JUNRENBZH,PINZHONGM,ZHUOZHUANGHXM,JILIANGDW,SHULIANG," +
//                    " QISUANND,SHUJUSZDW,SHANGBAOBZ,DANWEIDM,DAORUSJ,PINZHONG) ";
//        }else if (tableName.equals("BZK_SLGX_CW_CWBZSJ")){
//            return " INTO TABLE BZK_SLGX_CW_CWBZSJ FIELDS TERMINATED BY ',' Enclosed By '\"' Escaped By '\"' Lines Terminated By '\\r\\n' (ID,FAFANGSJ,XINGMING,JUNRENBZH,ZHIWUGZ,JUNXIANGZ,JUNLINGGZ," +
//                    " ZHIWUBT,QITAGZ,YINGFAGZ,SHIFAGZ,SHANGWANGBXYE,TUIYIYLBXYE,ZHUFANGBTYE," +
//                    " ZHUFANGGJJYE,SHUJUSZDW,SHANGBAOBZ,DANWEIDM,DAORUSJ,GONGZUOJT," +
//                    " SHENGHUOJT,KOUYB,KOUSB,QITAKF,DYZHUFANGBT,DYZHUFANGGJJ,KOUFAXJ,HUOBIBCLJYE) ";
//        }else if(tableName.equals("BZK_SLGX_YF_RYZFQK")){
//            return " INTO TABLE BZK_SLGX_YF_RYZFQK FIELDS TERMINATED BY ',' Enclosed By '\"' Escaped By '\"' Lines Terminated By '\\r\\n' " +
//                    " (ID,XINGMING,JUNRENBZH,ZHUFANGSX,ZHUFANGDZ,GUANLIDW,JINZHUSJ," +
//                    " ZUOLUOH,DONGHAO,FANGHAO,ZHUFANGXZM,HUXINGFLM,JIANZHUMJ,DANWEIDM," +
//                    " DAORUSJ,SHANGBAOBZ,SHUJUSZDW,XUHAO) ";
//        }else if(tableName.equals("BZK_TAB_DANWEIBCLRXX")){
//            return " INTO TABLE BZK_TAB_DANWEIBCLRXX FIELDS TERMINATED BY ',' Enclosed By '\"' Escaped By '\"' Lines Terminated By '\\r\\n' " +
//                    " (ID,DANWEIID,JUNGUANBZYE,WENZHIGBBZYE,BINGBZYE,ZHIGONGBZYE,FEIXIANYWZBZYE," +
//                    " JIEFANGJZYYGBCS,JIEFANGJZYYPTCS,ZONGYIYGBCS,ZONGYIYPTCS,ZHONGXINYYGBCS,ZHONGXINYYPTCS," +
//                    " DUISHUYYGBCS,DUISHUYYPTCS,FUSHUYYGBCS,FUSHUYYPTCS,MENZHENBYLCWS,SHILVYYYLCWS,LVTUANWSDYLCWS," +
//                    " LIAOYANGYTQCWS,LIAOYANGYPTCWS,YILIAOSSTS,LIEBIANFQYHZDSCWS,GAOYUANBZZDCWS,BIANWAIZGS," +
//                    " YOUGONGZJSS,WUGONGZJSS,YOUGONGZYSS,WUGONGZYSS,BANLIYLBGRYS,FAGEIYLBZRYS,YIGULXGBPOS," +
//                    " YISHUHS,LAOJIAOPXRYS,JUNMASHU,JUNQUANSHU,SHUJUSZDW,SHIGUANBZYE,FEIXIANYGQBZYE,JUNGUANBZYEJG," +
//                    " WENZHIGBBZYEJG,SHIGUANBZYEJG,BINGBZYEJG,ZHIGONGBZYEJG,FEIXIANYWZBZYEJG,FEIXIANYGQBZYEJG," +
//                    " JUNGUANBZYEZF,WENZHIGBBZYEZF,SHIGUANBZYEZF,BINGBZYEZF,ZHIGONGBZYEZF,FEIXIANYWZBZYEZF," +
//                    " FEIXIANYGQBZYEZF,CANGKURLBZS,YILIAOCWBZS,CHELIANGBZS,SHUYOUGXBZS,QINWUCTBZS,GONGCHENGJXBZS," +
//                    " CANGKURLXYS,YILIAOCWXYS,CHELIANGXYS,SHUYOUGXXYS,QINWUCTXYS,GONGCHENGJXXYS,LUOTUOSHU," +
//                    " XUEYUANBZYE,XUEYUANBZYEJG,XUEYUANBZYEZF) ";
//        }else if(tableName.equals("BZK_TAB_DANWEIJBXX")){
//            return " INTO TABLE BZK_TAB_DANWEIJBXX FIELDS TERMINATED BY ',' Enclosed By '\"' Escaped By '\"' Lines Terminated By '\\r\\n' " +
//                    " (ID,DANWEINM,DANWEIZT,DANWEIGYDM,DANWEILSDM,DANWEIMC,BUDUIDH,BUDUILB," +
//                    " JIANZHILB,HOUQINBDLB,DANWEIJB,HOUQINJGJB,LISHUGX,ZHIHUIGX,GONGYINGXZDM," +
//                    " ZHUDI,ZHUDIXCZ,YOUZHENGBM,TONGXINDZ,DIANHUAHM,CHUANZHENHM,ZHANQU,BAOZHANGQU," +
//                    " JUNZHONG,BINGZHONG,QIHOUQU,LEIXING,SHUJUSZDW,SHANGBAOBZ,GENGXINBZ,FENFABZ," +
//                    " SHENHEBZ,BEIZHU,HOUQINGYGX,LIANQINBZGX,CAIWUGY,BEIZHUANGGY,YOULIAOGY,JUNJIAOYSBZ," +
//                    " JIJIANYFBZ,YINHANGSZD,YINHANGDM,JINGBANREN,LIANXIDIANHUA,BGWHRIQI,SHIFOUNGBK," +
//                    " DANWEILX,LISHUCCM, XIAFABZ) ";
//        }else if (tableName.equals("BZK_TAB_BAOZHANGKJBXX")){
//            return " INTO TABLE BZK_TAB_BAOZHANGKJBXX FIELDS TERMINATED BY ',' Enclosed By '\"' Escaped By '\"' Lines Terminated By '\\r\\n' " +
//                    " (ID,JUNRENID,BAOZHANGKH,ZHIKALX,ZHIKASJ,QIYONGSJ,SHIXIAOSJ,KAZHUANGTAI," +
//                    " GENGXINBZ,SHANGBAOBZ,FENFABZ,SHENHEBZ,SHUJUSZDW,YUANID,SHIFOUDQK,HEIMDRQ," +
//                    " HEIMDYY,KALEIXING,YINHANGDM,YINHANGKH,FAKADWDM) ";
//        }
//        return null;
//    }

    public static void main(String[] args) {
        EtlUtil etlUtil = new EtlUtil();
        try {
            CsvToBean list = etlUtil.parseCsvToBean(BzkTabBaozhangkjbxx.class,"/Users/hua/BZK_TAB_BAOZHANGKJBXX.csv",',',1);
            System.out.println(list.stream().count());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
