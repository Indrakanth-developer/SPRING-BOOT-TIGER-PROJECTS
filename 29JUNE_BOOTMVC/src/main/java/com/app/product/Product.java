package com.app.product;

public class Product {

	private String pname;

	public Product(String pname) {
		super();
		this.pname = pname;
	}

	public Product() {
		super();
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "Product [pname=" + pname + "]";
	}
	
	
}
