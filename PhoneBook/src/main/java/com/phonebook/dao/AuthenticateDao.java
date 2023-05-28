package com.phonebook.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.phonebook.entity.User;

@Repository
public class AuthenticateDao {
	@Autowired
	SessionFactory sf;

	public User userLogin(User user) {
		Session session = sf.openSession();
		return session.get(User.class, user.getEmail());
	}

	public void userRegister(User user) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(user);
		System.out.println(user);
		tr.commit();
	}

}
