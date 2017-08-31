package com.aws.mytwitter.service.security;

import java.util.Set;

import org.springframework.security.core.userdetails.UserDetails;

import com.aws.mytwitter.entity.User;
import com.aws.mytwitter.entity.security.Authorities;

/**
 * @author RAJASHEKHAR
 *
 */
public class CustomUserDetails extends User implements UserDetails {
	private static final long serialVersionUID = 1L;

	public CustomUserDetails() {
	}

	public CustomUserDetails(User user) {
		super(user);
	}

	@Override
	public Set<Authorities> getAuthorities() {
		// Authentication means who,Authorization means Roles

		// Authorities have many to one relationship to user
		// User-Authorities one to many

		return super.getAuthorities();
	}

	@Override
	public String getPassword() {
		return super.getPassword();
	}

	@Override
	public String getUsername() {
		return super.getUsername(); // It returns User Entity class username.
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
