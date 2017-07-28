package com.beain.login.dao;

import org.springframework.stereotype.Repository;

import com.beain.login.bean.User;

@Repository
public class UserDAO {

	public User selectByUsername(String username) {
		// TODO Auto-generated method stub
		// username:admin
		if ("admin".equals(username)) {
			User user = new User();
			user.setPassword("123");
			user.setUsername("admin");
			return user;
		}

		return null;
	}

}
