package com.aws.mytwitter.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.aws.mytwitter.entity.security.Authorities;

/**
 * Persistence class for USERS Table.
 * 
 * @author RAJASHEKHAR
 *
 */
@Entity
@Table(name = "users")
public class User {

	// User has 1...* relationship to Authorities

	private Long id;
	private String email;
	private String password;
	private String username;
	private Set<Authorities> authorities = new HashSet<Authorities>();
	
    public User() {
		
	}
	public User(User user) {
		this.email = user.getEmail();
		this.password = user.getPassword();
		this.authorities = user.getAuthorities();
	}

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST, mappedBy = "user")
	public Set<Authorities> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Set<Authorities> authorities) {
		this.authorities = authorities;
	}

}
