package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	//@RequestMapping(value = "/login", method = RequestMethod.GET) //get방식 요청
	//get방식은 default ,  반드시 명시할 필요는 없음
	@RequestMapping(value = "/login") //get방식 요청
	public String loginFrom() {
		System.out.println("TestController.loginForm get 요청됨 ==========");
		return "loginForm";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST) //post방식 요청
	public String login() {
		System.out.println("TestController.login post 요청됨 ==========");
		return "login";
	}
	

}
