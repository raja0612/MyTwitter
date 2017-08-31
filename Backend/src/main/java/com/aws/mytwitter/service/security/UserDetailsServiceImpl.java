package com.aws.mytwitter.service.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.aws.mytwitter.entity.User;
import com.aws.mytwitter.repository.UserRepository;

/**
 * Persistence class for USERS Table.
 * 
 * @author RAJASHEKHAR
 *
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		System.out.println("user name...." + username);

		User user = userRepository.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException(
					"Sorry" + username + "is not found. Please enter correct user name again...");
		}
		return new CustomUserDetails(user);

	}

}
