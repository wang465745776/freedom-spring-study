package com.wanggt.freedom.spring.study.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.wanggt.freedom.spring.study.entity.AuthorityBean;
import com.wanggt.freedom.spring.study.entity.RoleBean;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleServiceTest {
	private Logger logger = LoggerFactory.getLogger(RoleServiceTest.class);
	
	@Autowired
	private RoleService roleService;

	@Test
	public void testRole() {
		RoleBean roleBean = roleService.addRole("admin");
		Assert.assertNotNull(roleBean);
		
		logger.info("----------------------------------------------");

		RoleBean bean = roleService.deleteRole("admin");
		Assert.assertNotNull(bean);
		
		logger.info("----------------------------------------------");

		AuthorityBean addAuthority = ((AuthorityService) roleService).addAuthority("add");
		Assert.assertNotNull(addAuthority);
	}
}
