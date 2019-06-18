package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Admin {

	@Id
	private Integer aid;
	private String aname;
	private Double asal;
	
	
}
