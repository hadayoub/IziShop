package com.example.IziShop.service;

import java.util.List;



import com.example.IziShop.entity.User;

public interface IUserService {

	List<User> getAll();

	void addUser(User user);

	void deleteUser(Long id);



}
