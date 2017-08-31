package com.aws.mytwitter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aws.mytwitter.entity.User;
import com.aws.mytwitter.repository.UserRepository;
import com.aws.mytwitter.service.UserService;

@RestController
public class SignupController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserService userService;

	@PostMapping("/signup")
	public void signupUser(@RequestBody User user) {
		System.out.println(user);
		userService.createUser(user);
	}

	@GetMapping("/testUser")
	public void getTestUserDetails() {
		User user = userRepository.findByUsername("test");
		System.out.println("Test User..." + user.getUsername() + "/t" + user.getEmail() + "/t" + user.getPassword()
				+ "/t" + user.getAuthorities());
	}

}
