package com.vinodv.annotations.main;

import com.vinodv.annotations.config.AppConfig;
import com.vinodv.annotations.service.EmployeeService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService employeeService = context.getBean(EmployeeService.class);
        employeeService.listEmployees();
        context.close();

    }

}
