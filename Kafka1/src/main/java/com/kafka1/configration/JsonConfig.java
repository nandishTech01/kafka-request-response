package com.kafka1.configration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class JsonConfig {

	@Bean
	public NewTopic redirectDemo() {
		return TopicBuilder.name("redirectDemo").build();
	}
}
