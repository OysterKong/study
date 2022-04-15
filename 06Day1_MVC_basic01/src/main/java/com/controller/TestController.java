package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //Servlet-context.xml에서 Bean생성 등록필요함  
public class TestController {
	
	@RequestMapping("/kkk")  //http://localhost:8900/test_1/kkk
	public String xxx()	{
		System.out.println("xxx()=======================");
		//리턴값은 jsp정보 - viewResolver 사용안하는 경우 페이지 경로/ 파일이름.jsp  모두 작성
		return "/WEB-INF/views/hello.jsp"; // 뷰페이지정보 경로/파일이름.jsp 문자열로 리턴
	}
	
	@RequestMapping("/kkk2")  //http://localhost:8900/test_1/kkk2
	public String aaa()	{
		System.out.println("kkk2 주소 요청=======================");
		//리턴값은 jsp정보 - viewResolver 사용안하는 경우 페이지 경로/ 파일이름.jsp  모두 작성
		return "/WEB-INF/views/home.jsp"; // 뷰페이지정보 경로/파일이름.jsp 문자열로 리턴
		//return "hello.jsp";
		//return "hello"; //
	}
	
	
	

}
