package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootLoggingApplicationTests {
org.slf4j.Logger logger=LoggerFactory.getLogger(getClass());

	@Test
	public void contextLoads() {
		logger.trace("这是TRACR的日志");
		logger.debug("这是debug的日志");
		logger.info("这是info日志");
		logger.warn("这是warn日志");
		logger.error("这是error日志");
	}

}
