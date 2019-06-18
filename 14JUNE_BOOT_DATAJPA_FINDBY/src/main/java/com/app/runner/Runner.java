package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.repo.AdminRepo;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private AdminRepo repo;

	public void run(String... args) throws Exception {

		repo.findByAid(3).forEach(System.out::println);;
		repo.findByAsal(6.1).forEach(System.out::println);;
	}

}
