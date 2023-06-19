package com.jenkinscicddemo.jenkinscicddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsCicdDemoApplication {

	public static void main(String[] args) {
		System.out.println("Sample Jenkins project...");
		SpringApplication.run(JenkinsCicdDemoApplication.class, args);
	}

}
