package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestMain2 {
	
	@RequestMapping("/christ")
	public String bbb() {
		System.out.println("bbb() »£√‚µ  ===============");
		return "WEB-INF/views/hello.jsp";
	}
	

}
