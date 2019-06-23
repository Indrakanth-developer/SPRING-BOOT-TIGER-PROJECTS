package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Indra;
import com.app.repo.IndraRepo;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private IndraRepo repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		repo.save(new Indra(1,"Tiger"));
		repo.findAll().forEach(System.out::println);
	}

}
