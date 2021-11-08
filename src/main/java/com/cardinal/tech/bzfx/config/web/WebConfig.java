package com.cardinal.tech.bzfx.config.web;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.json.JsonWriteFeature;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Optional;

/**
 * @author zbw
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     * web message convert配置
     *
     * @param converters
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        MappingJackson2HttpMessageConverter converter;
        Optional<HttpMessageConverter<?>> jacksonConverter = converters.parallelStream().filter(c -> c instanceof MappingJackson2HttpMessageConverter).findFirst();
        if (jacksonConverter.isPresent()) {
            converter = (MappingJackson2HttpMessageConverter) jacksonConverter.get();
        } else {
            converter = new MappingJackson2HttpMessageConverter();
            converters.add(converter);
        }
        converter.setDefaultCharset(StandardCharsets.UTF_8);
    }

    @Bean
    public ObjectMapper configObjectMapper() {
        var objectMapper = new ObjectMapper();
        // 设置输出时不输出为null的值
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.enable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN);
        return objectMapper;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.defaultContentType(MediaType.APPLICATION_JSON);
    }


}
