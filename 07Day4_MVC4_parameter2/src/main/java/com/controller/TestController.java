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
	public String login1(LoginDTO dto) {  //권장하지 않음 ( 왜냐, 키값이 정확하지 않기때문)
		System.out.println("/login.post==============" + dto);
		//request.setAttribute 와 동일, key값은 자동으로 소문자로 시작하는 클래스이름, = loginDTO 이름이 없는 상태임
		return "login1";  // login.jsp  //데이터의 자동 forward => request.get
	}
	
	@RequestMapping(value= ("/login3"), method = RequestMethod.POST)
	public String login3 (@ModelAttribute("xxx") LoginDTO dto) {  //dto의 키 값을 xxx로 설정
		System.out.println("login3.post ======================" + dto);
		//request.setAttribute("xxx", dto)
		//이름이 없는 상태임
		return "login3";
	}
	
	@RequestMapping(value= ("/login2"), method = RequestMethod.POST)
	public ModelAndView login2 (LoginDTO dto) {  //dto의 키 값을 xxx로 설정
		System.out.println("login2.mav ======================" + dto);
		ModelAndView mav = new ModelAndView();
		mav.addObject("login", dto);
		mav.setViewName("login2");
		return mav;
	}
	
	@RequestMapping(value= ("/login4"), method = RequestMethod.POST)
	public String login5 (LoginDTO dto, Model m) {  //
		System.out.println("login4.post ======================" + dto);
		//이름이 없는 상태임
		m.addAttribute("login", dto);  //request.setAtt 와 동일
		return "login4";
	}


	
}
