package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {
	
	@RequestMapping(value="/user")
	public ModelAndView login() {
		System.out.println("/user ====================");
		ModelAndView mav = new ModelAndView();
		mav.addObject("username", "�̼���");
		mav.addObject("age", 30);
		LoginDTO dto = new LoginDTO("������");
		mav.addObject("loginDTO", dto);
		mav.setViewName("main");
		return mav;
	}

}
