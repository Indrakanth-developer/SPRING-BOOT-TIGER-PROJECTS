package com.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties("indra")
public class Tester implements CommandLineRunner {

	@Value("${random.int[35,45]}")
	private int eid;
	private String ename;
	private long elong;
	private String uuid;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this);

	}

}
