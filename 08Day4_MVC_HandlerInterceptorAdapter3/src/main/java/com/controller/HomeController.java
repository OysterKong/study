package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	//home : interceptor 를 통해 session로그인 정보 있으면 main.jsp
	// 로그인 정보가 없는 경우 longinForm.jsp
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String main() { //인터셉터 처리
		System.out.println("HomeController.main 호출");
		return "main";
	}

}
