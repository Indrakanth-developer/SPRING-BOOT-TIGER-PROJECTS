package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {

	List<Admin> findByAsalLessThan(Double sal);
}
