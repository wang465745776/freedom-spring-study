package com.wanggt.freedom.spring.study.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.wanggt.freedom.spring.study.entity.DepartmentBean;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentServiceTest {
	private Logger logger = LoggerFactory.getLogger(DepartmentServiceTest.class);
	@Autowired
	private DepartmentService departmentService;

	@Test
	public void testAddDepartment() {
		DepartmentBean addDepartment = departmentService.addDepartment("研发部门");
		Assert.assertNotNull(addDepartment);
		
		logger.info("--------------------------------");
		
		DepartmentBean bean = departmentService.getDepartments();
		Assert.assertNotNull(bean);
	}
}
