package com.beain.login.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.beain.login.bean.User;
import com.beain.login.dao.UserDAO;

@Service
public class UserService {

	@Resource
	UserDAO dao;

	public User doLogin(String username, String password) throws Exception{
		// TODO Auto-generated method stub
		User user = dao.selectByUsername(username);
		if(user == null){
			throw new Exception("用户名不存在 !");
		}
		if(!user.getPassword().equals(password)){
			throw new Exception("密码错误 !");
		}
		return user;
	}
}
