package com.wanggt.freedom.spring.study.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.wanggt.freedom.spring.study.annotation.Log;
import com.wanggt.freedom.spring.study.entity.PersonBean;
import com.wanggt.freedom.spring.study.service.LoginService;

/**
 * 登录服务-ServiceImpl
 * @author freedom wang
 * @date 2018年4月4日下午2:40:59
 * @version 1.0
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService {

	private Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);

	@Log
	@Override
	public PersonBean login(String account, String password) {
		logger.info("登录方法执行了");
		if (account.equals("admin") && password.equals("admin")) {
			return new PersonBean(1l, "admin");
		}
		return null;
	}
	
	@Override
	public PersonBean updatePassword(String account, String oldPassword, String password) {
		logger.info("修改密码方法执行了");
		if (account.equals("admin") && password.equals("admin")) {
			return new PersonBean(1l, "admin");
		}
		return null;
	}
}
