package com.phonebook.service;

import java.util.ArrayList;
import java.util.Collections;
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

	public User sortContactASC(String email) {
		User user = dao.getAllContact(email);
		Collections.sort(user.getContact(), (o1, o2) -> o1.getName().compareTo(o2.getName()));
		return user;
	}
	public User sortContactDESC(String email) {
		User user = dao.getAllContact(email);
		Collections.sort(user.getContact(), (o1, o2) -> o2.getName().compareTo(o1.getName()));
		return user;
	}
}
