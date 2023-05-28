package com.phonebook.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.phonebook.entity.User;

@Repository
public class UserDao {
	@Autowired
	SessionFactory sf;

	public User getUser(String number) {
		Session session = sf.openSession();
		return session.get(User.class, number);
	}

}
