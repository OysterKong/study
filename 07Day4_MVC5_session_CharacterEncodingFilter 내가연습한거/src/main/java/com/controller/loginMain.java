package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dto.loginDTO;

@Controller
public class loginMain {
	
	@RequestMapping(value="/login")
	public String login() {
		System.out.println("login.get¹æ½Ä ================");
		
		return "loginForm";
	}
	
	@RequestMapping(value=("/login"), method= RequestMethod.POST)
	public String login(loginDTO dto, HttpSession session) {
		session.setAttribute("login", dto);
		return "login";
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:login";
	}

}
