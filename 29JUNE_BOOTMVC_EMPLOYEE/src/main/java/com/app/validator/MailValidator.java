package com.app.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.app.model.MailMessage;

@Component
public class MailValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return MailMessage.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		//cast to MailMessage Object
		MailMessage message=(MailMessage)target;
		
		//validate all "to" Fields
		if((!Pattern.matches(".*[@].*[.].*", message.getTo()))||!StringUtils.hasText(message.getTo()))
			errors.rejectValue("to", null, "Enter a valid mail id(s)");
		
		if(StringUtils.hasText(message.getCc()))
		if((
				!Pattern.matches(".*[@].*[.].*", message.getCc())
				)
				||!StringUtils.hasText(message.getCc()))
			errors.rejectValue("cc", null, "Enter a valid mail id(s)");
		
		if(StringUtils.hasText(message.getBcc()))
		if(
				(!Pattern.matches(".*[@].*[.].*", message.getBcc()))
				||
				!StringUtils.hasText(message.getBcc())
				)
			errors.rejectValue("bcc", null, "Enter a valid mail id(s)");
		
		if(!StringUtils.hasText(message.getSubject()))
			errors.rejectValue("subject", null, "Subject is Mandatory for Mail");
		
		//Minimum ten characters
		if(Pattern.matches(".{0,9}", message.getText()))
			errors.rejectValue("text", null, "Text Body must contain atleast Ten(10) Characters");
		
	}

}
