package com.learning.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String username, String password) {
		
		boolean isValidUsername = username.equalsIgnoreCase("admin");
		boolean isValidPassword = password.equalsIgnoreCase("admin");
		
		return isValidPassword && isValidUsername;
	}
}
