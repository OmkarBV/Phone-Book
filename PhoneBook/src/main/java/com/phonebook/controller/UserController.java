package com.phonebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phonebook.entity.User;
import com.phonebook.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService service;

	@PostMapping("/getuser/{number}")
	public User getUser(@PathVariable String number) {
		return service.getUser(number);
	}
}
