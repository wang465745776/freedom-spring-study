package com.wanggt.freedom.spring.study.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

import com.wanggt.freedom.spring.study.service.AuthorityService;
import com.wanggt.freedom.spring.study.service.impl.AuthorityServiceImpl;

/**
 * 使用注解 {@link DeclareParents}给角色服务加入权限功能
 * 
 * @author freedom wang
 * @date 2018年4月4日下午6:29:52
 * @version 1.0
 */
@Aspect
@Component
public class DeclareParentsAspect {

	/**
	 * 声明所有实现RoleService的子类都添加权限的功能
	 */
	@DeclareParents(value = "com.wanggt.freedom.spring.study.service.RoleService+", defaultImpl = AuthorityServiceImpl.class)
	private AuthorityService authorityService;
}
