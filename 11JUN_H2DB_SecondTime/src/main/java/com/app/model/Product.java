package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private Integer id;
	private String pname;
	public Product() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + "]";
	}
	public Product(String pname) {
		super();
		this.pname = pname;
	}
	public Product(Integer id, String pname) {
		super();
		this.id = id;
		this.pname = pname;
	}
	
}

