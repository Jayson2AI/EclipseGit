package com.beain.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.beain.login.bean.User;

@Controller
public class JsonController {

	@ResponseBody
	@RequestMapping("/getJson")
	public User getUserInfo() {
		User user = new User();
		user.setPassword("1234");
		user.setUsername("jsontest");
		return user;
	}
}
