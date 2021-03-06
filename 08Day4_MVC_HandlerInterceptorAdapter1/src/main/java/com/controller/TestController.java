package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class TestController {
	
	// main.jsp 를 연결하기 전에 interceptor 클래스를 먼저 거치는 구조
	
	@RequestMapping(value="/main", method=RequestMethod.GET)
	public String main() {
		System.out.println( "main 호출됨 ===================");
		return "main";
	}
	
	@RequestMapping(value="/aaa", method=RequestMethod.GET)
	public String aaa() {
		System.out.println( "aaa 호출됨 ===================");
		return "main";
	}
	



	
}
