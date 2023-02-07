package com.kafka2.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee2Kafka {

	private String code;
	
	private String name;

	@Override
	public String toString() {
		return "Employee2Kafka [code=" + code + ", name=" + name + "]";
	}
	
	
}
