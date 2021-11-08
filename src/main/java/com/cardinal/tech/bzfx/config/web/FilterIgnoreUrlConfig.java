package com.cardinal.tech.bzfx.config.web;

import com.google.common.collect.Lists;
import lombok.Data;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data
@Configuration
@ConditionalOnExpression("!'${ignore}'.isEmpty()")
@ConfigurationProperties(prefix = "ignore")
public class FilterIgnoreUrlConfig {
    /**
     * 不需要登录就能访问的url
     */
    private List<String> urls = Lists.newArrayList();
    /**
     * 需要登录才能访问的url
     */
    private List<String> authenticates = Lists.newArrayList();
}
