package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {
	
	@RequestMapping("/main")
	public String xx() {
		System.out.println("main()======================");
		return "main";  //����
	}

	@RequestMapping("/aaa")
	public ModelAndView xxx2() {
		System.out.println("/aaa=======================");
		ModelAndView mav = new ModelAndView(); // ModelandVeiw �� ���� new , ��ü���� �� ����, ����
		mav.addObject("username", "ȫ�浿");  //request.setAttribute �� ����  => request.getAttribute �� �̾ƾ���
		mav.addObject("age", 20);
		LoginDTO dto = new LoginDTO("test"); //loginDTO �� name �ɹ������� test �� �ְ�
		mav.addObject("login", dto); //object ����  ( login�̶�� Ű�� dto��(name�� test�� ����ִ�)�� ���� )
		mav.setViewName("main2"); // view������ :  WEB-INF/views/main2.jsp   ( /aaa�� �� �� �̵�/�����ϴ� ������ )
		return mav;   //ModelAndView ����
	}

	
}
