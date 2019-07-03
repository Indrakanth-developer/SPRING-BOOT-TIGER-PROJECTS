package com.app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.product.Product;

@Controller
public class HomeController {

	@RequestMapping("/reg")
	public String regme(Model m) {
		m.addAttribute("product", new Product());
		return "Register";
	}
	
	String str="Hello";
	
}
