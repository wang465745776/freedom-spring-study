package com.wanggt.freedom.spring.study.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.wanggt.freedom.spring.study.annotation.Log;

/**
 * 定义一个切面.<br>
 * 这个切面设置切入点为注解 {@link Log},即使用了注解 {@link Log}的方法就可以被写入日志
 * 
 * @author freedom wang
 * @date 2018年4月4日下午2:45:34
 * @version 1.0
 */
@Aspect
@Component
public class AnnotationLogAspect {

	private Logger logger = LoggerFactory.getLogger(AnnotationLogAspect.class);

	@Pointcut("@annotation(com.wanggt.freedom.spring.study.annotation.Log)")
	public void pointCut() {
	}

	@Before("pointCut()")
	public void doBefore() {
		logger.info("AnnotationLogAspect#doBefore 方法执行了");
	}

	// @AfterReturning("pointCut()")
	// public void afterReturning() {
	// logger.info("LogAspect#afterReturning is invoke");
	// }
	//
	// @AfterThrowing("pointCut()")
	// public void afterThrowing() {
	// logger.info("LogAspect#afterThrowing is invoke");
	// }
	//
	// @Around("pointCut()")
	// public void around() {
	// logger.info("LogAspect#around is invoke");
	// }
}
