package com.example.IziShop;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.IziShop.entity.User;
import com.example.IziShop.reposetory.IUserReposetory;
import com.example.IziShop.service.UserService;

@RunWith(MockitoJUnitRunner.class)
public class TestUser {
	@Mock
	private IUserReposetory userReposerotry;

	private UserService service;
	@Test
	public void whenFindAll_ReturnUsersList() {
		User user = new User(1L,"ayoub","had","ayoub@haadcom","casa","05353566");
		when(userReposerotry.findAll()).thenReturn(Arrays.asList(user));
		List<User> users = service.getAll();
		assertThat(users).hasSize(1);   
	}

}