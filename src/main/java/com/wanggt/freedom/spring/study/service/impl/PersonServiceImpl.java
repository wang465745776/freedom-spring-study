package com.wanggt.freedom.spring.study.service.impl;

import org.springframework.stereotype.Service;

import com.wanggt.freedom.spring.study.annotation.Log;
import com.wanggt.freedom.spring.study.entity.PersonBean;
import com.wanggt.freedom.spring.study.service.PersonService;
import com.wanggt.freedom.spring.study.util.LogUtil;

/**
 * 人员服务-ServiceImpl
 * 
 * @author freedom wang
 * @date 2018年4月4日下午8:33:15
 * @version 1.0
 */
@Service("personService")
@Log
public class PersonServiceImpl implements PersonService {

	@Log
	@Override
	public PersonBean addPerson(Long id, String name) {
		LogUtil.getLog().info("新增人员");
		return new PersonBean(id, name);
	}

	@Override
	public PersonBean deletePerson(@Log Long id) {
		LogUtil.getLog().info("删除人员");
		return new PersonBean(id, "");
	}
	
}
