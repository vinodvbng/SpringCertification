package com.vinodv.afterthrowing.annotation.main;

import com.vinodv.afterthrowing.annotation.config.AppConfig;
import com.vinodv.afterthrowing.annotation.service.UserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) throws Exception {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.someUserService();
        context.close();

    }

}
