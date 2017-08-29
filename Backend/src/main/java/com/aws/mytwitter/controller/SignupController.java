package com.aws.mytwitter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aws.mytwitter.entity.User;
import com.aws.mytwitter.repository.UserRepository;

@RestController
public class SignupController {

	@Autowired
	private UserRepository userRepository;

	@PostMapping("/signup")
	public void signupUser(@RequestBody User user) {
		userRepository.save(user);
	}

}
