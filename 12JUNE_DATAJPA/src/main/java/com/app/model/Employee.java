package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Employee {

	@Id
	@GeneratedValue
	private int eid;
	private String ename;
	public Employee(String ename) {
		super();
		this.ename = ename;
	}
	
	
}
