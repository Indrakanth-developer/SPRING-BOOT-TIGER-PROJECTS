package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Employee;

public interface DataRepository extends JpaRepository<Employee, Integer> {

}
