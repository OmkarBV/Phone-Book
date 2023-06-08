package com.phonebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phonebook.entity.User;
import com.phonebook.service.ContactService;

@RestController
@RequestMapping("/contact")
@CrossOrigin("http://localhost:4200")
public class ContactController {
	@Autowired
	ContactService service;
	
	@GetMapping("/getall/{email}")
	public User getAllContact(@PathVariable String email) {
		return service.getAllContact(email);
	}
	
	@GetMapping("searchbyname/{email}/{name}")
	public User searchByName(@PathVariable String email, @PathVariable String name) {
		return service.searchByName(email,name);
	}
	@GetMapping("searchbynumber/{email}/{number}")
	public User searchByNumber(@PathVariable String email, @PathVariable String number) {
		return service.searchByNumber(email,number);
	}
}
