package com.app.runner;

import java.util.stream.Collectors;

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
		/*
		 * repo.save(new Admin("A",4.2)); repo.save(new Admin("	B",3.2)); repo.save(new
		 * Admin("C",4.1)); repo.save(new Admin("D",2.2)); repo.save(new
		 * Admin("E",1.2)); repo.save(new Admin("F",7.2)); repo.save(new
		 * Admin("G",6.2)); repo.save(new Admin("H",8.2));
		 * 
		 * repo.findByAsalLessThan(3.2).forEach(System.out::println);
		 */		
	
		//
	/*repo.findAll().stream().filter(
			p->p.getAsal()>3.2)
	.sorted(
			(p1,p2)->p2.getId()-p1.getId()
			)
	.map(p->p.getAname()+ p.getAsal()).forEach(System.out::println);
	//.map(p->p.getId()+" "+p.getAname()).forEach(System.out::println);;
	
	*/
	repo.findAll().stream().filter(p->p.getId()>3).sorted((i1,i2)->i1.getId()-i2.getId()).map(p->"Your id is :"+p.getId()+"Your name is:"+p.getAname()+"Your Cost is"+p.getAsal()).collect(Collectors.toList()).forEach(System.out::println);
	repo.findAll().stream().filter(p->p.getId()>3).sorted((i1,i2)->i1.getId()-i2.getId()).map(p->"Your id is :"+p.getId()+"Your name is:"+p.getAname()+"Your Cost is"+p.getAsal()).forEach(System.out::println);
	
	}

}
