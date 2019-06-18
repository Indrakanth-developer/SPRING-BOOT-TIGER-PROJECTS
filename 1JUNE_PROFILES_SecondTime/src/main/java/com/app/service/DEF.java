package com.app.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class DEF implements Service {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("From default");
	}

}
