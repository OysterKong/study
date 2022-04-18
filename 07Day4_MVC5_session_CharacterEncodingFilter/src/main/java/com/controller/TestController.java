package com.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dto.LoginDTO;



@Controller
public class TestController {
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		System.out.println("logout Session.invalidate()===========");
		session.invalidate();
		//return "loginForm";
		return "redirect:login";  //login.jsp�� �ƴ� /login �ּҷ� get ��� �ٽ� ��û  (redirect�� get���)
	}
	
	@RequestMapping(value="/login")
	public String login() {
		System.out.println("loginForm() ===============");
		return "loginForm";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login(LoginDTO dto, HttpSession session) {  //�Ű������� ��������
		System.out.println("login Session���� ===============" + dto);
		session.setAttribute("login", dto);
		return "login";
	}
	
	@RequestMapping(value="/login2", method = RequestMethod.POST)
	public String login2(LoginDTO dto, HttpServletRequest request) {  //�Ű������� ��������
		HttpSession session = request.getSession();
		System.out.println("login2 Session���� ===============" + dto);
		session.setAttribute("login", dto);
		return "login";
	}
	

	
}
