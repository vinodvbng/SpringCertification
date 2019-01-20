package com.vinodv.junitspring.service;

import com.vinodv.junitspring.model.Order;

public interface SampleService {
	
	public Order getOrder(int id);
	
	public Order createOrder(Order order);
	
}
