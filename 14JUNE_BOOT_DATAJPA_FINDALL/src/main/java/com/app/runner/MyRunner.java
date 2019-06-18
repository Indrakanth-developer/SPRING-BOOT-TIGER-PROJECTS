package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.app.model.Student;
import com.app.repo.StudentRepo;

@Component
public class MyRunner implements CommandLineRunner {

@Autowired
private StudentRepo repo;
	public void run(String... args) throws Exception {

		/* ALL SAVE OPERATIONS TO HAVE DATA IN DB 
		 * repo.save(new Student("ABC")); repo.save(new Student("ABCD")); repo.save(new
		 * Student("ABCE")); repo.save(new Student("ABCF")); repo.save(new
		 * Student("ABCG")); repo.save(new Student("ABCH"));
		 */	

		//2 findAll where id=38
		Student s=new Student(38);
		Example<Student> e=Example.of(s);
		repo.findAll(e).forEach(System.out::println);
		
		//3 find all where name Abc
		
		repo.findAll(Example.of(new Student("ABC"))).forEach(System.out::println);;
		
		//4. Print the above result in sorted order descnding
		
		repo.findAll(Example.of(new Student("ABC")), Sort.by(Direction.DESC,"id")).forEach(System.out::println);
		
		//5. Pagination
		//If you give beyond the page limit no output is printed
		System.out.println("Pagination Output");
		repo.findAll(PageRequest.of(1, 2)).forEach(System.out::println);
		
		//6. Pagination with Sorting and Example
		Pageable p=PageRequest.of(1, 2);
		Example<Student> ex=Example.of(new Student());
		repo.findAll(ex,Sort.by(Direction.DESC, "id")).forEach(System.out::println);;
		 
		// @formatter:on

		
		
	
	
	}

}
