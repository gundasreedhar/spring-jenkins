package com.gunda.jenkin.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {
	
	public static org.slf4j.Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	@Test
	 contextLoads() {
		logger.info("test case executing...");
		assertEquals(true, true);
		
	}

}
