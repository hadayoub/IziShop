package com.example.IziShop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.IziShop.entity.User;
import com.example.IziShop.reposetory.IUserReposetory;
@Service
public class UserService implements IUserService {
	@Autowired
	private IUserReposetory userReposerotry;

	@Override
	public List<User> getAll() {
		
		return userReposerotry.findAll();
	}

	@Override
	public void addUser(User user) {
		
			 userReposerotry.save(user);
	}
	
	@Override
	public void deleteUser(Long Id) {
		userReposerotry.deleteById(Id);
		
	}


}
