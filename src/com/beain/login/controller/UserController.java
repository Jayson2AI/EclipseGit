package com.beain.login.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.beain.login.bean.User;
import com.beain.login.service.UserService;

@Controller
@SessionAttributes("user")
public class UserController {

	@Resource
	UserService service;

	@RequestMapping("/login")
	public String toLoginPage() {
		return "login";
	}

	@RequestMapping(value = "/doLogin", method = RequestMethod.POST)
	public String doLogin(@RequestParam String username,
			@RequestParam String password, HttpServletRequest request,
			ModelMap map) {
		try {
			User user = service.doLogin(username, password);
			map.put("user", user);
		} catch (Exception e) {
			// TODO: handle exception
			if(username == null || "".equals(username)){
				request.setAttribute("error_username", "用户名不能为空 !");
				return "login";
			}
			if(password == null || "".equals(password)){
				request.setAttribute("error_password", "密码不能为空 !");
				return "login";
			}
			request.setAttribute("error", e.getMessage());
			return "login";
		}
		return "login_success";
	}

	@RequestMapping("/doLogout")
	public String doLogout(SessionStatus status) {
		status.setComplete();
		return "login";
	}

}
