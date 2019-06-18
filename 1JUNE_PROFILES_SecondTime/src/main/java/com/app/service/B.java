package com.app.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("B")
public class B implements Service {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("From B");
	}

}
