package com.kafka2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kafka2.payload.Employee2Kafka;

@RestController
public class EmployeeController {

	@PostMapping("/employees")
	public ResponseEntity<String> publish(@RequestBody Employee2Kafka employee2Kafka){
	
	return ResponseEntity.ok("resource sent successfully..");
	}
}
