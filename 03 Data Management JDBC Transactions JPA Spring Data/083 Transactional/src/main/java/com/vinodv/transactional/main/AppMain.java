package com.vinodv.transactional.main;

import com.vinodv.transactional.config.AppConfig;
import com.vinodv.transactional.service.UserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) throws Exception {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.performSQLQueries();
        context.close();

    }

}
