package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondController {
	
	@RequestMapping("/kkk2")  //FirstController 의 kkk와 겹치면 안됨 ( 충돌남 )
	public String xxx() {
		System.out.println("SecondController.xxx 메서드 호출");
		return "WEB-INF/views/hello.jsp"; 
	
	}
	

}
