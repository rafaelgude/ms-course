package com.rafaelgude.hroauth.services;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafaelgude.hroauth.entities.User;
import com.rafaelgude.hroauth.feignclients.UserFeignClient;

@Service
public class UserService {
	
	private static Logger Logger = org.slf4j.LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserFeignClient userFeignClient;
	
	public User findByEmail(String email) {
		var user = userFeignClient.findByEmail(email).getBody();
		
		if (user == null) {
			Logger.error("Email not found: " + email);
			throw new IllegalArgumentException("Email not found.");
		}
		
		Logger.info("Email found: " + email);
		return user;
	}

}
