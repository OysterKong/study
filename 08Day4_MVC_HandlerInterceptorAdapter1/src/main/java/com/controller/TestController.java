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
		System.out.println( "main ȣ��� ===================");
		return "main";
	}
	
	@RequestMapping(value="/aaa", method=RequestMethod.GET)
	public String aaa() {
		System.out.println( "aaa ȣ��� ===================");
		return "main";
	}
	



	
}
