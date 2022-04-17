package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestMain {
	
	@RequestMapping(value="/")
	public String x() {
		System.out.println("TestMain/");
		return "login";
	}
	@RequestMapping(value="/login", params = "jesus")
	public String x2() {
		System.out.println("TestMain/login?jesus");
		return "login";
	}
	@RequestMapping(value="/login", params = "christ")
	public String x3() {
		System.out.println("TestMain/login?christ");
		return "login";
	}
	@RequestMapping(value="/login", params = "jesus==christ")
	public String x4() {
		System.out.println("TestMain.login?jesus==christ");
		return "login";
	}
	@RequestMapping(value="/login", method=RequestMethod.GET, params = "jesus==christ")
	public String x5() {
		System.out.println("TestMain.login?jesus==christ");
		return "login";
	}

}
