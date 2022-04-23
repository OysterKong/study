package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping(value="/gg")
	public String aaa( Map<String, String> map) {
		map.put("username", "홍석천");
		map.put("age", "45");
		map.put("address", "서울");
		return "main";
	}
	
	@RequestMapping(value="/gg2")
	public String bbb( Model m) {
		m.addAttribute("username", "지상렬");
		m.addAttribute("age", "49");
		m.addAttribute("address", "마포");
		return "main2";
	}

}
