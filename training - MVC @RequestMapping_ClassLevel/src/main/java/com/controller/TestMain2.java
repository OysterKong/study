package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/christ")
public class TestMain2 {
	
	@RequestMapping(value="/login")  //林家何咯
	public String x() {
		System.out.println("TestMain2.x()  夸没凳 ====================");
		return "login";
	}
	@RequestMapping(value="/main")  //林家何咯
	public String x2() {
		System.out.println("TestMain2.x2() 夸没凳 ====================");
		return "main";
	}
		

}
