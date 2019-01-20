package com.vinodv.reflectiontestutils.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vinodv.reflectiontestutils.service.PersonService;
import com.vinodv.reflectiontestutils.service.PersonServiceImpl;

@Configuration
public class AppConfig {
	
	@Bean
	public PersonService getPerson() {
		return new PersonServiceImpl();
	}
	
}
