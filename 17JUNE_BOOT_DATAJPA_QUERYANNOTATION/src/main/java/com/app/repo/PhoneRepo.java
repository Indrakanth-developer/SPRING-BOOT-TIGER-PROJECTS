package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Phones;

public interface PhoneRepo extends JpaRepository<Phones, Integer> {

	@Query("select p.model from Phones p")	
	List<String> phoneNames();
	@Query("select p from Phones p")	
	List<Phones> allphones();
	@Query("select p.model,p.sim from Phones p")
	List<Object []> modelsims();
	
	@Query("select p.model, p.sim from Phones p where p.sim=?1")
	List<Object []> phonewithsim(String s);
	
	@Query("select max(p.balance) from Phones p")
	Double costliestphone();
	
	@Query("select p from Phones p where p.balance=(select max(q.balance) from Phones q)")
	List<Phones> costlyphonedetails();
	
	//NON SELECT QUERY METHODS
	@Query("update Phones p set p.balance=50.55 where p.model=:abc")
	@Modifying
	@Transactional
	int updateBalance(String abc);
}
