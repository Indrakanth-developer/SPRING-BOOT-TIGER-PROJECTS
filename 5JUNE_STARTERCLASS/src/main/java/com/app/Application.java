package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.app.one.Product;

@SpringBootApplication
@ComponentScan({"com.app","com.one"})

public class Application implements CommandLineRunner{

	@Autowired
	public Product p;
	
	@Bean
	public Product p1() {
		Product p=new Product();
		p.setPid(143);
		p.setPname("Indra");
		return p;
	}
	public static void main(String[] args) {
	
		
SpringApplication s=new SpringApplication(Application.class);
s.setBannerMode(Banner.Mode.CONSOLE);

ConfigurableApplicationContext ac=s.run(args);
System.out.println(ac.getClass().getName());
System.out.println(ac.getClass());
System.out.println(ac.getBean("tester1"));
		System.out.println(ac.getBean("p1"));
		
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("From runner"+p);
		
	}

}
