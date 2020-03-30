package com.info.n25175_info.interceptor;

import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Class Name:com.info.n25175_info.interceptor WebMvcConfiger
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/12/16 0016 14:31
 * Description: WebMvcConfiger
 * ==========================
 */
@Configuration
public class WebMvcConfiger implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/web*/**").excludePathPatterns("/login/*")
                .excludePathPatterns("/js/**").excludePathPatterns("/layuiadmin/**")
                .excludePathPatterns("/img/**").excludePathPatterns("/css/**");

/*
        registry.addInterceptor(new TologinInterceptor()).addPathPatterns("/login/to_login").addPathPatterns("/login/login");*/
    }

    @Bean
    public ServletListenerRegistrationBean registrationBean(){
        ServletListenerRegistrationBean servletListenerRegistrationBean=new ServletListenerRegistrationBean();
        servletListenerRegistrationBean.setListener(new LoginListener());
        return servletListenerRegistrationBean;
    }
}
