package com.app.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Employee;
import com.app.repo.DataRepository;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private DataRepository repo;
	@Override
	public void run(String... args) throws Exception {

		//1.save one employee
		repo.save(new Employee("A"));
		
		//2. bulk save
		repo.saveAll(Arrays.asList(new Employee("b"),new Employee("b"),new Employee("b"),new Employee("b")));

		//3. delete by id
		//repo.deleteById(2);
		
		//4. delete all
		//repo.deleteAllInBatch();//jpa repository
		repo.deleteAll();//crud repository
	}

}
