package com.app.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.repo.AdminRepo;
@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private AdminRepo repo;
	
	@Override
	public void run(String... args) throws Exception {

		//repo.findByAnameIs("D").forEach(System.out::println);
		
		//System.out.println(repo.findByAsal(3.3));
		
		//System.out.println(repo.findById(14));
		//System.out.println(repo.findById(14).isPresent());
		//System.out.println(repo.findById(14).get()); no such element found exception
		
		//repo.findByAidLessThan(6).forEach(System.out::println);
		
		//repo.findByAnameLike("C").forEach(System.out::println);;
		//repo.findByAnameContaining("C").forEach(System.out::println);;
		//repo.findByAnameNotLike("INDRA").forEach(System.out::println);;
		//repo.findByAnameLike("INDRA").forEach(System.out::println);;
//		repo.findByAsalNotNull().forEach(System.out::println);;
//		repo.findByAsalIsNotNull().forEach(System.out::println);;
//		//repo.findByAsalIsnull().forEach(System.out::println);; 
		//error bcs of spelling says could not create query for method no property found isnull
		
		
		//repo.findByAnameEndingWith("Kanth").forEach(System.out::println);; 
		//repo.findByAidLessThanOrderByAnameDesc(8).forEach(System.out::println);; 
		
		//repo.findByAsalLessThanOrderByAidDesc(6.6).forEach(System.out::println);;
		
		//repo.findByAnameIsOrAsalLessThanEqualOrderByAidDesc("INDRAKANTH", 6.1).forEach(System.out::println);
		
		//repo.findByAnameContainingIgnoreCase("kAnth").forEach(System.out::println);
		//repo.findByAsalBetween(6.1, 10.3).forEach(System.out::println);
		
//		repo.findByAidIn(Arrays.asList(1,2,3,4,5,6)).forEach(System.out::println);
		repo.findByAidIsOrAnameIsNotNullOrAsalLessThanOrderByAnameDesc(11, 5.9).forEach(System.out::println);	
		
		
		
	}

}
