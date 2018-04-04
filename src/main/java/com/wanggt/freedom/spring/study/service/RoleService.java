package com.wanggt.freedom.spring.study.service;

import com.wanggt.freedom.spring.study.entity.RoleBean;

/**
 * 角色服务-Service
 * @author freedom wang
 * @date 2018年4月4日下午4:55:09
 * @version 1.0
 */
public interface RoleService {

	/**
	 * 新增角色
	 * @param name
	 * @return
	 * @author freedom wang
	 * @date 2018年4月4日下午4:56:19
	 * @version 1.0
	 */
	public RoleBean addRole(String name);

	/**
	 * 删除角色
	 * @param name
	 * @return
	 * @author freedom wang
	 * @date 2018年4月4日下午4:56:38
	 * @version 1.0
	 */
	public RoleBean deleteRole(String name);
}
