package com.example.IziShop;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.IziShop.entity.User;
import com.example.IziShop.reposetory.IUserReposetory;


@RunWith(MockitoJUnitRunner.class)
public class TestUser {
	@Mock
	private IUserReposetory userReposerotry;

	@Test
	public void whenFindAll_ReturnUsersList() {
		User user = new User(1L,"ayoub","had","ayoub@haadcom","casa", "","05353566","PASSWORD", "USERNAM");
		when(userReposerotry.findAll()).thenReturn(Arrays.asList(user));
		List<User> users = userReposerotry.findAll();
		assertThat(users).hasSize(1);   
	}
	
	@Test
	public void addUser_ReturnList() {
		User user = new User(1L,"ayoub","had","ayoub@haadcom","casa", "","05353566","PASSWORD", "USERNAM");
	    User savedUser = userReposerotry.save(user);
	    assertThat(savedUser).isNotNull();
	}
	
}