package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class TestController {
	
	// main.jsp �� �����ϱ� ���� interceptor Ŭ������ ���� ��ġ�� ����
	
	@RequestMapping(value="/main", method=RequestMethod.GET)
	public String main() {
		System.out.println( "TestController.main ȣ��� ===================");
		return "main";  //interceptor => login.jsp �����
	}
	
	@RequestMapping(value="/loginForm", method=RequestMethod.GET)
	public String loginForm() {
		System.out.println( "TestController.loginForm ȣ��� ===================");
		return "loginForm";  //interceptor => login.jsp �����
	}
	



	
}
