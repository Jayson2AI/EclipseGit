package com.beain.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.beain.login.bean.User;

@Controller
public class PathVariableController {

	@ResponseBody
	@RequestMapping("/pathVariable/{username}")
	public User test1(@PathVariable String username){
		User user = new User();
		user.setUsername(username);
		return user;
	}
	
	@ResponseBody
	@RequestMapping("/pathVariable2/{intval}")
	public User test2(@PathVariable Integer intval){
		User user = new User();
		user.setUsername(intval + "");
		return user;
	}
	
}
