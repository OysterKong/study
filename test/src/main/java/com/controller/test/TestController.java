package com.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/aaa")
	public String test() {
		System.out.println("test ȣ????");
		return "home";
	}

}
