package com.jenkins.dev;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCicdApplicationTest {
	
	private static Logger logger = LoggerFactory.getLogger(SpringCicdApplicationTest.class);

	@Test
	public void test() {
		logger.info("Test case starting");
		assertEquals(true, true);
	}

}
