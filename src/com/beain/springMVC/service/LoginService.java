package com.beain.springMVC.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class LoginService {

	public ModelAndView doLogin(String loginPageUrl, String successPageUrl,
			String username, String password) {
		// TODO Auto-generated method stub
		if (username == null || "".equals(username)) {
			return new ModelAndView(loginPageUrl, "error_username", "用户名不能为空");
		}
		if (password == null || "".equals(password)) {
			return new ModelAndView(loginPageUrl, "error_password", "密码不能为空");
		}

		// username:admin password:1234
		if (username.equals("admin") && password.equals("1234")) {
			return new ModelAndView(successPageUrl);
		}
		return new ModelAndView(loginPageUrl, "error", "用户名或密码错误!");
	}

}