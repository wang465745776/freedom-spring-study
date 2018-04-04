package com.wanggt.freedom.spring.study.service;

import com.wanggt.freedom.spring.study.annotation.Log;
import com.wanggt.freedom.spring.study.entity.PersonBean;

/**
 * 人员服务-Service
 * 
 * @author freedom wang
 * @date 2018年4月4日下午8:31:06
 * @version 1.0
 */
public interface PersonService {

	/**
	 * 新增人员
	 * @param name
	 * @return
	 * @author freedom wang
	 * @date 2018年4月4日下午8:31:00
	 * @version 1.0
	 */
	public PersonBean addPerson(Long id, String name);
	
	/**
	 * 删除人员
	 * @param id
	 * @return
	 * @author freedom wang
	 * @date 2018年4月4日下午8:36:30
	 * @version 1.0
	 */
	public PersonBean deletePerson(@Log Long id);
}
