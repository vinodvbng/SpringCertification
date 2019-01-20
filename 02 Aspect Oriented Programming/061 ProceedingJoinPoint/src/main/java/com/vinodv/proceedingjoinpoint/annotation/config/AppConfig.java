package com.vinodv.proceedingjoinpoint.annotation.config;

import com.vinodv.proceedingjoinpoint.annotation.aspect.UserAspect;
import com.vinodv.proceedingjoinpoint.annotation.service.UserService;
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
