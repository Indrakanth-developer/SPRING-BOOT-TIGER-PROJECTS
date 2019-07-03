package com.app.mail;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtil {

	@Autowired
	private JavaMailSender mailSender;
	
	public boolean sendEmail(String to,String subject,String text, FileSystemResource file) {
		boolean flag=false;
		try {
		//1. Create MimeMessage
		MimeMessage message=mailSender.createMimeMessage();
		
		//2. Helper Object
		MimeMessageHelper helper=new MimeMessageHelper(message, file!=null?true:false);
		
	//3. Construct message
				helper.setFrom("indrakanth.developer@gmail.com");
		helper.setTo(to);
		helper.setText(text);
		helper.setSubject(subject);
		if(file!=null)
		{			helper.addAttachment(file.getFilename(), file);
		helper.addAttachment(file.getFilename()+"second", file);
		}
		helper.addCc("indrakanth210892@gmail.com");
		
		//4. send mail
		mailSender.send(message);
		flag=true;
		}catch (Exception e) {
			flag=false;
		}	
		return flag;
	}
}
