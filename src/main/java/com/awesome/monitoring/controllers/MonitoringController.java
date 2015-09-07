package com.awesome.monitoring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonitoringController {

	@RequestMapping("/hello")
	public String hello() {
		return "hello world!";
	}
}
