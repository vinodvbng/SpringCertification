package com.vinodv.pointcut.annotation.config;

import com.vinodv.pointcut.annotation.aspect.UserAspect;
import com.vinodv.pointcut.annotation.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public UserService userService(){
        return new UserService();
    }

    @Bean
    public UserAspect userAspect(){
        return new UserAspect();
    }

}
