package com.app.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.app.mail.EmailUtil;
import com.app.model.Employee;
import com.app.model.MailMessage;
import com.app.service.IEmployeeService;
import com.app.validator.MailValidator;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	
	@Autowired
	private IEmployeeService service;
	
	@Autowired
	private EmailUtil mailSender;
	
	@Autowired
	private MailValidator validator;
	
	//1. Show reg page
	@RequestMapping("/reg")
	public String showReg(Model map) {
		//form backing object
		map.addAttribute("employee", new Employee());
		return "EmployeeRegister";
		
	}
	
	//2. View All
	@RequestMapping("/all")
	public String allEmp(Model map) {
		map.addAttribute("list", service.getAllEmployees());
		return "EmployeeData";
	}
	
	//## Mail Api 
	
	@RequestMapping("/mail")
	public String mailPage(Model map) {
		map.addAttribute("mailMessage", new MailMessage());
		return "MailUi";
	}
	
	@RequestMapping("/sendmail")
	public String sendmailPage(@RequestParam MultipartFile attachment,@ModelAttribute MailMessage mailMessage,Model map,Errors errors) {
		//validations
		validator.validate(mailMessage, errors);
		
		if(!errors.hasErrors())
		{	
		//Format to cc and bcc inputs
		
		StringTokenizer tokencc=new StringTokenizer(mailMessage.getCc(),", ");
		StringTokenizer tokenbcc=new StringTokenizer(mailMessage.getBcc(),", ");
		StringTokenizer tokento=new StringTokenizer(mailMessage.getTo(),", ");
		
		String[] finalcc=new String[tokencc.countTokens()];
		String[] finalbcc=new String[tokenbcc.countTokens()];
		String[] finalto=new String[tokento.countTokens()];

		int index=0;
		while(tokencc.hasMoreTokens())
			finalcc[index++]=tokencc.nextToken();
		
		index=0;
		while(tokenbcc.hasMoreTokens())
			finalbcc[index++]=tokenbcc.nextToken();
		
		index=0;
		while(tokento.hasMoreTokens())
			finalto[index++]=tokento.nextToken();

		boolean flag=mailSender.sendEmail(finalto, mailMessage.getText(), mailMessage.getSubject(), finalcc, finalbcc, attachment);
		if(flag)
		map.addAttribute("message", "Sent Mail Successfully");
		else
			map.addAttribute("message", "Check error");
		}	
		return "MailUi";
	}
}
