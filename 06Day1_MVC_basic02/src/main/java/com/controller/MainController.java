package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	
	@RequestMapping("/aaa")
	public String aaa() {
		System.out.println("aaa()함수 호출===========================");
		return "home";  //servlet-context.xml 에 viewResolver 
		//  prefix "/WEB-INF/views/"+home + "suffix .jsp"
		// "/WEB-INF/views/home.jsp"
	}
	@RequestMapping("/aaa2")
	public String bbb() {
		System.out.println("aaa2()함수 호출===========================");
		return "test";  //servlet-context.xml 에 viewResolver 
		//  prefix "/WEB-INF/views/"+home + "suffix .jsp"
		// "/WEB-INF/views/home.jsp"
	}

}
