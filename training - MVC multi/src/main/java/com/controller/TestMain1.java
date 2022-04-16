package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestMain1 {

	@RequestMapping("/jesus")
	public String aaa() {
		System.out.println("aaa() »£√‚µ  ==================");
		return "/WEB-INF/views/hello.jsp";
	}

}
