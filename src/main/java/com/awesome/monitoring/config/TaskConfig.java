package com.awesome.monitoring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.awesome.monitoring.tasks.OrderCancelationTask;
import com.awesome.monitoring.tasks.OrderTransmissionTask;

@Configuration
@EnableAsync
@EnableScheduling
public class TaskConfig {

	
	@Bean
	public OrderTransmissionTask orderTransmissionTask() {
		return new OrderTransmissionTask();
	}
	
	@Bean
	public OrderCancelationTask orderCancelationTask() {
		return new OrderCancelationTask();
	}
}
