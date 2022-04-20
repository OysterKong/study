package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	//home : interceptor �� ���� session�α��� ���� ������ main.jsp
	// �α��� ������ ���� ��� longinForm.jsp
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String main() { //���ͼ��� ó��
		System.out.println("HomeController.main ȣ��");
		return "main";
	}

}