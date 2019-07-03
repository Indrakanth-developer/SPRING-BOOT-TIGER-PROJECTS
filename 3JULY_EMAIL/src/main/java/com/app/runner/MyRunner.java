package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import com.app.mail.EmailUtil;

@Component
public class MyRunner implements CommandLineRunner {

	@Autowired
	private EmailUtil util;
	@Override
	public void run(String... args) throws Exception {

		FileSystemResource file=new FileSystemResource("D:\\Untitled.jpg");
		System.out.println(util.sendEmail("indrakanth.developer@gmail.com", "TESt", "TESt", file));
		
	}

}
