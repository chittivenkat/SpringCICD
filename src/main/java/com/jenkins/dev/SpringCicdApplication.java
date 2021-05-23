package com.jenkins.dev;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCicdApplication {
	
	private static Logger logger = LoggerFactory.getLogger(SpringCicdApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Spring Application Init..");
		//Thinkmore09 Jenkins Username
		//SpringCICD Jenkins Password
	}

	public static void main(String[] args) {
		logger.info("Spring Application Running..");
		SpringApplication.run(SpringCicdApplication.class, args);
	}

}
