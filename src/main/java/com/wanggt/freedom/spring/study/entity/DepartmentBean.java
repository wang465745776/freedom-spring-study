package com.wanggt.freedom.spring.study.entity;

/**
 * 部门服务-Bean
 * 
 * @author freedom wang
 * @date 2018年4月4日下午6:57:16
 * @version 1.0
 */
public class DepartmentBean {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DepartmentBean(String name) {
		super();
		this.name = name;
	}

	public DepartmentBean() {
		super();
	}

}
