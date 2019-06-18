package com.app.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties("my")
public class Tester implements CommandLineRunner {

	private int eid;
	private String ename;
	private double esal;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
System.out.println(this);
	}

}
