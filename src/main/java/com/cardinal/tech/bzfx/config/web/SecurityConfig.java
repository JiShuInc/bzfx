package com.cardinal.tech.bzfx.config.web;

import com.cardinal.tech.bzfx.util.UserPasswordEncoder;
import com.cardinal.tech.bzfx.exceptions.JwtAuthenticationEntryPoint;
import com.cardinal.tech.bzfx.exceptions.UserAccessDeniedHandler;
import com.cardinal.tech.bzfx.service.impl.JwtUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.config.core.GrantedAuthorityDefaults;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true,proxyTargetClass = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private final JwtUserDetailsService jwtUserDetailsService;
    private final JwtAuthenticationEntryPoint unauthorizedHandler;
    private final UserAccessDeniedHandler amsAccessDeniedHandler;
    private final FilterIgnoreUrlConfig filterIgnoreUrlConfig;
    private final JwtAuthorizationTokenFilter authenticationTokenFilter;

    public SecurityConfig(JwtUserDetailsService jwtUserDetailsService, JwtAuthenticationEntryPoint unauthorizedHandler, UserAccessDeniedHandler amsAccessDeniedHandler, FilterIgnoreUrlConfig filterIgnoreUrlConfig, JwtAuthorizationTokenFilter authenticationTokenFilter) {
        this.jwtUserDetailsService = jwtUserDetailsService;
        this.unauthorizedHandler = unauthorizedHandler;
        this.amsAccessDeniedHandler = amsAccessDeniedHandler;
        this.filterIgnoreUrlConfig = filterIgnoreUrlConfig;
        this.authenticationTokenFilter = authenticationTokenFilter;
    }

    @Autowired
    public void configGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(jwtUserDetailsService).passwordEncoder(passwordEncoder());
    }

    @Bean
    public GrantedAuthorityDefaults grantedAuthorityDefaults() {
        return new GrantedAuthorityDefaults(""); // Remove the ROLE_ prefix
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new UserPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.headers().frameOptions().disable();
        // 授权异常及不创建会话
        http.exceptionHandling().accessDeniedHandler(amsAccessDeniedHandler).authenticationEntryPoint(unauthorizedHandler).and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        // 允许不登录访问的接口
        ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry registry = http.authorizeRequests();
        // 允许options 方法无需授权访问
        registry.antMatchers(HttpMethod.OPTIONS, "/**").anonymous();
        // 从配置文件读取不需要登录就能访问的url
        filterIgnoreUrlConfig.getUrls().parallelStream().forEach(url -> registry.antMatchers(url).permitAll());
        // 从配置文件读取需要登录才能访问的url
        filterIgnoreUrlConfig.getAuthenticates().parallelStream().forEach(url -> registry.antMatchers(url).authenticated());
        // 其他严格控制权限，必须拥有的菜单中对应的api_url 才允许访问
//        registry.anyRequest().access("@PermissionService.hasPermission(request,authentication)");
        registry.anyRequest().authenticated();
        // token 拦截配置在security 用户名和密码拦截器之前
        http.addFilterBefore(authenticationTokenFilter, UsernamePasswordAuthenticationFilter.class);
    }

    /**
     * 配置token filter 忽略的路径
     *
     * @param web
     * @throws Exception
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring()
                .antMatchers(
                        HttpMethod.GET,
                        "/*.html",
                        "/**/*.html",
                        "/**/*.css",
                        "/**/*.js"
                );
    }
}
