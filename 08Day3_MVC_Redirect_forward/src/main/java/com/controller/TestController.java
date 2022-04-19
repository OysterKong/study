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
	
	//1. redirect 시 request.getParameter("userid") ,  파라미터로 데이터 전송됨.  getAttribute 사용 안됨
	@RequestMapping(value="/redirect", method=RequestMethod.GET)
	public String redirect(Model m, HttpServletRequest request) {
		System.out.println("redirect 호출 ============");
		m.addAttribute("userid", "홍길동"); // url에 파라미터로 전송 ( 주소창 ) - getParameter로 뽑을 수 있음
		request.setAttribute("passwd", "1234"); // 전달되지 않음
		//return "redirect:main"; // main 으로 redirect
		return "redirect:main?userid=abcd"; // main 으로 redirect (userid에 abcd를 담아 , 먼저 23번쨰 m.addAttribute를 주석으로 막고)
	}
	
	//2. forward 시 request.getAttribute("userid") ,  파라미터로 데이터 전송됨.  getParameter 사용 안됨
	@RequestMapping(value="/forward", method=RequestMethod.GET)
	public String forward(Model m, HttpServletRequest request) {
		System.out.println("redirect 호출 ============");
		m.addAttribute("userid", "홍길동");
		request.setAttribute("passwd", "1234"); 
		return "forward:main"; // main 으로 forward , 주소로 전달, Object 전달의 문제
	}


	
}
