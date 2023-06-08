package com.phonebook.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonebook.dao.ContactDao;
import com.phonebook.entity.Contact;
import com.phonebook.entity.User;

@Service
public class ContactService {
	@Autowired
	ContactDao dao;

	public User getAllContact(String email) {
		return dao.getAllContact(email);
	}

	public User searchByName(String email, String name) {
		User user = dao.getAllContact(email);
		List<Contact> al = user.getContact();
		ArrayList<Contact> cl = new ArrayList<>();
		for (Contact c : al) {
			if (c.getName().equals(name)) {
				cl.add(c);
			}
		}
		user.setContact(cl);
		return user;
	}

	public User searchByNumber(String email, String number) {
		User user = dao.getAllContact(email);
		List<Contact> al = user.getContact();
		ArrayList<Contact> cl = new ArrayList<>();
		for (Contact c : al) {
			if (c.getNumber().equals(number)) {
				cl.add(c);
			}
		}
		user.setContact(cl);
		return user;
	}
}
