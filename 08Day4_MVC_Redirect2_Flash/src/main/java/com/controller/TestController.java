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
	
	//redirect-flash<mvc:annotation-driven /> 필요함
	@RequestMapping(value="/flash", method=RequestMethod.GET)
	public String redirectFlash(RedirectAttributes m) {
		System.out.println("redirectFlash 호출============");
		m.addFlashAttribute("userid", "홍길동");  //RedirectAttribute 사용하기 위해
		//request.setAttribute와 동일
		
		//<mvc:annotation-driven /> 필요함
		//request.getAttribute 사용, getParameter 불가능
		return "redirect:main"; //request 가 redirect 전달됨
	}


	
}
