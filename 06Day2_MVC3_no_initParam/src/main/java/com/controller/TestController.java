package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/kkk")
	public String aaa() {
		System.out.println("aaa 함수 실행 =======================");
		return "WEB-INF/views/home.jsp";
	}
	

}
