package com.vinodv.annotations.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.vinodv.annotations.*"})
public class AppConfig {

}
