package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {
	
	@ModelAttribute("gg")
	public ArrayList<String> getList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("È«±æµ¿");
		list.add("ÀÌ¼ø½Å");
		list.add("À¯°ü¼ø");
		return list;
		
	}
	
	@RequestMapping(value="/user2")
	public String addList2(@ModelAttribute("gg") ArrayList<String> list) {
		System.out.println("list Ãß°¡");
		list.add("±èÁø¿ì");
		list.add("Áö»ó·Ä");
		list.add("±è»ó¹Î");
		return "main2";
	}
	
	@RequestMapping(value="/user3")
	public String addList3(@ModelAttribute("gg") ArrayList<String> list) {
		System.out.println("list Ãß°¡");
		list.add("±èÁ¾¹Î");
		list.add("ÃÖ³«ºÀ");
		list.add("±è¼ºÈÆ");
		return "main2";
	}

}
