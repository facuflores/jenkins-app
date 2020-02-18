package com.jenkins.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsAppApplication {

	public static void main(String[] args) {
		System.out.println("INICIO DE APLICACIÓN !!!");
		SpringApplication.run(JenkinsAppApplication.class, args);
	}

}
