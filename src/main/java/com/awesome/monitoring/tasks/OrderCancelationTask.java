package com.awesome.monitoring.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;

public class OrderCancelationTask {

	private static final Logger log = LoggerFactory.getLogger(OrderCancelationTask.class);
	
	@Async
	@Scheduled(cron="${monitoring.cancelation}")
	public void execute() {
		log.info("checking order cancelation");
	}
}
