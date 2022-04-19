package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class TestController {
	
	// main.jsp 를 연결하기 전에 interceptor 클래스를 먼저 거치는 구조
	
	// main : interceptor 를거쳐 session 로그인 정보 있으면 main.jsp
	// 로그인 정보가 없는 경우 longinForm.jsp
	@RequestMapping(value="/main", method=RequestMethod.GET)
	public String main() {
		System.out.println( "TestController.main 호출됨 ===================");
		return "main";  //interceptor => login.jsp 변경됨
	}
	
	@RequestMapping(value="/loginForm", method=RequestMethod.GET)
	public String loginForm() {
		System.out.println( "TestController.loginForm 호출됨 ===================");
		return "loginForm";  //loginForm.jsp
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public ModelAndView login(String userid, String passwd, HttpSession session) {
		System.out.println("TestController.login 호출됨 ===================");
		session.setAttribute("login", userid); //인터셉터에서 활용함
		ModelAndView mav = new ModelAndView();
		mav.addObject("userid", userid);
		mav.addObject("passwd", passwd);
		mav.setViewName("logined"); //logined.jsp
		return mav;
	}
	



	
}
