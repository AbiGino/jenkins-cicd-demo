package com.demo.jenkinspipelinedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsPipelineDemoApplication {

	public static void main(String[] args) {
		System.out.println("Sample project for Jenkins pipeline..");
		SpringApplication.run(JenkinsPipelineDemoApplication.class, args);
	}

}
