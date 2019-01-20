package com.vinodv.pointcut.annotation.main;

import com.vinodv.pointcut.annotation.config.AppConfig;
import com.vinodv.pointcut.annotation.service.UserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.someUserService();
        context.close();

    }

}
