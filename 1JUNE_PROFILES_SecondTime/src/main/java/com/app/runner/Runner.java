package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.service.Service;
@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private Service service;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		service.display();
	}

}
