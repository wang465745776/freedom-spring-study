package com.wanggt.freedom.spring.study.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.wanggt.freedom.spring.study.entity.DepartmentBean;
import com.wanggt.freedom.spring.study.service.DepartmentService;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {
	private Logger logger = LoggerFactory.getLogger(DepartmentServiceImpl.class);

	@Override
	public DepartmentBean addDepartment(String name) {
		logger.info("新增部门");
		return new DepartmentBean(name);
	}
	
	@Override
	public DepartmentBean getDepartments() {
		logger.info("获取所有部门");
		return new DepartmentBean("研发部门");
	}

}
