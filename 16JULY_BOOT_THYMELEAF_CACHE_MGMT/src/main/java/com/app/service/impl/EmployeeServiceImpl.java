package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Employee;
import com.app.repo.EmployeeRepo;
import com.app.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeRepo repo;
	
	@Override
	@Transactional
	public Integer saveEmployee(Employee employee) {
		
		return repo.save(employee).getEid();
	}

	@Override
	@Transactional(readOnly = true)
	public Employee getOneEmployee(Integer id) {
		return repo.findById(id).get();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	@Override
	@Transactional
	public void deleteOneEmployee(Integer id) {
		repo.deleteById(id);

	}

	@Override
	@Transactional
	public void updateEmployee(Employee employee) {
		repo.save(employee);

	}

}
