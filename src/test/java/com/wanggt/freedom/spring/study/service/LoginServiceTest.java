package com.wanggt.freedom.spring.study.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.wanggt.freedom.spring.study.entity.PersonBean;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginServiceTest {
	@Autowired
	private LoginService loginService;

	@Test
	public void testLogin() {
		PersonBean login = loginService.login("admin", "admin");
		Assert.assertNotNull(login);
		
		PersonBean updatePassword = loginService.updatePassword("admin", "admin", "admin");
		Assert.assertNotNull(updatePassword);
	}
	
	@Test
	public void testLoginError() {
		PersonBean login = loginService.login("admin", "admin1");
		Assert.assertNull(login);
	}
}
