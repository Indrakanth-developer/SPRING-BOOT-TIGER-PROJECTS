package com.app.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.repo.AdminRepo;
import com.app.repo.AdminRepo.all;
import com.app.repo.AdminRepo.last;
import com.app.repo.AdminRepo.twocols;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private AdminRepo repo;

	@Override
	public void run(String... args) throws Exception {

		//STATIC PROJECTIONS
		//repo.findByAsalIs(6.1).forEach(p->System.out.println(p.getAid()+p.getAname()));

		//without using lambda expression: The Long way
		//		List<twocols> l=repo.findByAsalIs(6.1);
		//		for(twocols ob:l)
		//			System.out.println(ob.getAid() +"\t" +ob.getAname());
		//			

		//repo.findByAnameIs("TIGER").forEach(p->System.out.println(p.getAname()+"\t" +p.getAsal()));
		
		
		//DYNAMIC PROJECTIONS

	
		//repo.findByAidIs(6, last.class).forEach(p->System.out.println(p.getAname()+p.getAsal()));
		//repo.findByAidIs(5, twocols.class).forEach(i->System.out.println(i.getAid()+i.getAname()));


		//repo.findByAidIs(7, last.class).forEach(a->System.out.println(a.getAsal()+a.getAname()));
		
		 
		repo.findByAsalIs(6.1, all.class).forEach(a->System.out.println(a.getClass().getName()+a.getAid()+a.getAname()+a.getAsal()));
		
		
	
	}

}
