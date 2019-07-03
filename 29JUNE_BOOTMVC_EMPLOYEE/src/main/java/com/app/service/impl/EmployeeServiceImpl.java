package com.app.service.impl;

import java.util.List;
import java.util.Optional;

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
	public Integer saveEmployee(Employee emp) {
		Employee emp1=repo.save(emp);
		return emp1.getEid();
	}

	@Override
	@Transactional
	public void updateEmployee(Employee emp) {
		repo.save(emp);
	}

	@Override
	@Transactional
	public void deleteEmployee(Integer id) {

		repo.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Employee getOneEmployee(Integer id) {
		Optional<Employee>opt=repo.findById(id);
		if(opt.isPresent())
		return opt.get();
		else
			return null;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

}
