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
		return "main";  //최종
	}

	@RequestMapping("/aaa")
	public ModelAndView xxx2() {
		System.out.println("/aaa=======================");
		ModelAndView mav = new ModelAndView(); // ModelandVeiw 는 직접 new , 객체생성 후 저장, 리턴
		mav.addObject("username", "홍길동");  //request.setAttribute 와 동일  => request.getAttribute 로 뽑아야함
		mav.addObject("age", 20);
		LoginDTO dto = new LoginDTO("test"); //loginDTO 의 name 맴버변수에 test 를 넣고
		mav.addObject("login", dto); //object 저장  ( login이라는 키로 dto값(name에 test가 들어있는)을 저장 )
		mav.setViewName("main2"); // view페이지 :  WEB-INF/views/main2.jsp   ( /aaa로 갈 시 이동/연동하는 페이지 )
		return mav;   //ModelAndView 리턴
	}

	
}
