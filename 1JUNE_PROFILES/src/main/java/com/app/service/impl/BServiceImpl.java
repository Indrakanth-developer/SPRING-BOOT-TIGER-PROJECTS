package com.app.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.Service;

@Component
@Profile("B")
public class BServiceImpl implements Service {

	@Override
	public void display() {
		// TODO Auto-generated method stub
System.out.println("From B");
	}

}
