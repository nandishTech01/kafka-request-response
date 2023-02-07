package com.kafka1.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.kafka1.kafka.Producer1;
import com.kafka1.payload.EmployeeKafka;


@RestController
public class MessageContoller {
	
	@Autowired
	private Producer1 producer1;

	public MessageContoller(Producer1 producer1) {
		super();
		this.producer1 = producer1;
	}

	@PostMapping("/publish")
	public ResponseEntity<String> publish(@RequestBody EmployeeKafka employeeKafka){
		producer1.sendjsonmessage(employeeKafka);
		
		return ResponseEntity.ok("message sent successfully...");
		
	}
}
