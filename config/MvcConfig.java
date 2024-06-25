package com.lab.thelab.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class MvcConfig implements WebMvcConfigurer {
    //视图控制
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        登录视图设置,在浏览器中的路径是"/"或者login.html，就跳转到login.html
        //首先需要拦截
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("/adminmain.html").setViewName("index");
        registry.addViewController("/welcome.html").setViewName("welcome");
        registry.addViewController("/xgc_index_main.html").setViewName("xgcindex");
        registry.addViewController("/student_index.html").setViewName("student");
        registry.addViewController("/assistant_index.html").setViewName("assistant");
    }
}