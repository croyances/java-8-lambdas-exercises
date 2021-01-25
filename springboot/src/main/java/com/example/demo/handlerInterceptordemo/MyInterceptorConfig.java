package com.example.demo.handlerInterceptordemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class MyInterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new MyInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/d.html")
        //  .excludePathPatterns("/*.html")
        //    .excludePathPatterns("/cache");
        ;

    }

//    @Override
//    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/** ")
//                .addResourceLocations("classpath:/static/");
//        super.addResourceHandlers(registry);
//    }


}
