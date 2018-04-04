package com.wanggt.freedom.spring.study.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 此类为匹配包/类型的切面
 * @author freedom wang
 * @date 2018年4月4日下午4:10:20
 * @version 1.0
 */
@Component
@Aspect
public class PackageAspect {
	private Logger logger = LoggerFactory.getLogger(PackageAspect.class);

	/**
	 * 定义切入点<br>
	 * 切点表达式使用了within,表示执行这个类下的所有方法都是连接点
	 * 
	 * @author freedom wang
	 * @date 2018年4月4日下午4:12:27
	 * @version 1.0
	 */
	@Pointcut("within(com.wanggt.freedom.spring.study.service.impl.LoginServiceImpl)")
	public void pointCut() {
	};

	/**
	 * 定义切入点<br>
	 * 切入点使用了within,切入点表达式的意思是匹配包com.wanggt.freedom.spring.study.service.impl下的所有的类的所有方法
	 * 
	 * @author freedom wang
	 * @date 2018年4月4日下午4:34:08
	 * @version 1.0
	 */
	@Pointcut("within(com.wanggt.freedom.spring.study.service.impl.*)")
	public void somePackage() {
	};

	/**
	 * 定义一个通知,在包匹配成功时,做一个前置操作
	 * 
	 * @author freedom wang
	 * @date 2018年4月4日下午4:41:39
	 * @version 1.0
	 */
	@Before("somePackage()")
	public void somePackageBefore() {
		logger.info("包匹配成功,somePackageBefore方法执行!");
	}

	/**
	 * 定义一个通知,在包匹配成功时,做一个后置操作
	 * @author freedom wang
	 * @date 2018年4月4日下午4:42:07
	 * @version 1.0
	 */
	@After("somePackage()")
	public void somePackageAfter() {
		logger.info("包匹配成功,somePackageAfter方法执行!");
	}

	/**
	 * 定义一个通知,在执行方法前,输入一段日志
	 * @author freedom wang
	 * @date 2018年4月4日下午4:14:02
	 * @version 1.0
	 */
	@Before("pointCut()")
	public void before() {
		logger.info("类型匹配成功,before方法执行!");
	}

	/**
	 * 定义一个通知,在类型匹配之时,做一个后置操作
	 * @author freedom wang
	 * @date 2018年4月4日下午4:42:23
	 * @version 1.0
	 */
	@After("pointCut()")
	public void after() {
		logger.info("类型匹配成功,after方法执行!");
	}

}
