package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Users;
import com.example.repository.UsersRepository;

@Service
public class LoginService {
	
	@Autowired
	private UserPasswordHashClass userPasswordHashClass;
	
	@Autowired
	private UsersRepository usersRepository;
	
	public String login(String userId, String userPw) {
		if(userId == "" || userPw == "") {
			return "login";
		}
		
		String hashedPassword = userPasswordHashClass.getSHA256(userPw);
		//Users users = usersRepository.findAllByUser_idAndUser_pw(userId, userPw);
		/*
		 * if(users == null) { return "login"; }
		 */
		
		return "index";
		
	}
		
}
