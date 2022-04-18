package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;


@Controller
public class TestController {
	
	//1. ����Ÿ�� String => �丸 �˷���
	@RequestMapping(value=("/aaa"), method = RequestMethod.GET)
	public String aaa() {
		System.out.println("aaa()�Լ� �����============");
		return "main";  //main.jsp
	}
	
	//1-2. redirect : �����ּҷ� ���ο� ��û , �����ּ��� return �������� ���� �������� ��
	@RequestMapping(value="/hhh", method = RequestMethod.GET)
	public String hhh(HttpServletRequest request) {
		System.out.println("hhh()�Լ� �����============");
		request.setAttribute("test", "ȫ�浿");  //���� �ȵ�
		return "redirect:aaa";  //redirect �� request.setAttribute ������ �ȵ� ( �ݵ�� ������ �� )
	}
	
	//2. ModelAndView => Model �� �並 ��� �˷���
	@RequestMapping(value="/bbb", method = RequestMethod.GET)
	public ModelAndView bbb() {
		System.out.println("bbb()�Լ� �����============");
		ModelAndView mav = new ModelAndView();
		mav.addObject("username", "ȫ�浿");
		mav.setViewName("main2"); //main.jsp
		return mav;  //ModelAndView ����
	}
	
	
	//3. ����Ÿ�� DTO => �𵨸� �˷��� , view �� �����Ƿ� �����̳ʰ� ���� (ccc.jsp) : url �� ���������� �̸��� ��
	@RequestMapping(value="/ccc", method = RequestMethod.GET)
	public LoginDTO ccc() {
		System.out.println("/ccc �����============");
		LoginDTO dto = new LoginDTO();
		dto.setUserid("ȫ�浿");
		dto.setPasswd("1234");
		return dto;  // ���������� �ƴ�, Ű���� �ҹ��� class�̸� loginDTO, �������� ���� ���� ��
	}
	
	


	
}
