package com.wanggt.freedom.spring.study.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.wanggt.freedom.spring.study.entity.RoleBean;
import com.wanggt.freedom.spring.study.service.RoleService;

/**
 * 角色服务-ServiceImpl
 * @author freedom wang
 * @date 2018年4月4日下午4:58:28
 * @version 1.0
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {
	private Logger logger = LoggerFactory.getLogger(RoleServiceImpl.class);

	@Override
	public RoleBean addRole(String name) {
		logger.info("新增角色方法执行");

		return new RoleBean(name);
	}

	@Override
	public RoleBean deleteRole(String name) {
		logger.info("删除角色方法执行");

		return new RoleBean(name);
	}

}
