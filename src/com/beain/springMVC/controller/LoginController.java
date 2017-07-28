package com.beain.springMVC.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.beain.springMVC.service.LoginService;

@Controller
public class LoginController {
	
	@Resource
	LoginService service;
	
	@Resource
	HttpServletRequest request;
	
	@RequestMapping("/index")
	public ModelAndView toLoginPage(){
		return new ModelAndView("login");
	}
	
	@RequestMapping("/login")
	public ModelAndView doLoginPage(){
		String loginPageUrl = "login";
		String successPageUrl = "success";
		
		String username = request.getParameter("username");		
		String password = request.getParameter("password");		
		
		return service.doLogin(loginPageUrl, successPageUrl, username, password);
	}
	
}
