package com.redisdistribution.mylock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class RedisDistributeLockApplication {

	public static void main(String[] args) {
		try {
			Properties properties = new Properties();
			properties.load(RedisDistributeLockApplication.class.getResourceAsStream("/log4j.properties"));

			SpringApplication app = new SpringApplication(RedisDistributeLockApplication.class);
			app.setDefaultProperties(properties);
			app.run(args);
			System.out.println("Start success!");
		} catch (Exception ex) {
			System.out.println("Fail to start DjlDCSpringBootApplication due to exception:" + ex.toString());
		}
	}
}
