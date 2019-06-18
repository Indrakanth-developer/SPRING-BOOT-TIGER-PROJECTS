package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Phones {

	@Id
	private Integer pid;
	private String model;
	private String sim;
	private Double balance;
	
}
