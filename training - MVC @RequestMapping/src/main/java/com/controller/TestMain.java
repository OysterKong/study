package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestMain {
	
	@RequestMapping(value="/login", method = RequestMethod.GET)  //�ּҺο�
	public String loginForm() {
		System.out.println("TestMain.loginForm get��� ��û�� ====================");
		return "loginForm";
	}
	@RequestMapping(value="/login", method = RequestMethod.POST)  //�ּҺο�
	public String login() {
		System.out.println("TestMain.login Postt��� ��û�� ====================");
		return "login";
	}
		

}
