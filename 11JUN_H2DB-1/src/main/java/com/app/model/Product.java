package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Product {

	@Id
	private Integer id;
	private String ename;
	public Product(String ename) {
		super();
		this.ename = ename;
	}
	public Product() {
		super();
	}

	
	public Product(Integer id, String ename) {
		super();
		this.id = id;
		this.ename = ename;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", ename=" + ename + "]";
	}
	public Product(Integer id) {
		super();
		this.id = id;
	}
	
	
}
