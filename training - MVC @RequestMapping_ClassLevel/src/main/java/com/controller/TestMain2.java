package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/christ")
public class TestMain2 {
	
	@RequestMapping(value="/login")  //�ּҺο�
	public String x() {
		System.out.println("TestMain2.x()  ��û�� ====================");
		return "login";
	}
	@RequestMapping(value="/main")  //�ּҺο�
	public String x2() {
		System.out.println("TestMain2.x2() ��û�� ====================");
		return "main";
	}
		

}
