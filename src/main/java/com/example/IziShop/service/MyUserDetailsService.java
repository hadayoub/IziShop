package com.example.IziShop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.IziShop.entity.User;
import com.example.IziShop.reposetory.IUserReposetory;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	private IUserReposetory userReposerotry;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userReposerotry.findByUsername(username);
		if (user==null) 
			throw new UsernameNotFoundException("user 404");
			
	return new UserPrincipal(user);
	}

}
