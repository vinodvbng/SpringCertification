package com.vinodv.junitspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vinodv.junitspring.service.SampleService;
import com.vinodv.junitspring.service.SampleServiceImpl;

@Configuration
public class AppConfig {

	@Bean
	public SampleService getSampleService() {
		return new SampleServiceImpl();
	}
	
}
