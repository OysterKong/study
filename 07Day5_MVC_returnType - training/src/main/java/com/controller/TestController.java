package com.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.TestDTO;

@Controller
public class TestController {

	@RequestMapping(value="/aaa", method=RequestMethod.GET)
	public String aaa() {
		return "main";
	}
	
	@RequestMapping(value="/bbb", method=RequestMethod.GET)
	public String bbb( HttpServletRequest request) {
		request.setAttribute("test", "피카츄");
		return "redirect:aaa";  //redirect 시 request.setAttribute 전달 안됨
	}
	
	@RequestMapping(value="/ccc", method=RequestMethod.GET)
	public ModelAndView ccc() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("username", "유해진");
		mav.setViewName("main2");
		return mav;
	}
	
	@RequestMapping(value="/ddd", method=RequestMethod.GET)
	public TestDTO ddd() {
		TestDTO dto = new TestDTO();
		dto.setUserid("지상렬");
		dto.setPasswd("1234");
		return dto;
	}
	
	@RequestMapping(value="/eee", method=RequestMethod.GET)
	@ModelAttribute("xxx") // 키값
	public TestDTO ddd2() {
		TestDTO dto = new TestDTO();
		dto.setUserid("지상렬");
		dto.setPasswd("1234");
		return dto;
	}
	
	@RequestMapping(value="/fff", method=RequestMethod.GET)
	@ModelAttribute("yyy")
	public ArrayList<String> fff(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("양세찬");
		list.add("양세형");
		list.add("심형래");
		list.add("장도연");
		return list;
	}
	
	@RequestMapping(value="/ggg", method=RequestMethod.GET)
	public void ggg(Model m) {
		m.addAttribute("name", "지상렬");
		m.addAttribute("age", "50");
	}
	
	@RequestMapping(value="/hhh", method=RequestMethod.GET)
	public void hhh(HttpServletRequest request) {
		request.setAttribute("personname", "염경환");
		request.setAttribute("personage", "45");
		request.setAttribute("personname2", "지상렬");
		request.setAttribute("personage2", "50");
	}
	
	
	
	
	
	
	
}
