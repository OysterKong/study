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
		list.add("ȫ�浿");
		list.add("�̼���");
		list.add("������");
		ModelAndView mav = new ModelAndView();
		mav.addObject("all", list);
		mav.setViewName("main");
		return mav;
		
	}
	
	@RequestMapping(value="/user2")
	public String login2(@ModelAttribute("xxx") ArrayList<String> list) {
		list.add("������");
		list.add("�����");
		list.add("����");
		return "main2";
	}

}
