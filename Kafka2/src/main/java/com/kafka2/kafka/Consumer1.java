package com.kafka2.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


import com.kafka2.payload.Employee2Kafka;



@Service
public class Consumer1 {
private static final Logger LOGGER = LoggerFactory.getLogger(Consumer1.class);
	
	@KafkaListener(groupId = "myGroup",topics = "redirectDemo")
	public void consume(String message) {
		
		LOGGER.info(String.format("Json Data received -> %s",message.toString() ));
		
		Employee2Kafka e1 = new Employee2Kafka();
		e1.setCode("dfgdfh");
		e1.setName("employee1");

	}
}
