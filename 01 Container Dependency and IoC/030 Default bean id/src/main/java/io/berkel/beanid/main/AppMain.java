package com.vinodv.beanid.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vinodv.beanid.config.AppConfig;
import com.vinodv.beanid.service.HelloWorld;

public class AppMain {
    
	public static void main( String[] args ) {
		
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		/**
		 * The bean id is the name of the method with @Bean annotation.
		 */
		HelloWorld helloWorld = (HelloWorld) context.getBean("getHelloWorld");
		helloWorld.setMessage("Hello World!");
		System.out.println(helloWorld.getMessage());
		context.close();
		
    }
	
}
