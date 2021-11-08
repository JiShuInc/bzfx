package com.cardinal.tech.bzfx.config.web;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * mybatis、druid数据连接池配置
 *
 * @author zbw
 */
@Configuration
@EnableTransactionManagement
public class DataBaseConfig {

    @Bean
    public PlatformTransactionManager transactionManager(@Autowired DruidDataSource druidDataSource) {
        return new DataSourceTransactionManager(druidDataSource);
    }
}
