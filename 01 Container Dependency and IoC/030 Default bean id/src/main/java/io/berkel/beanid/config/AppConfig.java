package com.vinodv.beanid.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vinodv.beanid.service.HelloWorld;

@Configuration
public class AppConfig {
	
		@Bean
		public HelloWorld getHelloWorld() {
			return new HelloWorld();
		}

}
