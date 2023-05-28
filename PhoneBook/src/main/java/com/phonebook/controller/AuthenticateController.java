package com.phonebook.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phonebook.entity.User;
import com.phonebook.service.AuthenticateService;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("auth")
public class AuthenticateController {
	@Autowired
	AuthenticateService service;

	@PostMapping("/login")
	public Map<String, Object> userLogin(@RequestBody User user) {
		System.out.println(user);
		return service.userLogin(user);
	}

	@PostMapping("/register")
	public Map<String, Object> userRegister(@RequestBody User user) {
		return service.userRegister(user);
	}

}
