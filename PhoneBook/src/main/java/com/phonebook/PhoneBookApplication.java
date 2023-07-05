package com.phonebook;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PhoneBookApplication {

	public static void main(String[] args) {
		String s="qwe";
		System.out.println(s.charAt(12));
		
		//SpringApplication.run(PhoneBookApplication.class, args);
	}
}