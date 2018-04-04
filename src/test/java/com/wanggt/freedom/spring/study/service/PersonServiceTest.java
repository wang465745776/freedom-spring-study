package com.wanggt.freedom.spring.study.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.wanggt.freedom.spring.study.entity.PersonBean;
import com.wanggt.freedom.spring.study.util.LogUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonServiceTest {
	@Autowired
	private PersonService personService;

	@Test
	public void testPerson() {
		PersonBean addPerson = personService.addPerson(1l, "freedom");
		Assert.assertNotNull(addPerson);
		
		LogUtil.getLog().info("-----------------------------");
		
		PersonBean deletePerson = personService.deletePerson(1l);
		Assert.assertNotNull(deletePerson);
	}
}
