package com.awesome.monitoring.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;

public class OrderTransmissionTask {
	
	private static final Logger log = LoggerFactory.getLogger(OrderTransmissionTask.class);
	
	@Async
	@Scheduled(fixedDelay = 5000)
	public void execute() throws InterruptedException {
		log.info("checking order transmission");
		
		Thread.sleep(2000);
		
		log.info("finished checking order transmission");
		
	}

}
