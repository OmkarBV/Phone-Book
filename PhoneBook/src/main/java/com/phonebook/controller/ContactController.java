package com.phonebook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phonebook.entity.Contact;
import com.phonebook.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {
	@Autowired
	ContactService service;

	@GetMapping("/getall/{email}")
	public List<Contact> getAllContact(@PathVariable String email) {
		return service.getAllContact(email);
	}
}
