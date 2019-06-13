package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepo;

@Component
public class Runner implements CommandLineRunner {
@Autowired
private ProductRepo repo;
	@Override
	public void run(String... args) throws Exception {

		System.out.println(repo.save(new Product(1,"A",3.2)));
		System.out.println(repo.save(new Product(2,"B",2.2)));
	}

}
