package com.wanggt.freedom.spring.study.service;

import com.wanggt.freedom.spring.study.entity.AuthorityBean;

/**
 * 权限服务-Service
 * 
 * @author freedom wang
 * @date 2018年4月4日下午6:25:59
 * @version 1.0
 */
public interface AuthorityService {

	/**
	 * 新增权限
	 * @param name
	 * @return
	 * @author freedom wang
	 * @date 2018年4月4日下午6:28:02
	 * @version 1.0
	 */
	public AuthorityBean addAuthority(String name);
}
