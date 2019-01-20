package com.vinodv.reflectiontestutils;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.util.ReflectionTestUtils;

import com.vinodv.reflectiontestutils.config.AppConfig;
import com.vinodv.reflectiontestutils.model.Person;
import com.vinodv.reflectiontestutils.service.PersonService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppConfig.class,loader=AnnotationConfigContextLoader.class)
public class AppTest {
	
	@Autowired
	private PersonService personService;
	
	@Test
	public void setField() {
		Person person = personService.newPerson();
		ReflectionTestUtils.setField(person, "id", 123456);
		assertEquals("Verifying that the person's ID (private field in the Person class) was set.", 123456, person.getId());
	}

}
