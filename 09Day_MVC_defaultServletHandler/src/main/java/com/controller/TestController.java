package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //����
public class TestController {
	
	@RequestMapping("/home")
	public String aaa() {
		return "main";
	}
	//servlet-context.xml ������   "/" => main.jsp

}
