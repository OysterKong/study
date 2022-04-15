package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	//@RequestMapping(value = "/login", method = RequestMethod.GET) //get��� ��û
	//get����� default ,  �ݵ�� ����� �ʿ�� ����
	@RequestMapping(value = "/login") //get��� ��û
	public String loginFrom() {
		System.out.println("TestController.loginForm get ��û�� ==========");
		return "loginForm";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST) //post��� ��û
	public String login() {
		System.out.println("TestController.login post ��û�� ==========");
		return "login";
	}
	

}
