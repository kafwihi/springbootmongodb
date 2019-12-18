package com.kafwihi.springmongodb;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
@EntityScan("com.kafwihi.springmongodb.model")
@EnableMongoRepositories("com.kafwihi.springmongodb.repository")
@SpringBootApplication(scanBasePackages = "com.kafwihi.springmongodb")
//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
