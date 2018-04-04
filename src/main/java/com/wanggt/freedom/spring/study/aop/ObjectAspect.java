package com.wanggt.freedom.spring.study.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 通过对象匹配,来实现AOP
 * @author freedom wang
 * @date 2018年4月4日下午4:51:15
 * @version 1.0
 */
@Aspect
@Component
public class ObjectAspect {

	private Logger logger = LoggerFactory.getLogger(ObjectAspect.class);

	@Pointcut("this(com.wanggt.freedom.spring.study.service.RoleService)")
	public void pointCut() {
	}
	
	@Pointcut("target(com.wanggt.freedom.spring.study.service.RoleService)")
	public void targetPointcut() {
	}

	@Before("pointCut()")
	public void before() {
		logger.info("this()对象匹配成功,before方法执行");
	}

	@After("pointCut()")
	public void after() {
		logger.info("this()对象匹配成功,after方法执行");
	}
	
	@Before("targetPointcut()")
	public void targetBefore() {
		logger.info("target()对象匹配成功,before方法执行");
	}
	
	@After("targetPointcut()")
	public void targetAfter() {
		logger.info("target()对象匹配成功,after方法执行");
	}

}
