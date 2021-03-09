package com.example.IziShop.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.IziShop.entity.User;
import com.example.IziShop.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;
	
	@GetMapping("/all")
	public 	ResponseEntity<List<User>> getAllUsers(){
		return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
	}
	
	@PostMapping("/addUser")
	public void addUser(@RequestBody User user) {
		 userService.addUser(user);
	}
	@DeleteMapping("/deleteUser")
	public void deleteUser(@RequestBody Long Id) {
		userService.deleteUser(Id);
	}

}
