package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestMain {
	
	@RequestMapping("/aaa")  //林家何咯
	public String xxx() {
		System.out.println("xxx()====================");
		return "/WEB-INF/views/hello.jsp";
	}
		
		@RequestMapping("/bbb")  //林家何咯
		public String xxx2() {
			System.out.println("xxx2()================");
			return "/WEB-INF/views/hello2.jsp" ;
	}

}
