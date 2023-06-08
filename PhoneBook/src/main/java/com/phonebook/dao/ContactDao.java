package com.phonebook.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.phonebook.entity.User;

@Repository
@SuppressWarnings({ "deprecation", "unchecked" })
public class ContactDao {
	@Autowired
	SessionFactory sf;

	public User getAllContact(String email) {
		Session session = sf.openSession();
		return session.get(User.class, email);
	}
}
