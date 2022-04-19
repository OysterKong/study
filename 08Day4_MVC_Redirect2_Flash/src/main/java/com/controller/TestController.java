package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class TestController {
	
	@RequestMapping(value="/main", method=RequestMethod.GET)
	public String main() {
		System.out.println( "main ===================");
		return "main";
	}
	
	//redirect-flash<mvc:annotation-driven /> �ʿ���
	@RequestMapping(value="/flash", method=RequestMethod.GET)
	public String redirectFlash(RedirectAttributes m) {
		System.out.println("redirectFlash ȣ��============");
		m.addFlashAttribute("userid", "ȫ�浿");  //RedirectAttribute ����ϱ� ����
		//request.setAttribute�� ����
		
		//<mvc:annotation-driven /> �ʿ���
		//request.getAttribute ���, getParameter �Ұ���
		return "redirect:main"; //request �� redirect ���޵�
	}


	
}
