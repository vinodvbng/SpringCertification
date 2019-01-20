package com.vinodv.proceedingjoinpoint.annotation.main;

import com.vinodv.proceedingjoinpoint.annotation.config.AppConfig;
import com.vinodv.proceedingjoinpoint.annotation.service.UserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.someUserService(1,2);
        context.close();

    }

}
