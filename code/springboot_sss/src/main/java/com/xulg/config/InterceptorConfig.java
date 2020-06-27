package com.xulg.config;

import com.xulg.interceptor.PrivilegeIntercepter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @author xulin
 * @date 2020/6/27 16:14
 * @description
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private PrivilegeIntercepter privilegeIntercepter
            ;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController()
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(privilegeIntercepter).addPathPatterns("/user/**")
                .excludePathPatterns("/user/login","/");

    }

}
