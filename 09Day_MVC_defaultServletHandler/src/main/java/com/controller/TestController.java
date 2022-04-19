package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //주의
public class TestController {
	
	@RequestMapping("/home")
	public String aaa() {
		return "main";
	}
	//servlet-context.xml 에서도   "/" => main.jsp

}
