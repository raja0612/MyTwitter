package com.aws.mytwitter.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aws.mytwitter.entity.User;
import com.aws.mytwitter.entity.security.Authorities;
import com.aws.mytwitter.repository.AuthorityRepository;
import com.aws.mytwitter.repository.UserRepository;
import com.aws.mytwitter.service.security.UserDetailsServiceImpl;

@Service
public class UserService {
	private static final Logger LOG = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private AuthorityRepository authorityRepository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Autowired
	private UserDetailsServiceImpl userSecurityService;

	@Transactional
	public User createUser(User user) {
		User localUser = userRepository.findByUsername(user.getUsername());

		if (localUser != null) {
			LOG.info("User with username {} already exist. Nothing will be done. ", user.getUsername());
		} else {
			String encryptedPassword = passwordEncoder.encode(user.getPassword());
			user.setPassword(encryptedPassword);
			localUser = userRepository.save(user);

			Authorities authoritity = new Authorities();
			authoritity.setAuthority("ROLE_USER");

			authoritity.setUser(user);
			user.getAuthorities().add(authoritity);
			authorityRepository.save(authoritity);
		}
		return localUser;
	}

	public void setUserSession(String username) {
		UserDetails userDetails = userSecurityService.loadUserByUsername(username);

		Authentication authentication = new UsernamePasswordAuthenticationToken(userDetails, userDetails.getPassword(),
				userDetails.getAuthorities());

		SecurityContextHolder.getContext().setAuthentication(authentication);
	}
}
