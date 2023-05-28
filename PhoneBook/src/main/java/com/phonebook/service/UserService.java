package com.phonebook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonebook.dao.UserDao;
import com.phonebook.entity.User;

@Service
public class UserService {
@Autowired
UserDao dao;

	public User getUser(String number) {
		return dao.getUser(number);
	}

}
