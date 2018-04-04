package com.wanggt.freedom.spring.study.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.wanggt.freedom.spring.study.entity.AuthorityBean;
import com.wanggt.freedom.spring.study.service.AuthorityService;

/**
 * 权限服务-ServiceImpl
 * @author freedom wang
 * @date 2018年4月4日下午6:28:48
 * @version 1.0
 */
@Service("authorityService")
public class AuthorityServiceImpl implements AuthorityService {
	private Logger logger = LoggerFactory.getLogger(AuthorityServiceImpl.class);

	@Override
	public AuthorityBean addAuthority(String name) {
		logger.info("新增权限");
		return new AuthorityBean(name);
	}

}
