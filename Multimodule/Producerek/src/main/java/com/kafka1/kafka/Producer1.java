package com.kafka1.kafka;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.kafka1.payload.EmployeeKafka;


@Service
public class Producer1 {

	public Producer1(KafkaTemplate<String, EmployeeKafka> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}

	@Autowired
	private KafkaTemplate<String, EmployeeKafka> kafkaTemplate;

	private static final Logger LOGGER = LoggerFactory.getLogger(Producer1.class);

	public void sendjsonmessage(EmployeeKafka data) {

		LOGGER.info(String.format("message send->%s", data.toString()));

		Message<EmployeeKafka> message = MessageBuilder
				.withPayload(data)
				.setHeader(KafkaHeaders.TOPIC, "redirectDemo")
				.build();

		kafkaTemplate.send(message);
	}
}
