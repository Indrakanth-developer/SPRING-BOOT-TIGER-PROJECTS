package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@AllArgsConstructor
@RequiredArgsConstructor
public class Student {

	@Id
	@GeneratedValue
	
	private Integer id;
	@NonNull
	private String sname;
	
	
	
	public Student() {
		super();
	}
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + "]";
	}


	public Student(Integer id) {
		super();
		this.id = id;
	}
	
}
