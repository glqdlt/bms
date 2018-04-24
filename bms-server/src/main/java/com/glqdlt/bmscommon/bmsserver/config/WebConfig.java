package com.glqdlt.bmscommon.bmsserver.config;

import com.glqdlt.bmscommon.bmsserver.interceptor.CertificationInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

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
