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
		request.setAttribute("test", "��ī��");
		return "redirect:aaa";  //redirect �� request.setAttribute ���� �ȵ�
	}
	
	@RequestMapping(value="/ccc", method=RequestMethod.GET)
	public ModelAndView ccc() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("username", "������");
		mav.setViewName("main2");
		return mav;
	}
	
	@RequestMapping(value="/ddd", method=RequestMethod.GET)
	public TestDTO ddd() {
		TestDTO dto = new TestDTO();
		dto.setUserid("�����");
		dto.setPasswd("1234");
		return dto;
	}
	
	@RequestMapping(value="/eee", method=RequestMethod.GET)
	@ModelAttribute("xxx") // Ű��
	public TestDTO ddd2() {
		TestDTO dto = new TestDTO();
		dto.setUserid("�����");
		dto.setPasswd("1234");
		return dto;
	}
	
	@RequestMapping(value="/fff", method=RequestMethod.GET)
	@ModelAttribute("yyy")
	public ArrayList<String> fff(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("�缼��");
		list.add("�缼��");
		list.add("������");
		list.add("�嵵��");
		return list;
	}
	
	@RequestMapping(value="/ggg", method=RequestMethod.GET)
	public void ggg(Model m) {
		m.addAttribute("name", "�����");
		m.addAttribute("age", "50");
	}
	
	@RequestMapping(value="/hhh", method=RequestMethod.GET)
	public void hhh(HttpServletRequest request) {
		request.setAttribute("personname", "����ȯ");
		request.setAttribute("personage", "45");
		request.setAttribute("personname2", "�����");
		request.setAttribute("personage2", "50");
	}
	
	
	
	
	
	
	
}
