package com.wanggt.freedom.spring.study.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 通过匹配包/类型，来实现AOP
 * @author freedom wang
 * @date 2018年4月4日上午10:17:13
 * @version 1.0
 */
@Aspect
@Component
public class LogAspect2 {

	private Logger logger = LoggerFactory.getLogger(LogAspect2.class);

	@Pointcut(value = "within(com.wanggt.freedom.spring.study.service.*)")
	public void pointCut() {
	}
	
	@Before("pointCut()")
	public void doBefore() {
		logger.info("LogAspect2#doBefore is invoke");
	}
	
	@After("pointCut()")
	public void after() {
		logger.info("LogAspect2#after is invoke");
	}
	
	@AfterReturning("pointCut()")
	public void afterReturning() {
		logger.info("LogAspect2#afterReturning is invoke");
	}
	
	@AfterThrowing("pointCut()")
	public void afterThrowing() {
		logger.info("LogAspect2#afterThrowing is invoke");
	}
	
	@Around("pointCut()")
	public void around() {
		logger.info("LogAspect2#around is invoke");
	}
}
