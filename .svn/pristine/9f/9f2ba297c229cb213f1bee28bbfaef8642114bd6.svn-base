package com.aboutMe.util;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

import org.apache.log4j.Logger;

import com.aboutMe.controller.HomeController;

public  class SmtpAuthenticator extends Authenticator {
	final static Logger logger = Logger.getLogger(HomeController.class);

	
	public SmtpAuthenticator()
	{
		super();
	}
	
@Override
public PasswordAuthentication getPasswordAuthentication() {
	 String username = "mailservice215@gmail.com";
	 String password = "guessthispassword";
	    if ((username != null) && (username.length() > 0) && (password != null) 
	      && (password.length   () > 0)) {

	        return new PasswordAuthentication(username, password);
	    }

	    return null;
	}
}
