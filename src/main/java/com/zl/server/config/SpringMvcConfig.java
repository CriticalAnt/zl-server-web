package com.zl.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author: wtao
 * @Date: 2018/12/16 0:41
 * @Version 1.0
 */
@Configuration
public class SpringMvcConfig extends WebMvcConfigurerAdapter {

    //视图映射
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("login");
        registry.addViewController("/").setViewName("login");
    }
}
