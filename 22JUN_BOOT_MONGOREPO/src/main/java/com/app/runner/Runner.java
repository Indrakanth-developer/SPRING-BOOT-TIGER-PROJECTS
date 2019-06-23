package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Tiger;
import com.app.repo.TigerRepo;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private TigerRepo repo;
	@Override
	public void run(String... args) throws Exception {

		repo.deleteAll();
		repo.save(new Tiger(1,"A"));
		repo.save(new Tiger(2,"A"));
		repo.save(new Tiger(3,"B"));
		
		
		repo.findAll().forEach(System.out::println);
	}

}
