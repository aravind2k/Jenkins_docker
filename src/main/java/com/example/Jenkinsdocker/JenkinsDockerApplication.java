package com.example.Jenkinsdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDockerApplication.class, args);
		System.out.println("Auto build worked");
	}

}
