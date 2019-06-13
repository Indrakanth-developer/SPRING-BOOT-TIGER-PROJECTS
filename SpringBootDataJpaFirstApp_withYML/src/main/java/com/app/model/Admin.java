package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
public class Admin {

	@Id
	private Integer adminId;
	private String adminName;
	public Admin(Integer adminId, String adminName) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
	}
	
	
	
}
