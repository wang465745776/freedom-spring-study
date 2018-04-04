package com.wanggt.freedom.spring.study.service;

import com.wanggt.freedom.spring.study.entity.DepartmentBean;

/**
 * 部门服务-Service
 * @author freedom wang
 * @date 2018年4月4日下午6:56:34
 * @version 1.0
 */
public interface DepartmentService {

	/**
	 * 新增部门
	 * @param name
	 * @return
	 * @author freedom wang
	 * @date 2018年4月4日下午6:57:55
	 * @version 1.0
	 */
	public DepartmentBean addDepartment(String name);
	
	/**
	 * 获取所有部门
	 * @return
	 * @author freedom wang
	 * @date 2018年4月4日下午8:02:25
	 * @version 1.0
	 */
	public DepartmentBean getDepartments();
}
