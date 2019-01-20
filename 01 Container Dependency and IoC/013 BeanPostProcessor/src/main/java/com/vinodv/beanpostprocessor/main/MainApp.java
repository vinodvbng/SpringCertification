package com.vinodv.beanpostprocessor.main;

import com.vinodv.beanpostprocessor.config.AppConfig;
import com.vinodv.beanpostprocessor.service.MessageService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageService messageService = ctx.getBean(MessageService.class);
        messageService.print();
        messageService.print();
        ctx.close();

    }

} 