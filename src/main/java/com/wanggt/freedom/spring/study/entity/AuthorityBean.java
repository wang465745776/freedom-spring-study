package com.wanggt.freedom.spring.study.entity;

/**
 * 权限服务-Bean
 * 
 * @author freedom wang
 * @date 2018年4月4日下午6:27:42
 * @version 1.0
 */
public class AuthorityBean {

	private String name;

	public AuthorityBean(String name) {
		super();
		this.name = name;
	}

	public AuthorityBean() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
