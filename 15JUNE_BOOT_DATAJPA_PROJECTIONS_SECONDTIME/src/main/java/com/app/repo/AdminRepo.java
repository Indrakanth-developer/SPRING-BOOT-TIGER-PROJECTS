package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {

	<T> List<T> findByAsalOrderByAsal(Double d,Class<T> cls);
	<T> List<T> findByAsalOrderByAname(Double d,Class<T> cls);
	<T> List<T> findByAnameContainingOrderByAidDesc(String s,Class<T> cls);
	
	interface list1{
		public String getAname();
		public Double getAsal();
	}
	
	interface list2{
		public Integer getAid();
		public String getAname();
	}
	
	interface list3{
		public Integer getAid();
		public String getAname();
		public Double getAsal();
	}
}
