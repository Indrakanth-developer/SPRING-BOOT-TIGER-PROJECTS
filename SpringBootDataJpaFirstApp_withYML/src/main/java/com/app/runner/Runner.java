package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Admin;
import com.app.repo.AdminRepo;
@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private AdminRepo repo;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(repo.save(new Admin(3,"Indrakanth")));
		System.out.println(repo.save(new Admin(2,"Tiger")));
		System.out.println(repo.save(new Admin(1,"Raghu Sir")));
	}

}
