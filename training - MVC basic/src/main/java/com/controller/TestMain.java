package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestMain {
	
	@RequestMapping("/aaa")  //�ּҺο�
	public String xxx() {
		System.out.println("xxx()====================");
		return "/WEB-INF/views/hello.jsp";
	}
		
		@RequestMapping("/bbb")  //�ּҺο�
		public String xxx2() {
			System.out.println("xxx2()================");
			return "/WEB-INF/views/hello2.jsp" ;
	}

}
