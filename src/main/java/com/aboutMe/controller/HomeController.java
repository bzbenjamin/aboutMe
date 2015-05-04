package com.aboutMe.controller;

import org.codemonkey.simplejavamail.Mailer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aboutMe.pojo.Message;

import java.util.*;
import java.io.*;
import java.nio.file.*;

import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.Message.RecipientType;
import org.apache.log4j.Logger;
@Controller
public class HomeController {
	
	final static Logger logger = Logger.getLogger(HomeController.class);
	
	@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
	public ModelAndView defaultPage() {

		ModelAndView model = new ModelAndView();
		model.setViewName("home");
		return model;

	}

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public ModelAndView contactPage() {

		ModelAndView model = new ModelAndView();
		model.setViewName("contact");
		return model;

	}

	@RequestMapping(value = "/contact", method = RequestMethod.POST)
	public ModelAndView sendMessagePage(@ModelAttribute Message message,
			ModelAndView model) {
		
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
 
		Session session = Session.getDefaultInstance(props,
			new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					/*temp hard coded account information*/
					return new PasswordAuthentication("mailservice215","guessthispassword");
				}
			});
 
		try {
 
			javax.mail.Message msg = new MimeMessage(session);
			//msg.setFrom(new InternetAddress("from@no-spam.com"));
			//System.out.println("msg.setFrom: "+msg.getFrom().toString());
			msg.setRecipients(javax.mail.Message.RecipientType.TO,
					InternetAddress.parse("benjamin.h.zheng@gmail.com"));
			msg.setSubject(message.getSubject());
			msg.setText(message.toString());
 
			Transport.send(msg);
 
			System.out.println("Done");
 
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

		model.setViewName("messageSuccess");
		System.out.println("model.getViewName(): " + model.getViewName());
		return model;

	}

}
