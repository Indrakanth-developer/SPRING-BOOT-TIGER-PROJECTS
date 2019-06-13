package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
public class Product {

	@Id
	private Integer pid;
	private String pname;
	private double psal;
	public Product(Integer pid, String pname, double psal) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.psal = psal;
	}

	
}
