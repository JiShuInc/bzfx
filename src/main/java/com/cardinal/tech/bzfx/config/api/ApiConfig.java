package com.cardinal.tech.bzfx.config.api;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ApiConfig {
    public static final String ADMIN_API = "/admin";

    @Bean
    public static GroupedOpenApi managerOpenApi() {
        String[] paths = {ADMIN_API + "/**"};
        return GroupedOpenApi.builder().group("Admin").pathsToMatch(paths).build();
    }

    @Bean
    public static OpenAPI customerOpenApi(@Value("${springdoc.version}") String appVersion) {
        return new OpenAPI().components(new Components().addSecuritySchemes("bearer-jwt", new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT")))
                .info(new Info().title("保障分析系统后台接口").version(appVersion).description("api参考文档"))
                .addSecurityItem(new SecurityRequirement().addList("bearer-jwt", Arrays.asList("read", "write")));
    }
}
