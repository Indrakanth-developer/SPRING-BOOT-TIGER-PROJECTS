package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.model.Employee;
import com.app.service.IEmployeeService;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private IEmployeeService service;
	
	@RequestMapping("/reg")
	public String regPage(Model map) {
		map.addAttribute("employee", new Employee());
		return "Register";
	}
	
	@RequestMapping("save")
	public String savePage(@ModelAttribute Employee employee,Model map) {
		
		map.addAttribute("message", service.saveEmployee(employee));
		map.addAttribute("employee", new Employee());
		return "Register";
	}
	
	@RequestMapping("/view/{id}")
	public String onePage(@PathVariable Integer id,Model map) {
		
		map.addAttribute("employee", service.getOneEmployee(id));
		return "View";
	}
	@RequestMapping("/data")
	public String onePage(Model map) {
		
		map.addAttribute("list", service.getAllEmployees());
		return "Data";
	}
	
}
