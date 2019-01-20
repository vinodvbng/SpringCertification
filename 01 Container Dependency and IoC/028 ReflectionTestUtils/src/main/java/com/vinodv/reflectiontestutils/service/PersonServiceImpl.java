package com.vinodv.reflectiontestutils.service;

import com.vinodv.reflectiontestutils.model.Person;

public class PersonServiceImpl implements PersonService {

	@Override
	public Person newPerson() {
		return new Person();
	}

}
