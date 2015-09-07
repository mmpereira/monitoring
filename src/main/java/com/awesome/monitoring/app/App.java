package com.awesome.monitoring.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages="com.awesome.monitoring")
public class App {
	
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
