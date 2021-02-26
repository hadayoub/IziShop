package com.example.IziShop;

import  org.junit.Assert;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = ConfigUT.class)
public class TestUser {

	@Test
	public void MyTest() {
		Assert.assertTrue(true);
	}
}
