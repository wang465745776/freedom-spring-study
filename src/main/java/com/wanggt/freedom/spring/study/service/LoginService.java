package com.wanggt.freedom.spring.study.service;

import com.wanggt.freedom.spring.study.entity.PersonBean;

/**
 * 登录服务-Service
 * @author freedom wang
 * @date 2018年4月4日下午2:40:43
 * @version 1.0
 */
public interface LoginService {

	/**
	 * 系统登录
	 * @param account 用户名
	 * @param password 密码
	 * @return
	 * @author freedom wang
	 * @date 2018年4月4日下午2:40:30
	 * @version 1.0
	 */
	public PersonBean login(String account, String password);

	/**
	 * 修改密码
	 * @param account
	 * @param oldPassword
	 * @param password
	 * @return
	 * @author freedom wang
	 * @date 2018年4月4日下午4:25:20
	 * @version 1.0
	 */
	public PersonBean updatePassword(String account, String oldPassword, String password);

}
