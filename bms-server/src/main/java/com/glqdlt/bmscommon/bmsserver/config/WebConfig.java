package com.glqdlt.bmscommon.bmsserver.config;

import com.glqdlt.bmscommon.bmsserver.controller.CertificationInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableAspectJAutoProxy
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        super.addInterceptors(registry);
        registry
                .addInterceptor(new CertificationInterceptor())
                .addPathPatterns("/*")
                .excludePathPatterns("/login");

    }
}
