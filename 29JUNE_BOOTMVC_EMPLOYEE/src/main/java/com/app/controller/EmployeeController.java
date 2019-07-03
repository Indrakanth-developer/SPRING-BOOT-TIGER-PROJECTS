package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.model.Employee;
import com.app.service.IEmployeeService;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private IEmployeeService service;
	
	//1. Show reg page
	@RequestMapping("/reg")
	public String showReg(Model map) {
		//form backing object
		map.addAttribute("employee", new Employee());
		return "EmployeeRegister";
		
	}
	
	//2. View All
	@RequestMapping("/all")
	public String allEmp(Model map) {
		map.addAttribute("list", service.getAllEmployees());
		return "EmployeeData";
	}
}
