package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestMain {
	
	@RequestMapping(value="/login", method = RequestMethod.GET)  //林家何咯
	public String loginForm() {
		System.out.println("TestMain.loginForm get规侥 夸没凳 ====================");
		return "loginForm";
	}
	@RequestMapping(value="/login", method = RequestMethod.POST)  //林家何咯
	public String login() {
		System.out.println("TestMain.login Postt规侥 夸没凳 ====================");
		return "login";
	}
		

}
