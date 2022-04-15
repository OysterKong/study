package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //Servlet-context.xml���� Bean���� ����ʿ���  
public class TestController {
	
	@RequestMapping("/kkk")  //http://localhost:8900/test_1/kkk
	public String xxx()	{
		System.out.println("xxx()=======================");
		//���ϰ��� jsp���� - viewResolver �����ϴ� ��� ������ ���/ �����̸�.jsp  ��� �ۼ�
		return "/WEB-INF/views/hello.jsp"; // ������������ ���/�����̸�.jsp ���ڿ��� ����
	}
	
	@RequestMapping("/kkk2")  //http://localhost:8900/test_1/kkk2
	public String aaa()	{
		System.out.println("kkk2 �ּ� ��û=======================");
		//���ϰ��� jsp���� - viewResolver �����ϴ� ��� ������ ���/ �����̸�.jsp  ��� �ۼ�
		return "/WEB-INF/views/home.jsp"; // ������������ ���/�����̸�.jsp ���ڿ��� ����
		//return "hello.jsp";
		//return "hello"; //
	}
	
	
	

}
