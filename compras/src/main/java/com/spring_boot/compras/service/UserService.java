package com.spring_boot.compras.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.spring_boot.compras.entity.User;

public interface UserService extends UserDetailsService {
	
	public UserDetails loadUserByUsername(String username);
	public User saveUser(User user);

}
