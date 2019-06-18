package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer>{

	List<Admin> findByAnameIs(String x);
	List<Admin> findByAsal(Double x);
	List<Admin> findByAidLessThan(Integer x);

	List<Admin> findByAnameLike(String x);
	List<Admin> findByAnameContaining(String x);
	List<Admin> findByAnameNotLike(String x);
	List<Admin> findByAsalNotNull();
	List<Admin> findByAsalIsNotNull();
	List<Admin> findByAsalIsNull();
	//List<Admin> findByAsalIsnull(); Syntax mistake throws exception no property found could not generate query
	List<Admin> findByAnameEndingWith(String x);
	List<Admin> findByAidLessThanOrderByAnameDesc(Integer id);
	
	List<Admin> findByAsalLessThanOrderByAidDesc(Double d);
	List<Admin> findByAnameIsOrAsalLessThanEqualOrderByAidDesc(String aname,Double asal);
	
	List<Admin> findByAnameIgnoreCase(String x);
	
	List<Admin> findByAnameContainingIgnoreCase(String s);
	
	List<Admin> findByAsalBetween(Double x,Double y);
	
	List<Admin> findByAidIn(List<Integer>id);
	
	List<Admin> findByAidIsOrAnameIsNotNullOrAsalLessThanOrderByAnameDesc(Integer id,Double x);
	
}
