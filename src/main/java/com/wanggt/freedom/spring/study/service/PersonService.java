package com.wanggt.freedom.spring.study.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.wanggt.freedom.spring.study.annotation.Log;

@Service
public class PersonService {
	private Logger logger = LoggerFactory.getLogger(PersonService.class);

	@Log
	public void addPerson() {
		logger.info("PersonService#addPerson is invoke");
	}
}
