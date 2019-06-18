package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {

	List<twocols> findByAsalIs(Double d);
	List<last> findByAnameIs(String d);
	
	<T> List<T> findByAidIs(Integer id, Class<T> cls);
	<T> List<T> findByAsalIs(Double d,Class<T> cls);

	interface twocols{

		public Integer getAid();
		public String getAname();
	}
	interface last{

		public String getAname();
		public Double getAsal();
	}
	interface all{
		public Integer getAid();
		public String getAname();
		public Double getAsal();
		
	}


}
