package com.wanggt.freedom.spring.study.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日志工具类
 * @author freedom wang
 * @date 2018年4月4日下午8:07:09
 * @version 1.0
 */
public class LogUtil {

	private static Logger logger;

	/**
	 * 获取日志对象
	 * @return
	 * @author freedom wang
	 * @date 2018年4月4日下午8:08:45
	 * @version 1.0
	 */
	public static Logger getLog() {
		if (logger == null) {
			logger = LoggerFactory.getLogger(LogUtil.class);
		}

		return logger;
	}
}
