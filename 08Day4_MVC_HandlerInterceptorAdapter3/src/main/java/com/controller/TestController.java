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
	
	// main.jsp �� �����ϱ� ���� interceptor Ŭ������ ���� ��ġ�� ����
	
	// main : interceptor ������ session �α��� ���� ������ main.jsp
	// �α��� ������ ���� ��� longinForm.jsp
	@RequestMapping(value="/main", method=RequestMethod.GET)
	public String main() {
		System.out.println( "TestController.main ȣ��� ===================");
		return "main";  //interceptor => login.jsp �����
	}
	
	@RequestMapping(value="/loginForm", method=RequestMethod.GET)
	public String loginForm() {
		System.out.println( "TestController.loginForm ȣ��� ===================");
		return "loginForm";  //loginForm.jsp
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public ModelAndView login(String userid, String passwd, HttpSession session) {
		System.out.println("TestController.login ȣ��� ===================");
		session.setAttribute("login", userid); //���ͼ��Ϳ��� Ȱ����
		ModelAndView mav = new ModelAndView();
		mav.addObject("userid", userid);
		mav.addObject("passwd", passwd);
		mav.setViewName("logined"); //logined.jsp
		return mav;
	}
	



	
}
