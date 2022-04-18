package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {
	
	@RequestMapping("/login")
	public String login() {
		System.out.println("loginForm======================");
		return "loginForm";
		
	}
	@RequestMapping(value= ("/login1"), method= RequestMethod.POST)
	public String login1(LoginDTO dto) {  //�������� ���� ( �ֳ�, Ű���� ��Ȯ���� �ʱ⶧��)
		System.out.println("/login.post==============" + dto);
		//request.setAttribute �� ����, key���� �ڵ����� �ҹ��ڷ� �����ϴ� Ŭ�����̸�, = loginDTO �̸��� ���� ������
		return "login1";  // login.jsp  //�������� �ڵ� forward => request.get
	}
	
	@RequestMapping(value= ("/login3"), method = RequestMethod.POST)
	public String login3 (@ModelAttribute("xxx") LoginDTO dto) {  //dto�� Ű ���� xxx�� ����
		System.out.println("login3.post ======================" + dto);
		//request.setAttribute("xxx", dto)
		//�̸��� ���� ������
		return "login3";
	}
	
	@RequestMapping(value= ("/login2"), method = RequestMethod.POST)
	public ModelAndView login2 (LoginDTO dto) {  //dto�� Ű ���� xxx�� ����
		System.out.println("login2.mav ======================" + dto);
		ModelAndView mav = new ModelAndView();
		mav.addObject("login", dto);
		mav.setViewName("login2");
		return mav;
	}
	
	@RequestMapping(value= ("/login4"), method = RequestMethod.POST)
	public String login5 (LoginDTO dto, Model m) {  //
		System.out.println("login4.post ======================" + dto);
		//�̸��� ���� ������
		m.addAttribute("login", dto);  //request.setAtt �� ����
		return "login4";
	}


	
}
