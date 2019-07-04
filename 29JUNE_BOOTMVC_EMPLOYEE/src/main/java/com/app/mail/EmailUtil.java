package com.app.mail;


import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class EmailUtil {

	@Autowired
	private JavaMailSender mailSender;
	
	public boolean sendEmail(String[] to,String subject,String text, String[] cc, String[]  bcc, MultipartFile file) {
		boolean flag=false;
		try {
		//1. Create MimeMessage
		MimeMessage message=mailSender.createMimeMessage();
		
		//2. Helper Object
		System.out.println(file);
		MimeMessageHelper helper=new MimeMessageHelper(message, file.getSize()!=0?true:false);
		
	//3. Construct message
				helper.setFrom("indrakanth.developer@gmail.com");
					helper.setTo(to);
		helper.setText(text);
		helper.setSubject(subject);
		if(file.getSize()!=0)
		{			helper.addAttachment(file.getOriginalFilename(), file);
		}
		
		if((cc.length!=0)&&(cc!=null))
			helper.setCc(cc);
		if((bcc.length!=0)&&(bcc!=null))
			helper.setBcc(bcc);
		
		
		//4. send mail
		mailSender.send(message);
		flag=true;
		}catch (Exception e) {
			flag=false;
		}	
		return flag;
	}
}
