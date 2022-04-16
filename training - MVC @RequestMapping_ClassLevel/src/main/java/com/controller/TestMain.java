package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/jesus")
public class TestMain {
	
	@RequestMapping(value="/login")
	public String x() {
		System.out.println("TestMain.x() ø‰√ªµ  ====================");
		return "login";
	}

		

}
