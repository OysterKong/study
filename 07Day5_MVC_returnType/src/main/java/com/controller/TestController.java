package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;


@Controller
public class TestController {
	
	//1. 리턴타입 String => 뷰만 알려줌
	@RequestMapping(value=("/aaa"), method = RequestMethod.GET)
	public String aaa() {
		System.out.println("aaa()함수 실행됨============");
		return "main";  //main.jsp
	}
	
	//1-2. redirect : 매핑주소로 새로운 요청 , 매핑주소의 return 페이지가 응답 페이지가 됨
	@RequestMapping(value="/hhh", method = RequestMethod.GET)
	public String hhh(HttpServletRequest request) {
		System.out.println("hhh()함수 실행됨============");
		request.setAttribute("test", "홍길동");  //전달 안됨
		return "redirect:aaa";  //redirect 시 request.setAttribute 전달이 안됨 ( 반드시 주의할 것 )
	}
	
	//2. ModelAndView => Model 과 뷰를 모두 알려줌
	@RequestMapping(value="/bbb", method = RequestMethod.GET)
	public ModelAndView bbb() {
		System.out.println("bbb()함수 실행됨============");
		ModelAndView mav = new ModelAndView();
		mav.addObject("username", "홍길동");
		mav.setViewName("main2"); //main.jsp
		return mav;  //ModelAndView 리턴
	}
	
	
	//3. 리턴타입 DTO => 모델만 알려줌 , view 는 없으므로 컨테이너가 유추 (ccc.jsp) : url 이 뷰페이지의 이름이 됨
	@RequestMapping(value="/ccc", method = RequestMethod.GET)
	public LoginDTO ccc() {
		System.out.println("/ccc 실행됨============");
		LoginDTO dto = new LoginDTO();
		dto.setUserid("홍길동");
		dto.setPasswd("1234");
		return dto;  // 뷰페이지가 아님, 키값은 소문자 class이름 loginDTO, 뷰페이지 설정 없을 시
	}
	
	


	
}
