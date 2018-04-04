package com.wanggt.freedom.spring.study.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.wanggt.freedom.spring.study.util.LogUtil;

/**
 * 此类定义了切面类,根据参数匹配实现AOP
 * 
 * @author freedom wang
 * @date 2018年4月4日下午6:54:38
 * @version 1.0
 */
@Component
@Aspect
public class ArgsAspect {

	@Pointcut("args(String) && within(com.wanggt.freedom.spring.study.service..*)")
	public void pointCut() {
	}

	@Before("pointCut()")
	public void before() {
		LogUtil.getLog().info("参数匹配成功,before方法执行");
	}
	
	@After("pointCut()")
	public void after() {
		LogUtil.getLog().info("参数匹配成功,after方法执行");
	}
}
