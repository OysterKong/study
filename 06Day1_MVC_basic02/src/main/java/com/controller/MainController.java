package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	
	@RequestMapping("/aaa")
	public String aaa() {
		System.out.println("aaa()�Լ� ȣ��===========================");
		return "home";  //servlet-context.xml �� viewResolver 
		//  prefix "/WEB-INF/views/"+home + "suffix .jsp"
		// "/WEB-INF/views/home.jsp"
	}
	@RequestMapping("/aaa2")
	public String bbb() {
		System.out.println("aaa2()�Լ� ȣ��===========================");
		return "test";  //servlet-context.xml �� viewResolver 
		//  prefix "/WEB-INF/views/"+home + "suffix .jsp"
		// "/WEB-INF/views/home.jsp"
	}

}
