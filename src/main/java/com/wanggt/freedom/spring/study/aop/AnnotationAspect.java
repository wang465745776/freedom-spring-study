package com.wanggt.freedom.spring.study.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.wanggt.freedom.spring.study.util.LogUtil;

/**
 * 定义一个切面类.匹配注解以实现AOP
 * 
 * @author freedom wang
 * @date 2018年4月4日下午2:45:34
 * @version 1.0
 */
@Aspect
@Component
public class AnnotationAspect {

	/**
	 * 定义一个方法级别上的切入点
	 * @author freedom wang
	 * @date 2018年4月4日下午8:28:34
	 * @version 1.0
	 */
	@Pointcut("@annotation(com.wanggt.freedom.spring.study.annotation.Log)")
	public void pointCut() {
	}

	/**
	 * 定义一个类级别上的切入点
	 * @author freedom wang
	 * @date 2018年4月4日下午8:28:34
	 * @version 1.0
	 */
	@Pointcut("@target(com.wanggt.freedom.spring.study.annotation.Log) && within(com.wanggt.freedom.spring.study.service..*)")
	public void targetPointcut() {
	}

	/**
	 * 定义一个类级别上的切入点
	 * @author freedom wang
	 * @date 2018年4月4日下午8:28:34
	 * @version 1.0
	 */
	@Pointcut("@within(com.wanggt.freedom.spring.study.annotation.Log) && within(com.wanggt.freedom.spring.study.service..*)")
	public void withinPointcut() {
	}

	/**
	 * 定义一个参数级别的上的切入点
	 * 
	 * @author freedom wang
	 * @date 2018年4月4日下午9:08:52
	 * @version 1.0
	 */
	@Pointcut("@args(com.wanggt.freedom.spring.study.annotation.Log) && within(com.wanggt.freedom.spring.study.service..*)")
	public void argsPointcut() {
	}

	/**
	 * 匹配一个方法上的Log注解
	 * 
	 * @author freedom wang
	 * @date 2018年4月4日下午9:09:31
	 * @version 1.0
	 */
	@Before("pointCut()")
	public void before() {
		LogUtil.getLog().info("方法级别的注解匹配成功,before方法执行");
	}

	/**
	 * 匹配一个方法上的参数上的Log注解
	 * 
	 * @author freedom wang
	 * @date 2018年4月4日下午9:10:35
	 * @version 1.0
	 */
	@Before("argsPointcut()")
	public void argsBefore() {
		LogUtil.getLog().info("方法级别的注解匹配成功,before方法执行");
	}

	/**
	 * 匹配一个类上有Log注解的类，target
	 * 
	 * @author freedom wang
	 * @date 2018年4月4日下午9:34:21
	 * @version 1.0
	 */
	@Before("targetPointcut()")
	public void targetBefore() {
		LogUtil.getLog().info("target类级别的注解匹配成功，targetBefore方法执行");
	}

	/**
	 * 匹配一个类上有Log注解的类，within
	 * 
	 * @author freedom wang
	 * @date 2018年4月4日下午9:34:21
	 * @version 1.0
	 */
	@Before("withinPointcut()")
	public void withinBefore() {
		LogUtil.getLog().info("within类级别的注解匹配成功，withinBefore方法执行");
	}
}
