package com.app.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class MailMessage {

	private String to;
	private String cc;
	private String bcc;
	private String subject;
	private String text;
	
}
