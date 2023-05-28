package com.phonebook.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonebook.dao.AuthenticateDao;
import com.phonebook.entity.User;

@Service
public class AuthenticateService {
	@Autowired
	AuthenticateDao dao;

	public Map<String, Object> userLogin(User user) {
		Map<String, Object> responce = new HashMap<>();
		User u = dao.userLogin(user);
		if (u == null) {
			responce.put("success", false);
			responce.put("message", "Invalid User");
			return responce;
		}
		if (u.getPassword().equals(user.getPassword())) {
			responce.put("success", true);
			responce.put("message", "Login");
			return responce;
		}
		responce.put("success", false);
		responce.put("message", "Invalid Password");
		return responce;
	}

	public Map<String, Object> userRegister(User user) {
		HashMap<String, Object> responce = new HashMap<>();

		// check Already Registered
		if (dao.userLogin(user) != null) {
			responce.put("success", false);
			responce.put("message", "Already Registered");
			return responce;
		}
		dao.userRegister(user);
		responce.put("success", true);
		responce.put("message", "Registered");
		return responce;
	}

}
