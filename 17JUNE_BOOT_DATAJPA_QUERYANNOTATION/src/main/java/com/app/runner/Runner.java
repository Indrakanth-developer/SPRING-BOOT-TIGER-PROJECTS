package com.app.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Phones;
import com.app.repo.PhoneRepo;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private PhoneRepo repo;
	@Override
	public void run(String... args) throws Exception {
		
		//repo.save(new Phones(1,"Iphone","Airtel",33.33));
		/*
		 * repo.saveAll(Arrays.asList(new Phones(23,"Iphone","Airtel",33.33), new
		 * Phones(2,"Iphone","Airtel",33.33), new Phones(3,"Samsung","Airtel",33.33),
		 * new Phones(4,"Nokia","Airtel",33.33), new Phones(5,"Iphone","Airtel",33.33),
		 * new Phones(6,"Iphone","Airtel",33.33), new Phones(7,"Iphone","Airtel",33.33),
		 * new Phones(8,"Iphone","Airtel",33.33), new Phones(9,"Iphone","Airtel",33.33),
		 * new Phones(10,"Iphone","Airtel",33.33) ));
		 */
		
		//repo.allphones().forEach(System.out::println);
		//repo.phoneNames().forEach(System.out::println);
		
		//repo.modelsims().forEach(o->System.out.println(o[0]+"\t"+o[1]));
		
		//repo.phonewithsim("jio").forEach(o->System.out.println(o[0]+"\t"+o[1]));
		
		//System.out.println(repo.costliestphone());
		
		System.out.println(repo.costlyphonedetails());
	
		System.out.println(repo.updateBalance("Iphone"));
	}

}
