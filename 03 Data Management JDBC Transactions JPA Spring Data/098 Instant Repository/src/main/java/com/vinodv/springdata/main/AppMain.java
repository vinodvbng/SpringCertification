package com.vinodv.springdata.main;

import com.vinodv.springdata.config.AppConfig;
import com.vinodv.springdata.service.CityService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) throws Exception {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CityService cityService = context.getBean(CityService.class);
        System.out.println(cityService.findAll1());
        System.out.println(cityService.findAll2());
        context.close();

    }

}
