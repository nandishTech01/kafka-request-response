package com.kafka1.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeKafka {


	private int id;
	private String name;
	private String city;
	private String mobile;
	
	@Override
	public String toString() {
		return "EmployeeKafka [id=" + id + ", name=" + name + ", city=" + city + ", mobile=" + mobile + "]";
	}
	
	
	
}
