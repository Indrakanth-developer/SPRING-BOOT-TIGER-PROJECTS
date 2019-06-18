package com.app.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.app.model.Admin;
import com.app.repo.AdminRepository;
@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private AdminRepository repo;
	@Override
	public void run(String... args) throws Exception {
		
		/* SAVE OPERATIONS
		 * repo.save(new Admin(1,"A",3.3)); repo.save(new Admin(2,"B",3.3));
		 */
		Admin a=new Admin();
		a.setAsal(6.1);
		//Using factory method "of" from Example Interface and creating 
		Example<Admin> ex=Example.of(a);
		/*
		 * System.out.println("Pure find all");
		 * repo.findAll(ex).forEach(System.out::println);
		 * 
		 * 
		 * System.out.println("Pagination find all"); repo.findAll(ex, PageRequest.of(1,
		 * 2)).forEach(System.out::println);;
		 * System.out.println("Sorted by aid find all");
		 * repo.findAll(ex,Sort.by(Direction.DESC, "aid")).forEach(System.out::println);
		 */
		System.out.println("Paginated and Sorted by aid find all");
		System.out.println("finally here");
		(repo.findAll(ex, PageRequest.of(1, 2))).forEach(System.out::println);;
		


		//repo.findAll().forEach(System.out::println);
		System.out.println("Done");

	
	}

}
