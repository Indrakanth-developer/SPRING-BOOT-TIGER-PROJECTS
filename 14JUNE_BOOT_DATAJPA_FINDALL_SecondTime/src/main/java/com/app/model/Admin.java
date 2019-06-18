package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class Admin {

	@Id
	private Integer aid;
	private String aname;
	private Double asal;
	public Admin(Integer aid, String aname, Double asal) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.asal = asal;
	}
	

}
