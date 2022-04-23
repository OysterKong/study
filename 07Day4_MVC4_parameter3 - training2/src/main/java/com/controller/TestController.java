package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {
	
	@RequestMapping(value="/user")
	public ModelAndView login(ArrayList<String> list) {
		list.add("È«±æµ¿");
		list.add("ÀÌ¼ø½Å");
		list.add("À¯°ü¼ø");
		ModelAndView mav = new ModelAndView();
		mav.addObject("all", list);
		mav.setViewName("main");
		return mav;
		
	}
	
	@RequestMapping(value="/user2")
	public String login2(@ModelAttribute("xxx") ArrayList<String> list) {
		list.add("±èÁø¿ì");
		list.add("Áö»ó·Ä");
		list.add("±è»ó¹Î");
		return "main2";
	}

}
