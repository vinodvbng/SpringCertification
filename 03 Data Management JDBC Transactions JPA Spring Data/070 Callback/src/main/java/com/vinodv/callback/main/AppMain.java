package com.vinodv.callback.main;

import com.vinodv.callback.config.AppConfig;
import com.vinodv.callback.service.UserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) throws Exception {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.performRowCallbackHandler();
        userService.performPreparedStatementCreator();
        userService.performCallableStatementCreator();
        context.close();

    }

}
