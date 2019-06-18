package com.app;


import java.util.Properties;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;



@Component
@Data
@ConfigurationProperties("my.val.data")
@PropertySource("classpath:application.properties")
public class Runner implements CommandLineRunner {

	private int eid;
	private String ename;
	private double esal;
	
	private int[] arr;
	
	private Properties prop;
	
	



	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this);
		
		
	

	}

}
