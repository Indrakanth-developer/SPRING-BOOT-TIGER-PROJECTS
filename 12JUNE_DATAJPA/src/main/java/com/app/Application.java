package com.app;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication s=new SpringApplication(Application.class);
		s.setBannerMode(Banner.Mode.CONSOLE);
		s.run(args);
	}

}
