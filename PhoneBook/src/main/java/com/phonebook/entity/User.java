package com.phonebook.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

	private String number;
	@Id
	private String email;
	private String name;
	private String password;
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Contact> contact;

	@Override
	public String toString() {
		return "User [number=" + number + ", email=" + email + ", name=" + name + ", password=" + password
				+ ", contact=" + contact + "]";
	}

	public List<Contact> getContact() {
		return contact;
	}

	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
