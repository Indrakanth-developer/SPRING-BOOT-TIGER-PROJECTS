package com.app.service;

import java.util.List;

import com.app.model.Employee;

public interface IEmployeeService {

	public Integer saveEmployee(Employee employee);
	public Employee getOneEmployee(Integer id);
	public List<Employee> getAllEmployees();
	public void deleteOneEmployee(Integer id);
	public void updateEmployee(Employee employee);
}
