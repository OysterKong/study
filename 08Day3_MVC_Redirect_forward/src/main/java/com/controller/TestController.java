package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class TestController {
	
	@RequestMapping(value="/main", method=RequestMethod.GET)
	public String main() {
		System.out.println( "main ===================");
		return "main";
	}
	
	//1. redirect �� request.getParameter("userid") ,  �Ķ���ͷ� ������ ���۵�.  getAttribute ��� �ȵ�
	@RequestMapping(value="/redirect", method=RequestMethod.GET)
	public String redirect(Model m, HttpServletRequest request) {
		System.out.println("redirect ȣ�� ============");
		m.addAttribute("userid", "ȫ�浿"); // url�� �Ķ���ͷ� ���� ( �ּ�â ) - getParameter�� ���� �� ����
		request.setAttribute("passwd", "1234"); // ���޵��� ����
		//return "redirect:main"; // main ���� redirect
		return "redirect:main?userid=abcd"; // main ���� redirect (userid�� abcd�� ��� , ���� 23���� m.addAttribute�� �ּ����� ����)
	}
	
	//2. forward �� request.getAttribute("userid") ,  �Ķ���ͷ� ������ ���۵�.  getParameter ��� �ȵ�
	@RequestMapping(value="/forward", method=RequestMethod.GET)
	public String forward(Model m, HttpServletRequest request) {
		System.out.println("redirect ȣ�� ============");
		m.addAttribute("userid", "ȫ�浿");
		request.setAttribute("passwd", "1234"); 
		return "forward:main"; // main ���� forward , �ּҷ� ����, Object ������ ����
	}


	
}
