package com.phonebook.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonebook.dao.ContactDao;
import com.phonebook.entity.Contact;

@Service
public class ContactService {
	@Autowired
	ContactDao dao;

	public List<Contact> getAllContact(String email) {
		List<Contact> contact = dao.getAllContact(email);

		System.out.println(email);
		Collections.sort(contact, (c1, c2) -> c1.getName().compareTo(c2.getName()));
		System.out.println(contact);
		return contact;
	}
}
