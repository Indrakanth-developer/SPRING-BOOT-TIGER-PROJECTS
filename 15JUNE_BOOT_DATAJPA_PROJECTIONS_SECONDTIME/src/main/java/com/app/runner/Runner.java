package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.repo.AdminRepo;
import com.app.repo.AdminRepo.list1;
import com.app.repo.AdminRepo.list3;
@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private AdminRepo repo;
	
	@Override
	public void run(String... args) throws Exception {

//		repo.findByAsalOrderByAname(6.1, list1.class).forEach(a->System.out.println(a.getAname()+a.getAsal()));
	//	repo.findByAsalOrderByAsal(6.1, list1.class).forEach(a->System.out.println(a.getAname()+a.getAsal()));
	repo.findByAnameContainingOrderByAidDesc("T", list3.class).forEach(a->System.out.println(a.getAid()+a.getAname()+a.getAsal()+a.getClass().getName()));
	
	}

}
