package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {
//Interface to extend jpa repository and inherit db operations like save findalls etc
}
