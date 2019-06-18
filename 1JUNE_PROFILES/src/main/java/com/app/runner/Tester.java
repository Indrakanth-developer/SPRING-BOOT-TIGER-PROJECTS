package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.app.service.Service;

@Component
@Order(1)
public class Tester implements CommandLineRunner {
	@Autowired
	private Service service;
	@Autowired
	private Inependent ind;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
service.display();

	}

}
