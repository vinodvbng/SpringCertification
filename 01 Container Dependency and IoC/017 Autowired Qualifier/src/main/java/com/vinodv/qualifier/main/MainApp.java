package com.vinodv.qualifier.main;

import com.vinodv.qualifier.config.AppConfig;
import com.vinodv.qualifier.service.AnimalService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AnimalService animalService = context.getBean(AnimalService.class);
        animalService.getAnimal().printName();
        animalService.getZoo().getZooName();
        context.close();

    }

}
