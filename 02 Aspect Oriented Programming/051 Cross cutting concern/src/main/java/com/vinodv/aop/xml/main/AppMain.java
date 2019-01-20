package com.vinodv.aop.xml.main;

import com.vinodv.aop.xml.service.UserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = context.getBean(UserService.class);
        userService.someUserService();
        context.close();

    }

}
